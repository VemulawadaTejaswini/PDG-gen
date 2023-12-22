import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main{
	static final Scanner s=new Scanner(System.in);
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
		int[] p=new int[114514*3];
		PrimeIterator pi=new PrimeIterator(114514*3);
		for(int i:pi)
			p[i]++;
		Arrays.parallelPrefix(p,Integer::sum);
		int v;
		while((v=s.nextInt())!=0){
			System.out.println(p[v*2]-p[v]);
		}
	}
	static class PrimeIterator implements Iterable<Integer>,PrimitiveIterator.OfInt{
		private BitSet	bitSet;
		private int		nextV;
		private int		limit;
		public PrimeIterator(int limit){
			this.limit=limit;
			bitSet=new BitSet(limit+1);
			nextV=limit<2?-1:2;
		}
		@Override
		public boolean hasNext(){
			return nextV>=0;
		}
		@Override
		public int nextInt(){
			if(!hasNext())
				throw new NoSuchElementException();
			int r=nextV;
			final long buf=nextV;
			if(buf*buf<=limit)
				for(int i=nextV*nextV;i<=limit;i+=nextV)
				bitSet.set(i);
			nextV=bitSet.nextClearBit(nextV+1);
			if(nextV>limit) nextV=-1;
			return r;
		}
		@Override
		public Iterator<Integer> iterator(){
			return this;
		}
	}
}