import java.util.Arrays;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main{

	private void solve(){
		int[] c=new int[26];
		int h=gInt(),w=gInt();
		STRS(h).flatMapToInt(String::chars)
				.map(i->i-'a')
				.forEach(i->++c[i]);
		int one=(h%2)*(w%2);

		int two=(w%2==1?h/2*2:0)+(h%2==1?w/2*2:0);
		int four=h*w-one-two;

		System.err.println(one);
		System.err.println(two);
		System.err.println(four);
		System.err.println(Arrays.toString(c));
		for(int i:rep(26)) {
			four-=c[i]/4*4;
			c[i]%=4;
			if(four<0) {
				System.out.println("No");
				return;
			}
		}
		for(int i:rep(26)) {
			two-=c[i]/2*2;
			c[i]%=2;
			if(two<0) {
				System.out.println("No");
				return;
			}
		}
		for(int i:rep(26)) {
			one-=c[i];
			c[i]=0;
			if(one<0) {
				System.out.println("No");
				return;
			}
		}
		System.out.println(
				Arrays.stream(c).noneMatch(i->i>0)
				?"Yes":"No");
	}

	public static void main(String[]$){
		new Main().solve();
	}

	Scanner s=new Scanner(System.in);

	int gInt(){
		return Integer.parseInt(s.next());
	}
	long gLong(){
		return Long.parseLong(s.next());
	}
	double gDouble(){
		return Double.parseDouble(s.next());
	}

	SupplierIterator<Integer> ints(int n){
		return new SupplierIterator<>(n,this::gInt);
	}
	SupplierIterator<Long> longs(int n){
		return new SupplierIterator<>(n,this::gLong);
	}
	SupplierIterator<Double> doubles(int n){
		return new SupplierIterator<>(n,this::gDouble);
	}
	SupplierIterator<String> strs(int n){
		return new SupplierIterator<>(n,s::next);
	}

	static class SupplierIterator<T> implements Iterable<T>,Iterator<T>{
		int			t;
		Supplier<T>	supplier;

		SupplierIterator(int t,Supplier<T> supplier){
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

	static class Range implements Iterable<Integer>,PrimitiveIterator.OfInt{

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


	IntStream REP(int v){
		return IntStream.range(0,v);
	}
	IntStream REP(int l,int r){
		return IntStream.rangeClosed(l,r);
	}

	IntStream INTS(int n){
		return REP(n).map(i->gInt());
	}
	Stream<String> STRS(int n){
		return REP(n).mapToObj(i->s.next());
	}
}
