import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		String S = next();
		int N = S.length();
		char[] C = S.toCharArray();
		int[] child = new int [N];
		Arrays.fill(child,1);

		for(int i=0;i<N;i++) {
			int ti = i;
			if(C[i]=='R')ti++;
			else if(C[i]=='L')ti--;

			if(C[ti]=='R')ti++;
			else if(C[ti]=='L')ti--;

			int tmp = child[i];
			child[i] = 0;
			child[ti] += tmp;

		}
		for(int i=N-1;0<=i;i--) {
			int ti = i;
			if(C[i]=='R')ti++;
			else if(C[i]=='L')ti--;

			if(C[ti]=='R')ti++;
			else if(C[ti]=='L')ti--;

			int tmp = child[i];
			child[i] = 0;
			child[ti] += tmp;


		}

		StringBuilder buf = new StringBuilder();
		for(int i=0;i<N;i++) {
			if(i<N-1) {
				buf.append(child[i]+" ");
			}else if(i==N-1){
				buf.append(child[i]);
			}
		}
		out.println(buf);
	}


	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
	}
	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}


}