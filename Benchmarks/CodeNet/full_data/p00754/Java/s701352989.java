import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
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
		while(true){
			final String in=s.nextLine();
			if(in.equals(".")) break;
			System.out.println(solve(in));
		}
	}
	static String solve(String v){
		v=v.replaceAll("[^\\[\\]()]","");
		ArrayDeque<Character> deque=new ArrayDeque<>();
		char c;
		for(int i=0;i<v.length();i++){
			switch(c=v.charAt(i)){
			case '[':
			case '(':
				deque.add(c);
				break;
			case ']':
				if(deque.isEmpty()||deque.pollLast()!='[')
					return "no";
				break;
			case ')':
				if(deque.isEmpty()||deque.pollLast()!='(')
					return "no";
				break;
			}
		}
		return deque.isEmpty()?"yes":"no";
	}
}