import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	void solve() throws IOException {
		String s = readString();

		long ans = 0;

		for (long i=0; i<1<<(s.length()-1); i++) {
			int prev = 0;
			for (int j=0; j<s.length()-1; j++) {
				if (((i>>j) & 1) == 1) {
					ans += Long.parseLong(s.substring(prev, j+1));
					prev = j+1;
				}
			}
			ans += Long.parseLong(s.substring(prev, s.length()));
		}

		out.println(ans);
	}


	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		tok = new StringTokenizer("");
		Main main = new Main();
		main.solve();
		out.close();
	}

	String readString() throws IOException {
		while (!tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine(), " .");
		}
		return tok.nextToken();
	}

	int readInt() throws IOException {
		return Integer.parseInt(readString());
	}

	long readLong() throws IOException {
		return Long.parseLong(readString());
	}

	double readDouble() throws IOException {
		return Double.parseDouble(readString());
	}

	int[] readArr(int n) throws IOException {
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			res[i] = readInt();
		}
		return res;
	}

	long[] readArrL(int n) throws IOException {
		long[] res = new long[n];
		for (int i = 0; i < n; i++) {
			res[i] = readLong();
		}
		return res;
	}

	void readArr2(int[] A, int[] B) throws IOException {
		int n = A.length;
		for (int i = 0; i < n; i++) {
			A[i] = readInt();
			B[i] = readInt();
		}
	}

	void readArrL2(long[] A, long[] B) throws IOException {
		int n = A.length;
		for (int i = 0; i < n; i++) {
			A[i] = readLong();
			B[i] = readLong();
		}
	}
}
