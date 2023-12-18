import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main{
	private void solve(){
		int n=gInt(),hp=gInt();
		TreeMap<Integer,Long>m=new TreeMap<>();
		for(int v:rep(n)) {
			m.merge(gInt(),1145141919810L,Long::sum);
			m.merge(gInt(),1L,Long::sum);
		}
		int r=0;
		for(;hp>0;) {
			Entry<Integer,Long> highest=m.pollLastEntry();
			int damage=highest.getKey();
			long remain=highest.getValue();

			long times=Math.min(remain,(hp+damage-1)/damage);
			r+=times;
			hp-=times*damage;
		}
		System.out.println(r);
	}

	public static void main(String[] $){
		new Main().solve();
		System.out.flush();
	}


	static class System{
		private static final InputStream	in	=java.lang.System.in;
		private static final PrintWriter	out	=new PrintWriter(java.lang.System.out,false);
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