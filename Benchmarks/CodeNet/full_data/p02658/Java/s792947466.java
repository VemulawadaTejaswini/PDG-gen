import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args)throws IOException {
		FastReader sc = new FastReader();
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		long arr[] = new long[n];
		int zero = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
			if (arr[i] == 0)
				zero++;
		}
		if (zero > 0) {
			System.out.println(0);
			return;
		}
		long prod = 1;
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			if (arr[i] <= ((long)Math.pow(10, 18)) / prod) {
				prod = prod * arr[i];
			} else {
				System.out.println(-1);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(prod);
		}



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