import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main{
	static Scanner s=new Scanner(System.in);
	
	void solve(){
		int n=gInt();
		char[][]f=new char[n][n];
		for(int i:rep(n))
			s.next().getChars(0,n,f[i],0);
		long r=0;
		for(int i:rep(n)) {
			if(_solve(n,f,i,0)) {
//				System.err.println(i+" 0");
				r+=n-i;
			}
		}
		for(int j:rep(1,n)) {
			if(_solve(n,f,0,j)) {
//				System.err.println("0 "+j);
				r+=n-j;
			}
		}
		System.out.println(r);
	}

	private boolean _solve(int n,char[][] f,int I,int J){
		for(int i:rep(1,n-1)) {
			for(int j:rep(0,i-1)) {
				if(f[(i+I)%n][(j+J)%n]!=f[(j+J)%n][(i+I)%n])
					return false;
			}
		}
		return true;
	}

	public static void main(String[] $){
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
		return Range.rep(i);
	}
	Range rep(int f,int t,int d){
		return Range.rep(f,t,d);
	}
	Range rep(int f,int t){
		return rep(f,t,1);
	}
	Range rrep(int f,int t){
		return rep(t,f,-1);
	}

	IntStream REP(int v){
		return IntStream.range(0,v);
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
	int			t;
	Supplier<T>	supplier;

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

	static Range rep(int i){
		return new Range(i);
	}
	static Range rep(int f,int t,int d){
		return new Range(f,t,d);
	}
	static Range rep(int f,int t){
		return rep(f,t,1);
	}
	static Range rrep(int f,int t){
		return rep(f,t,-1);
	}

}
