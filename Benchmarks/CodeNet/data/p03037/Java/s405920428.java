import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
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
		int n = nextInt();
		int m = nextInt();
		int maxL = 0,minR = 100010;
		for(int i=0;i<m;i++) {
			int L = nextInt();
			int R = nextInt();
			maxL = Math.max(maxL,L);
			minR = Math.min(minR,R);
		}

		if(maxL > minR)out.println(0);
		else out.println(minR - maxL + 1);
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
}
  