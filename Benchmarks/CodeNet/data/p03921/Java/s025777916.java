import java.util.Arrays;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main{
	private void solve(){
		int n=gInt(),m=gInt();
		int[]lang=new int[m];
		Arrays.fill(lang,-1);
		UF uf=new UF(n);
		for(int p:rep(n)) {
			for(int v:rep(gInt())) {
				v=gInt()-1;
				if(lang[v]==-1)
					lang[v]=p;
				uf.connect(lang[v],p);
			}
		}
		System.out.println(uf.groupSize(0)==n?"YES":"NO");
	}
	class UF{
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


	public static void main(String[]$){
		new Main().solve();
		System.out.flush();
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
	static Range rep(int f,int t){
		return new Range(f,t);
	}
	static class Range implements Iterable<Integer>,PrimitiveIterator.OfInt{
		int from,to,c;
		Range(int from,int to){
			this.from=from;
			this.to=to;
			this.c=from;
		}
		Range(int n){
			this(0,n-1);
		}
		@Override
		public Iterator<Integer> iterator(){
			return this;
		}
		@Override
		public boolean hasNext(){
			return c<=to;
		}
		@Override
		public int nextInt(){
			return c++;
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