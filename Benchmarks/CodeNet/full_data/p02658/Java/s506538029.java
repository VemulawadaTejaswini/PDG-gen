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
		BigInteger ans = new BigInteger("1");
		BigInteger q = new BigInteger("1000000000000000000");
		boolean flag = true;
		while (n-- > 0) {
			String s = sc.next();
			BigInteger a = new BigInteger(s);
			ans = ans.multiply(a);
			if (ans.compareTo(q) > 0) {
				//System.out.println(-1);
				flag = false;
			} else if (ans.compareTo(q) <= 0) {
				flag = true;
			}
		}
		if (flag)
			System.out.println(ans);
		else
			System.out.println(-1);

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