import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int a[][] = new int[3][3];
		for(int i=0;i<3;i++) {
			a[i] = fs.nextIntArray(3);
		}
		int n= fs.nextInt();
		for(int i=0;i<n;i++) {
			int b = fs.nextInt();
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					if(a[j][k]==b)a[j][k] = -1;
				}
			}
		}
		
		String ans = "No";
		//横
		for(int i=0;i<3;i++) {	
			if(a[i][0]==-1&&a[i][1]==-1&&a[i][2]==-1)ans = "Yes";
		}
		//縦
		for(int i=0;i<3;i++) {	
			if(a[0][i]==-1&&a[1][i]==-1&&a[2][i]==-1)ans = "Yes";
		}
		//斜め
		if(a[0][0]==-1&&a[1][1]==-1&&a[2][2]==-1)ans = "Yes";
		if(a[2][0]==-1&&a[1][1]==-1&&a[0][2]==-1)ans = "Yes";
		System.out.println(ans);
	}
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}