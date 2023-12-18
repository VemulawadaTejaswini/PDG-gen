import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main{
	static Scanner s=new Scanner(System.in);

	class array{
		int[]a;
		public array(int[] a){
			this.a=a;
		}
		@Override
		public int hashCode(){
			int result=1;
			result=31*result+getOuterType().hashCode();
			result=31*result+Arrays.hashCode(a);
			return result;
		}
		@Override
		public boolean equals(Object obj){
			if(this==obj) return true;
			if(obj==null) return false;
			if(getClass()!=obj.getClass()) return false;
			array other=(array)obj;
			if(!getOuterType().equals(other.getOuterType())) return false;
			if(!Arrays.equals(a,other.a)) return false;
			return true;
		}
		private Main getOuterType(){
			return Main.this;
		}
	}

	void solve(){
		int h=gInt(),w=gInt();
		int[][]a=new int[h][w],b=new int[w][h];

		int[]c=new int[26];
		for(int i:rep(h)) {
			String v=s.next();
			for(int j:rep(w)) {
				c[a[i][j]=b[j][i]=v.charAt(j)-'a']++;
			}
		}
		boolean f=Arrays.stream(c).filter(i->i%2==1).count()<=1&&f(a)&&f(b);
		System.out.println(f?"YES":"NO");
	}
	boolean f(int[][]a){
		HashMap<array,Integer>m=new HashMap<>();
		for(int[]A:a)
			m.merge(new array(Arrays.stream(A).sorted().toArray()),1,Integer::sum);

		if(a.length%2==0)
			return m.values().stream().allMatch(o->o%2==0);

		array[] v=m.entrySet().stream()
				.filter(o->o.getValue()%2==1)
				.map(o->o.getKey())
				.toArray(array[]::new);
		if(v.length!=1)
			return false;

		int[]c=new int[26];
		for(int i:v[0].a)
			c[i]++;

		boolean f=false;
		for(int i:c) {
			if(i%2==1) {
				if(f)
					return false;
				f=true;
			}
		}
		return f;
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
