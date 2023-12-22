import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int r, c, q;
	static int[] A, B, order;

	static int solve() {
		int ret = 0;
		boolean[] usedr = new boolean[r];
		boolean[] usedc = new boolean[c];
		int cr = 0;
		int cc = 0;
		for (int i = q - 1; i >= 0; --i) {
			if (A[i] == 0) {
				if (usedr[B[i]]) continue;
				usedr[B[i]] = true;
				cr++;
				if (order[i] == 1) ret += c - cc;
			} else {
				if (usedc[B[i]]) continue;
				usedc[B[i]] = true;
				cc++;
				if (order[i] == 1) ret += r - cr;
			}
		}
		return ret;
	}

	public static void main(String[] args) throws Exception {
		while (true) {
			r = sc.nextInt();
			if (r == 0) break;
			c = sc.nextInt();
			q = sc.nextInt();
			A = new int[q];
			B = new int[q];
			order = new int[q];
			for (int i = 0; i < q; ++i) {
				A[i] = sc.nextInt();
				B[i] = sc.nextInt();
				order[i] = sc.nextInt();
			}
			System.out.println(solve());
		}
	}
}