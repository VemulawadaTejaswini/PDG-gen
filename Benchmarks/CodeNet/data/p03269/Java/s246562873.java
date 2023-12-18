import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main{
	static Scanner s=new Scanner(System.in);

	void solve(){
		int n=gInt()-1;
		String l=Integer.toBinaryString(n);

		long lines=l.length()*2
				+l.length()+Integer.bitCount(n)-1;

		System.out.println(l.length()*2+2+" "+lines);

		boolean f=l.contains("0");

		for(int i=0;i<l.length()-1;++i){
			int V=i+1;
			System.out.println(V+" "+(V+1)+" "+(f?(1<<i):0));
			System.out.println(V+" "+(V+1)+" "+0);
		}

		for(int i=0;i<l.length();++i){
			int V=l.length()+i+1;
			if(l.charAt(l.length()-1-i)=='1'){
				System.out.println(V+" "+(V+1)+" "+(1<<i));
				if(i!=l.length()-1)
					System.out.println(V+" "+(V+1)+" "+0);
			}else{
				System.out.println(V+" "+(V+1)+" "+0);
			}
		}
		System.out.println(l.length()+" "+(l.length()*2+2)+" "+0);
		System.out.println(l.length()*2+1+" "+(l.length()*2+2)+" "+0);
	}

	public static void main(String[] A){
		new Main().solve();
	}

	static int gInt(){
		return Integer.parseInt(s.next());
	}
	static long gLong(){
		return Long.parseLong(s.next());
	}
	static double gDouble(){
		return Double.parseDouble(s.next());
	}

	SupplyingIterator<Integer> ints(int n){
		return new SupplyingIterator<>(n,Main::gInt);
	}
	SupplyingIterator<Long> longs(int n){
		return new SupplyingIterator<>(n,Main::gLong);
	}
	SupplyingIterator<Double> doubles(int n){
		return new SupplyingIterator<>(n,Main::gDouble);
	}
	SupplyingIterator<String> strs(int n){
		return new SupplyingIterator<>(n,s::next);
	}

	Range rep(int i){
		return new Range(i);
	}
	Range rep(int f,int t,int d){
		return new Range(f,t,d);
	}
	Range rep(int f,int t){
		return rep(f,t,1);
	}
	Range rrep(int f,int t){
		return rep(t,f,-1);
	}

	IntStream REP(int n){
		return REP(0,n-1);
	}
	IntStream REP(int l,int r){
		return IntStream.rangeClosed(l,r);
	}

	IntStream INTS(int n){
		return IntStream.generate(Main::gInt).limit(n);
	}
	Stream<String> STRS(int n){
		return Stream.generate(s::next).limit(n);
	}

}
class SupplyingIterator<T> implements Iterable<T>,Iterator<T>{
	int t;
	Supplier<T> supplier;

	SupplyingIterator(int t,Supplier<T> supplier){
		this.t=t;
		this.supplier=supplier;
	}

	@Override
	public Iterator<T> iterator(){
		return this;
	}

	@Override
	public boolean hasNext(){
		return t>0;
	}

	@Override
	public T next(){
		--t;
		return supplier.get();
	}
}

class Range implements Iterable<Integer>,PrimitiveIterator.OfInt{
	int to,cur,d;

	Range(int from,int to,int d){
		this.cur=from-d;
		this.to=to;
		this.d=d;
	}

	Range(int n){
		this(0,n-1,1);
	}

	@Override
	public Iterator<Integer> iterator(){
		return this;
	}

	@Override
	public boolean hasNext(){
		return cur+d==to||(cur!=to&&(cur<to==cur+d<to));
	}

	@Override
	public int nextInt(){
		return cur+=d;
	}
}
