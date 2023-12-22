import java.util.BitSet;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator.OfInt;
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
			if(a+d+n==0) return;
			System.out.println(IntStream.iterate(a,i->i+d).filter(set::contains).skip(n-1).findFirst().getAsInt());
		}
	}
}
class PrimeIterator implements Iterable<Integer>,OfInt{
	private BitSet	bs;
	private int		next,lim;
	public PrimeIterator(int limit){
		lim=limit;
		bs=new BitSet(lim+1);
		next=lim<2?-1:2;
	}
	@Override
	public boolean hasNext(){
		return next>0;
	}
	@Override
	public int nextInt(){
		if(!hasNext()) throw new NoSuchElementException();
		int r=next;
		if(1L*r*r<=lim)
			IntStream.iterate(r*r,i->i+r).limit(lim/r-r+1).forEach(bs::set);
		if((next=bs.nextClearBit(r+1))>lim) next=-1;
		return r;
	}
	@Override
	public OfInt iterator(){
		return this;
	}
}