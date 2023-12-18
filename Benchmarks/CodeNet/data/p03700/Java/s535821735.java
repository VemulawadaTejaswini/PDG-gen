import java.util.Arrays;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main{

	private void solve(){
		int n=gInt(),a=gInt(),b=gInt(),h[]=ints(n).toArray();
		System.out.println(bin(1,1000000001,i->f(a,b,h,i)));
	}
	long bin(long l,long r,LongFunction<Long>f){
		while(true) {
			if(l==r-1)
				return l;
			long mid=(l+r)/2,v=f.apply(mid);
			if(v==0)
				return mid;
			else if(v>0)
				l=mid;
			else
				r=mid;
		}
	}
	long f(long a,long b,int[]h,long i){
		return Arrays.stream(h)
				.mapToLong(o->(Math.max(0,o-b*i)+a-b-1)/(a-b))
				.sum()
				-i;
	}

	public static class Merger<T>{
		private T v;
		private BinaryOperator<T>f;
		public Merger(T init,BinaryOperator<T>merge){
			v=init;
			f=merge;
		}
		public T update(T t) {
			return v=f.apply(v,t);
		}
		public T get() {
			return v;
		}
	}

	public static void main(String[]$){
		new Main().solve();
	}

	static Scanner s=new Scanner(System.in);


	static int gInt(){
		return s.nextInt();
	}

	static long gLong(){
		return s.nextLong();
	}

	static long gDouble(){
		return s.nextLong();
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
	}


	static IntStream REPS(int v){
		return IntStream.range(0,v);
	}

	static IntStream REPS(int l,int r){
		return IntStream.rangeClosed(l,r);
	}


	static IntStream ints(int n){
		return REPS(n).map(i->gInt());
	}

	static Stream<String> strs(int n){
		return REPS(n).mapToObj(i->s.next());
	}

}