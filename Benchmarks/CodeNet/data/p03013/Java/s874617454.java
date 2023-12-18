import java.util.Scanner;

public class Main {
	static long[][] cmb;
	final static int LIMIT_OF_ARRAY = 10000;
	static boolean isHuge = false;
	
	public static void main(String[] args) {
		long mod = 1_000_000_007L;
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int bstepNum = in.nextInt();
		if (LIMIT_OF_ARRAY <= num) {
			cmb = new long[LIMIT_OF_ARRAY][LIMIT_OF_ARRAY/2 + 1];
		} else {
			cmb = new long[num + 1][(num + 1)/2 + 1];
		}
		int[] brokenStep = new int[bstepNum];
		long ans = 0;
		for (int i = 0; i < bstepNum; i++) {
			brokenStep[i] = Integer.parseInt(in.next());
			if (i != 0 && brokenStep[i-1] + 1 == brokenStep[i]) {
				System.out.println(ans);
				in.close();
				return;
			}
		}
		int diffmax = 0;
		for (int i = 1; i < bstepNum; i++) {
			if (brokenStep[i] - brokenStep[i - 1] > 0) {
				diffmax = brokenStep[i] - brokenStep[i - 1];
			}
		}
		if (diffmax > 7500) {
			for (int j = 0; j < 2500; j++) {
				for (int k = 0; k < j; k++) {
					combination(j, k, mod);
				}
			}
			if (diffmax >= LIMIT_OF_ARRAY) {
				isHuge = true;
			}
		}
		
		in.close();
		ans = 1;
		int pos = 0;
		for (int i = 0; i < bstepNum; i++) {
			int step = brokenStep[i] - pos - 1;
			long tmp = 0;
			for (int j = step, skip = 0; j >= 0; j -= 2, skip++) {
				tmp += combination(j + skip, skip, mod);
			}
			ans *= tmp;
			if (ans > mod) {
				ans %= mod;
			}
			pos = brokenStep[i] + 1;
		}
		long lt = 0;
		for (int i = num - pos, skip = 0; i >= 0; i -= 2, skip++) {
			lt += combination(i + skip, skip, mod);
		}
		ans *= lt;
		ans %= mod;
		System.out.println(ans);
	}
	
	public static long combination(int a, int b, long mod) {
		if (a > cmb.length || b > cmb.length) {
			return combination(a-1, b-1, mod) + combination(a-1, b, mod);
		} else {
			if (cmb[a][b] != 0) return cmb[a][b];
			if (a == b) {
				return cmb[a][b] = 1L;
			} else if (b == 0) {
				return cmb[a][b] = 1L;
			} else if (b == 1) {
				return cmb[a][b] = a;
			} else {
				long tmp = combination(a-1, b-1, mod) + combination(a-1, b, mod);
				if (mod < tmp) {
					tmp %= mod;
				}
				return cmb[a][b] = tmp;
			}
		}
	}
}