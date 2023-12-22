import java.util.Scanner;

public class Main {
	static char[] s;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		s = sc.next().toCharArray();
		sc.close();

		int ok = s.length;
		int ng = 0;
		while (Math.abs(ok - ng) > 1) {
			int mid = (ok + ng) / 2;
			if (can(mid)) {
				ok = mid;
			} else {
				ng = mid;
			}
		}
		System.out.println(ok);
	}

	static boolean can(int mid) {
		int val = 1;
		int cnt0 = 0;
		int cnt1 = 0;
		int cntx = 0;
		int cnt00 = 0;
		int cnt11 = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == '0') {
				cnt0++;
				cnt00++;
				if (cnt11 > 0) {
					cnt11--;
				}
				val = Math.max(val, cnt00);
				val = Math.max(val, Math.max(Math.abs(cnt0 - cnt1) - cntx, 0));
			} else if (s[i] == '1') {
				cnt1++;
				cnt11++;
				if (cnt00 > 0) {
					cnt00--;
				}
				val = Math.max(val, cnt11);
				val = Math.max(val, Math.max(Math.abs(cnt0 - cnt1) - cntx, 0));
			} else {
				if (cnt00 == mid) {
					cnt1++;
					cnt11++;
					cnt00--;
					val = Math.max(val, cnt11);
					val = Math.max(val, Math.max(Math.abs(cnt0 - cnt1) - cntx, 0));
				} else if (cnt11 == mid) {
					cnt0++;
					cnt00++;
					cnt11--;
					val = Math.max(val, cnt00);
					val = Math.max(val, Math.max(Math.abs(cnt0 - cnt1) - cntx, 0));
				} else {
					cntx++;
					if (cnt00 > 0) {
						cnt00--;
					}
					if (cnt11 > 0) {
						cnt11--;
					}
				}
			}
			if (val > mid) {
				return false;
			}
		}
		return true;
	}
}
