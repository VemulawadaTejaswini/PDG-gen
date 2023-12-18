import java.io.PrintStream;
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
		int N = nextInt();
		int A = nextInt();//here
		int B = nextInt();//here
		int AG = nextInt();//目的地
		int BG = nextInt();//目的地
		String S = next();
		char[] cArray = S.toCharArray();



		String res = "No";

		if(N>1) {
			//移動範囲
			String tS = S.substring(Math.min(A, B), Math.max(AG,BG));
			//##が連続している場合達成不可能である
			if(tS.replace("##", "-").length()!=tS.length()) {
				out.println(res);
				return;
			}
		}

		boolean overtakef = false;
		//追い越す必要があるならtrue
		if(A < B && AG > BG || A > B && AG < BG) overtakef = true;
		if(overtakef) {
			String tS = S.substring(Math.max(A, B), Math.min(AG,BG));

			//out.println(tS.replace("...", "-")+" "+tS.length());
			//...が存在しない場合追い越すことができず達成不可能である
			if(tS.replace("...", "-").length()==tS.length()) {
				out.println(res);
				return;
			}



		}


		out.println("Yes");


	}
	private long max(long a, long b) {
		return Math.max(a, b);
	}
	private long min(long a, long b) {
		return Math.min(a, b);
	}
	private static int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	private static long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
	}
	private static int nextInt() {
		return Integer.parseInt(next());
	}
	private static long nextLong() {
		return Long.parseLong(next());
	}
	private static String next() {
		return sc.next();
	}
	static long gcd(long m,long n) {
		if (m<n) return gcd(n,m);
		if (n==0)return m;
		return gcd(n,m%n);
	}

}