import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main{
	static class UF{
		public int[] uni;
		public UF(int size){
			uni=new int[size];
			Arrays.fill(uni,-1);
		}
		public int root(int t){
			if(uni[t]<0)
				return t;
			return uni[t]=root(uni[t]);
		}
		public boolean connect(int p,int c){
			p=root(p);
			c=root(c);
			if(p==c)
				return false;
			if(uni[p]>uni[c]){
				final int buf=c;
				c=p;
				p=buf;
			}
			uni[p]+=uni[c];
			uni[c]=p;
			return true;
		}
		public boolean isConnected(int a,int b){
			return root(a)==root(b);
		}
		public int groupSize(int t){
			return -uni[root(t)];
		}
	}

	class E{
		int treeno,cost;
	}

	private void solve(){
		int n=gInt();
		int[] cost=ints(n).toArray();
		UF treediv=new UF(n);
		for(int v:rep(gInt())) {
			int a=gInt(),b=gInt();
			treediv.connect(Math.min(a,b),Math.max(a,b));
		}
		HashMap<Integer,PriorityQueue<Integer>>m=new HashMap<>();
		for(int i=0;i<n;++i) {
			m.computeIfAbsent(treediv.root(i),PriorityQueue::new)
			.add(null)
		}
	}

	public static void main(String[] $){
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