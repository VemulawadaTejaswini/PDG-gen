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
		String S = next();
		char[] cArray = S.toCharArray();

		String res = "No";
		for(int i=1;i<cArray.length;i++) {
			if(cArray[0] == cArray[i]) {
				int ti = 0,tj = 0;
				if(i == 1) {
					ti = 2;
					tj = 3;
				}
				if(i == 2) {
					ti = 1;
					tj = 3;
				}
				if(i == 3) {
					ti = 1;
					tj = 2;
				}
				if(cArray[ti] == cArray[tj]) {
					if(cArray[ti] != cArray[i]) {
						res = "Yes";
					}
				}
			}
		}

		out.println(res);
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}
}