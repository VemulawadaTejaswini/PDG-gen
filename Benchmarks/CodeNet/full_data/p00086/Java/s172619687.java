import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		in.close();
		out.close();
	}

	static int INF = 1 << 30;
	static long LINF = 1L << 55;
	static int MOD = 1000000007;
	static int[] mh4 = { 0, -1, 1, 0 };
	static int[] mw4 = { -1, 0, 0, 1 };
	static int[] mh8 = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] mw8 = { -1, 0, 1, -1, 1, -1, 0, 1 };

	static class TaskX {

		public void solve(int testNumber, Scanner in, PrintWriter out) {

			while (in.hasNext()) {
				int[] cnt = new int[101];
				while (true) {
					int s = in.nextInt();
					int t = in.nextInt();
					if ((s | t) == 0) break;
					cnt[s]++;
					cnt[t]++;
				}
				System.out.println(check(cnt) ? "OK" : "NG");
			}
		}

		boolean check(int[] cnt) {
			boolean ok = true;
			for (int i = 0; i < 101; i++) {
				if (i == 1 || i == 2) {
					if (cnt[i] % 2 != 1) ok = false;
				} else {
					if (cnt[i] % 2 == 1) ok = false;
				}
			}
			return ok;
		}
	}
}

