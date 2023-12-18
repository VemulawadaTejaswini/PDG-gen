import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main{
	static Scanner s=new Scanner(System.in);
	static long[] fal_rnd(int size){
		AtomicInteger l=new AtomicInteger(-1),r=new AtomicInteger(size);
		long[] res=new long[size];
		INS(size).unordered().parallel().mapToLong(Long::parseLong).forEach(v->res[ThreadLocalRandom.current().nextBoolean()?l.incrementAndGet():r.decrementAndGet()]=v);
		return res;
	}
	static IntStream REPS(int v){
		return IntStream.range(0,v);
	}
	static Stream<String> INS(long size){
		return StreamSupport.stream(Spliterators.spliterator(s,size,Spliterator.NONNULL&Spliterator.IMMUTABLE),false).limit(size);
	}
	
	public static void main(String[] __){
		int n=s.nextInt();
		ArrayDeque<Long> deque =INS(n*3).parallel().map(Long::parseLong).collect(Collectors.toCollection(ArrayDeque<Long>::new));
		PriorityQueue<Long> l=new PriorityQueue<>(),r=new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0;i<n;i++) {
			l.add(deque.pollFirst());
			r.add(deque.pollLast());
		}
		for(int i=0;i<n;i++) {
			if(deque.peekFirst()-l.peek()>r.peek()-deque.peekLast()) {
				l.poll();
				l.add(deque.pollFirst());
			}else {
				r.poll();
				r.add(deque.pollLast());
			}
		}
		System.out.println(
				l.parallelStream().mapToLong(v->v).sum()
				-r.parallelStream().mapToLong(v->v).sum()
				);
	}
}

