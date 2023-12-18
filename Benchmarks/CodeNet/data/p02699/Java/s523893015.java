import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution100 {

	public static void main(String[] args) {
		FastReader scan = new FastReader();
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		if(n > m) {
			System.out.println("safe");
		}
		else
			System.out.println("unsafe");
	}

}

class FastReader {
	BufferedReader bf;
	StringTokenizer st;

	public FastReader() {
		bf = new BufferedReader(new InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(bf.readLine());
			} catch (Exception e) {
				System.out.println(e);
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
			str = bf.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return str;
	}
}

