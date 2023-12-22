import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int k;
	int pow10[] = new int[10];
	int MAX_N;

	void run() {
		Scanner sc = new Scanner(System.in);
		final int INF = 1 << 28;
		pow10[0] = 1;
		for (int i = 0; i < pow10.length-1; i++) {
			pow10[i + 1] = pow10[i] * 10;
		}
		int a = sc.nextInt();
		MAX_N = (a + "").length();
		int b = sc.nextInt();
		k = sc.nextInt();
		int ans =solve(0, a, b, 0, 0, 0);
		System.out.println(ans);
	}

	int solve(int n, int a, int b, int c, int f, int bor) {
		int ai = a % 10;
		int bi = b % 10;
		int res = 0;
		// 　1. A，B を十進数で表現する。添字は下位から順に 0,1,2,…,n−1 とし、
		// A=An−1An−2…A0，B=Bn−1Bn−2…B0 とする。 n は十進数で表現した時のAの桁数とする。 B の桁数が n
		// より小さいとき、上位桁に 0 を補う。
		// 　2. borrow0=0 とする。
		// 　3. 以下の処理を i=0 から n−1 まで繰り返す。
		// 　　3.1. Ai−borrowi&#8805;Bi ならば、 Ci=Ai−borrowi−Bi ， borrowi+1=0とする。
		// 　　3.2. Ai−borrowi<Bi ならば、 Ci=Ai−borrowi+10−Bi ， borrowi+1=1とする。
		if (n == MAX_N) {
			return c;
		} else {
			if (ai - bor >= bi) {
				int ci = ai - bor - bi;
				res = solve(n + 1, a / 10, b / 10, c + pow10[n] * ci, f, 0);
			} else {
				int ci = ai - bor + 10 - bi;
				if (f < k) {
					res = Math.max(
							solve(n + 1, a / 10, b / 10, c + pow10[n] * ci, f,
									1),
							solve(n + 1, a / 10, b / 10, c + pow10[n] * ci,
									f + 1, 0));
				} else {
					res = solve(n + 1, a / 10, b / 10, c + pow10[n] * ci, f, 1);
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}