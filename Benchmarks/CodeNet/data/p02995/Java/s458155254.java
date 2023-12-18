import java.io.*;
import java.util.*;

public class Main {
	
	static long div(long l,long r,long x) {
		return r/x-(l-1)/x;
	}
	static long lcm(long a,long b) {
		return a/gcd(a,b)*b;
	}
	static long gcd(long a,long b) {
		return b==0?a:gcd(b,a%b);
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		long A=sc.nextLong(),B=sc.nextLong(),C=sc.nextLong(),D=sc.nextLong();
		long all=B-A+1;
		out.println(all-(div(A,B,C)+div(A,B,D)-div(A,B,lcm(C,D))));
		
		out.close();

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

	}

}