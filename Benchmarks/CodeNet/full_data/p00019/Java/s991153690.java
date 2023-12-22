import java.util.*;
import java.io.*;

public class Main {
	private static void solve() throws Exception {
		Scanner sc = new Scanner(System.in);
		// Scanner sc = new Scanner(new FileReader("a.in"));
		PrintWriter pw = new PrintWriter(System.out, true);
		long factor = facto(sc.nextInt());

		pw.println(factor);
	}

	private static long facto(long x) {
		if(x == 0 || x == 1) return 1;
		else return x*facto(x-1);
	}

	public static void main(String[] args) throws Exception {
		new Main().solve();
	}

	static void debug (Object...a) {
		System.out.println(Arrays.deepToString(a));
	}
}