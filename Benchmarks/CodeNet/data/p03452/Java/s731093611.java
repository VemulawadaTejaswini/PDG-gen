import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main{

	static class Pair<A extends Comparable<A>,B extends Comparable<B>> implements Comparable<Pair<A,B>>{
		A	a;
		B	b;

		public Pair(A a,B b){
			this.a=a;
			this.b=b;
		}
		public Pair(Pair<A,B>p){
			this.a=p.a;
			this.b=p.b;
		}

		@Override
		public int hashCode(){
			final int prime=31;
			int result=1;
			result=prime*result+Objects.hashCode(a);
			result=prime*result+Objects.hashCode(b);
			return result;
		}

		@Override
		public boolean equals(Object obj){
			if(this==obj) return true;
			if(!(obj instanceof Pair))
				return false;
			Pair<?,?> other=(Pair<?,?>)obj;
			return Objects.equals(a,other.a)&&Objects.equals(b,other.b);
		}

		public Pair<B,A> swapped(){
			return new Pair<>(b,a);
		}

		@Override
		public int compareTo(Pair<A,B> o){
			int v;
			v=a.compareTo(o.a);
			if(v!=0)
				return v;
			v=b.compareTo(o.b);
			return v;
		}

		@Override
		public String toString(){
			return "P["+a.toString()+", "+b.toString()+"]";
		}
	}

	static Scanner s=new Scanner(System.in);

	private void solve(){
		HashMap<Integer,HashSet<Pair<Integer,Pair<Integer,Integer>>>>a=new HashMap<>();
		int n=gInt(),m=gInt();
		long[]pos=new long[n];
		final long DEFAULT=Long.MAX_VALUE;
		Arrays.fill(pos,DEFAULT);

		for(int q:rep(m)) {
			int l=gInt()-1,r=gInt()-1,d=gInt();

			a.computeIfAbsent(l,HashSet::new).add(new Pair<>(l,new Pair<>(r,d)));
			a.computeIfAbsent(r,HashSet::new).add(new Pair<>(r,new Pair<>(l,-d)));
		}

		a.entrySet().forEach(System.err::println);;

		ArrayDeque<Pair<Integer,Pair<Integer,Integer>>>d=new ArrayDeque<>();
		while(!a.isEmpty()) {
			d.addAll(a.remove(a.keySet().stream().findAny().get()));
			while(!d.isEmpty()) {
				Pair<Integer,Pair<Integer,Integer>> o=d.poll();
				if(pos[o.a]==DEFAULT) {
					pos[o.a]=0;
				}
				if(pos[o.b.a]==DEFAULT) {
					pos[o.b.a]=pos[o.a]+o.b.b;
					d.addAll(a.remove(o.b.a));
				}else if(pos[o.b.a]-pos[o.a]!=o.b.b) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}

	public static void main(String[]$){
		new Main().solve();
	}


	int abs(int v){
		return (v^(v>>31))-(v>>31);
	}
	long abs(long v){
		return (v^(v>>63))-(v>>63);
	}

	int gInt(){
		return Integer.parseInt(s.next());
	}
	long gLong(){
		return Long.parseLong(s.next());
	}
	double gDouble(){
		return Double.parseDouble(s.next());
	}

	SupplyingIterator<Integer> ints(int n){
		return new SupplyingIterator<>(n,this::gInt);
	}
	SupplyingIterator<Long> longs(int n){
		return new SupplyingIterator<>(n,this::gLong);
	}
	SupplyingIterator<Double> doubles(int n){
		return new SupplyingIterator<>(n,this::gDouble);
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
		return rep(f,t,-1);
	}

	IntStream REP(int v){
		return IntStream.range(0,v);
	}
	IntStream REP(int l,int r){
		return IntStream.rangeClosed(l,r);
	}

	IntStream INTS(int n){
		return IntStream.generate(this::gInt).limit(n);
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

