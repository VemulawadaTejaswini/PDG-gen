import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int V=sc.nextInt();
		int E=sc.nextInt();
		long[] distance=new long[V*V];
		long[] nega=new long[V];
		long[] rinsetu=new long[V*V];
		long INF=10000000007L;
		Arrays.fill(rinsetu, INF);
		Arrays.fill(nega, INF);
		Arrays.fill(distance,INF);
		int start=0;
		nega[start]=0;
		for(int i=0; i<E; i++) {
			long from=sc.nextLong();
			long to=sc.nextLong();
			long cost=sc.nextLong();
			rinsetu[(int)(from*V+to)]=cost;
			distance[(int)(from*V+to)]=cost;
		}
		for(int i=0; i<V; i++) {
			distance[i*V+i]=0;
		}

		for(int i=0; i<V; i++) {
			boolean update=false;
			for(int j=0; j<V; j++) {
				for(int k=0; k<V*V; k++) {
					if(nega[k/V]<INF && nega[k%V]>nega[k/V]+rinsetu[k]) {
						nega[k%V]=nega[k/V]+rinsetu[k];
						update=true;
					}
				}
				if(update==false) {
					break;
				}
				else if(i==V-1) {
					pl("NEGATIVE CYCLE");
					System.exit(0);
				}
			}
		}
		for(int i=0; i<V; i++) {
			for(int j=0; j<V; j++) {
				for(int k=0; k<V; k++) {
					distance[j*V+k]=Math.min(distance[j*V+k], distance[j*V+i]+distance[i*V+k]);
					//要は、0-(V-1)までの数字のうち3つを選ぶってことしてるだけって感じする
				}
			}
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<V*V; i++) {
			if(i%V==0) {
				sb=new StringBuilder();
			}
			if(i%V==V-1) {
				if(distance[i]>=2000000001) {
					sb.append("INF");
				}
				else {
					sb.append(distance[i]);
				}
				pl(sb.toString());
			}
			if(distance[i]>=2000000001) {
				sb.append("INF ");
			}
			else {
				sb.append(distance[i]+" ");
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
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
}
