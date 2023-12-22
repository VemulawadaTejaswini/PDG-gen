import java.util.BitSet;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] __){
		TreeSet<Integer> set=new TreeSet<>();
		new PrimeIterator(1000000).forEach(set::add);
		while(true){
			int a=s.nextInt(),d=s.nextInt(),n=s.nextInt();
			if(a+d+n==0)return;
			System.out.println(
					IntStream.iterate(a,i->i+d).filter(set::contains).skip(n-1).findFirst().getAsInt());
		}
	}
}
class PrimeIterator implements Iterable<Integer>,PrimitiveIterator.OfInt{
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
	public PrimitiveIterator.OfInt iterator(){
		return this;
	}
}