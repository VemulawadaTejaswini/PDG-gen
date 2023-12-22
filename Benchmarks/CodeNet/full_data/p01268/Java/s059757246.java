import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator.OfInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static final Scanner s=new Scanner(System.in);
	public static void main(String[]__){
		ArrayList<Integer> primes=new ArrayList<>();
		new PrimeIterator(114514).forEach(primes::add);
		while(true){
			int n=s.nextInt(),p=s.nextInt();
			if(n+p==-2)return;
			ArrayList<Integer> twoPrimesSums=new ArrayList<>();
			int index=Collections.binarySearch(primes,n);
			index=index<0?~index:index+1;
			for(int i=0;i<=p;i++)
				for(int j=i;j<=p;j++)
					twoPrimesSums.add(primes.get(index+i)+primes.get(index+j));
			twoPrimesSums.sort(Comparator.naturalOrder());
			//System.out.println(twoPrimesSums);
			System.out.println(twoPrimesSums.get(p-1));
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