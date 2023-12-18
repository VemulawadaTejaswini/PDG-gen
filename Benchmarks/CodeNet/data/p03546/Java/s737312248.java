import java.util.Arrays;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Scanner;

class Main{
	public static void main(String[]$){
		int n=gInt()*gInt();
		int[][]f=new int[10][10];
		for(int i:rep(10))
			for(int j:rep(10))
				f[i][j]=gInt();
		for(int k:rep(10))
			for(int i:rep(10))
				for(int j:rep(10))
					f[i][j]=Math.min(f[i][j],f[i][k]+f[k][j]);
		int r=0;
		for(int v:rep(n)) {
			v=gInt();
			r+=v==-1?0:f[v][1];
		}
		System.out.println(r);
	}

	static Scanner s=new Scanner(System.in);
	static int gInt() {return Integer.parseInt(s.next());}
	static long gLong() {return Long.parseLong(s.next());}

	static Range rep(int i) {return new Range(i);}
	static Range rep(int f,int t) {return new Range(f,t);}
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
}