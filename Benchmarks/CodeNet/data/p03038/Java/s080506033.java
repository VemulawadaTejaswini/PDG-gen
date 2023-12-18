
import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.Stream;

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
		int n = nextInt();
		int m = nextInt();
		sc.nextLine();
		String S = " " + sc.nextLine() + " ";
		//long[] A = nextLongArray(n);
		long[] B = new long[m];
		long[] C = new long[m];
		StringBuilder buf = new StringBuilder();
		for(int i=0;i<m;i++) {
			B[i]=nextLong();
			C[i]=nextLong();
			if(B[i]<C[i]) {
				buf.append(" ");
				buf.append(B[i]);
				buf.append(" ");
				String sB = buf.toString();
				buf.setLength(0);
				buf.append(" ");
				buf.append(C[i]);
				buf.append(" ");
				String sC = buf.toString();
				buf.setLength(0);
				S = S.replaceAll(sB, sC);
				//out.println(sC);
			}
		}
		//out.println(S);
		S = S.replaceFirst(" ", "");
		String[] sa = S.split(" ");
		long[] A = Stream.of(sa).mapToLong(Long::parseLong).toArray();
		long sum = 0;
		//for(long a:A) sum+=a;
		for(int i=0;i<n;i++)sum+=A[i];
		out.println(sum);
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
