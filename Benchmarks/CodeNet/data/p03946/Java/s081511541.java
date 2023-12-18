import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		int T=sc.nextInt();
		HashMap<Integer,Integer> nedan=new HashMap<Integer,Integer>();	//多分Longしか使わない
		int[] ary=new int[N];
		for(int i=0; i<N; i++) {
			ary[i]=sc.nextInt();
			nedan.put(ary[i],i);
		}
		int min=114514810;
		int diff=0;
		min=ary[0];
		for(int i=1; i<N; i++) {
			diff=Math.max(diff, ary[i]-min);
			min=Math.min(min,ary[i]);
		}
		int kaisu=0;
		for(int i=1; i<N; i++) {
			int tmp=ary[i];
			if(tmp-diff>0) {
				if(nedan.containsKey(tmp-diff)) {
					if(nedan.get(tmp-diff)<i) {
						kaisu++;
					}
				}
			}
		}
		pl(kaisu);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	public static void pl() {
		System.out.println();
	}
}
