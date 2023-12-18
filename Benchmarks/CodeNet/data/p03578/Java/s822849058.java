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
		int N=sc.nextInt();
		int[] D=new int[N];
		for(int i=0; i<N; i++) {
			D[i]=sc.nextInt()*2;
		}
		int M=sc.nextInt();
		int[] T=new int[M];
		for(int i=0; i<M; i++) {
			T[i]=sc.nextInt()*2;
		}
		Arrays.sort(D);
		for(int i=0; i<M; i++) {
			int index=lowerBound(D,T[i]);
			if(index==-1) {
				pl("NO");
				System.exit(0);
			}
			else if(D[index]==T[i]) {
				D[index]--;
			}
			else if(D[index]!=T[i]) {
				pl("NO");
				System.exit(0);
			}
		}
		pl("YES");
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
	public static final int lowerBound(final int[] arr, final int value) {
		int low = 0;
		int high = arr.length;
		int mid;
		while (low < high) {
			mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
			if (arr[mid] < value) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		if(low<arr.length) {
			return low;
		}
		else {
			return -1;
		}
	}
}
