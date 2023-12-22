import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class Main {
	public static void main(String[] args)throws IOException {
		FastReader sc = new FastReader();
		PrintWriter pw = new PrintWriter(System.out);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();
		long ans = 0;
		while (k != 0) {
			if (k != 0 && a <= k) {
				ans = ans + a;
				k = k - a;
			} else if (k != 0 && a > k) {
				ans = ans + k;
				k = 0;
			}
			if (k != 0 && b <= k) {
				k = k - b;
			} else if (k != 0 && b > k) {
				k = 0;
			}
			if (k != 0 && c <= k) {
				ans = ans + (-1) * c;
				k = k - c;
			} else if (k != 0 && c > k) {
				ans = ans - k;
				k = 0;
			}
		}
		System.out.println(ans);


	}
}





class FastReader {
	BufferedReader br;
	StringTokenizer st;

	public FastReader() {
		br = new BufferedReader(new
		                        InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException  e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	long nextLong() {
		return Long.parseLong(next());
	}

	double nextDouble() {
		return Double.parseDouble(next());
	}

	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}