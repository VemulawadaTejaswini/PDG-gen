import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		long K=sc.nextLong();
		long nagasa=0;
		ArrayDeque<Long> Q=new ArrayDeque<Long>();
		for(int i=0; i<N; i++) {
			Q.add(sc.nextLong());
			nagasa+=Q.getLast();
		}
		int[] junjo=new int[N];
		int counter=0;
		int ka=1;
		int la=N-1;
		for(int i=0; i<N-1; i++) {
			if(nagasa>=K) {
				if(Q.getFirst()<=Q.getLast()) {
					nagasa-=Q.getFirst();
					Q.removeFirst();
					junjo[i]=ka;
					ka++;
				}
				else {
					nagasa-=Q.getLast();
					Q.removeLast();
					junjo[i]=la;
					la--;
				}
			}
			else {
				pl("Impossible");
				System.exit(0);
			}
		}
		StringBuilder sb=new StringBuilder();
		sb.append("Possible\n");
		for(int i=0; i<N-1; i++) {
			sb.append(junjo[i]);
			sb.append("\n");
		}
		pl(sb.toString());
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
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}
