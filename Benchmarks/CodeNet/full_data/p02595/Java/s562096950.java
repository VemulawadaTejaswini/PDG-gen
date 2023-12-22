import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		setIO();

		StringTokenizer st = nl();
		int N = ni(st), D = ni(st);
		int ans = 0;
		for (int i = 0; i < N; i++) {
			st = nl();
			int x = ni(st), y = ni(st);
			if ((long) x * x + (long) y * y <= (long) D * D) {
				ans++;
			}
		}
		out.println(ans);
		
		f.close();
		out.close();
	}

	static final int MOD = 1000000007;

	static BufferedReader f;
	static PrintWriter out;

	static int ni(StringTokenizer st) {
		return Integer.parseInt(st.nextToken());
	}

	static int ni() throws IOException {
		return Integer.parseInt(f.readLine());
	}

	static StringTokenizer nl() throws IOException {
		return new StringTokenizer(f.readLine());
	}

	static int[] nia(int N) throws IOException {
		StringTokenizer st = nl();
		int[] A = new int[N];
		for (int i = 0; i < N; i++)
			A[i] = ni(st);
		return A;
	}

	static void setIO(String s) throws IOException {
		f = new BufferedReader(new FileReader(s + ".in"));
		out = new PrintWriter(new FileWriter(s + ".out"));
	}

	static void setIO() {
		f = (new BufferedReader(new InputStreamReader(System.in)));
		out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	}
}
