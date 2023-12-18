import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int q = sc.nextInt();
		long[] shr = new long[a];
		long[] tem = new long[b];
		long[] que = new long[q];
		for (int i = 0; i < a; i++) {
			shr[i] = sc.nextLong();
		}
		for (int i = 0; i < b; i++) {
			tem[i] = sc.nextLong();
		}
		for (int i = 0; i < q; i++) {
			que[i] = sc.nextLong();
		}
		sc.close();

		for (int i = 0; i < q; i++) {
			long x = que[i];
			int sIdx = binarySearch(shr, x);
			int tIdx = binarySearch(tem, x);

			long sS = shr[Math.max(0, sIdx - 1)];
			long sL = shr[Math.min(sIdx, a - 1)];
			long tS = tem[Math.max(0, tIdx - 1)];
			long tL = tem[Math.min(tIdx, b - 1)];

			long r1 = 0L;
			if (Math.abs(x - tS) < Math.abs(x - sS)) {
				r1 += Math.abs(x - tS);
				if (tS - sS < sL - tS) {
					r1 += Math.abs(tS - sS);
				} else {
					r1 += Math.abs(sL - tS);
				}
			} else {
				r1 += Math.abs(x - sS);
				if (sS - tS < tL - sS) {
					r1 += Math.abs(sS - tS);
				} else {
					r1 += Math.abs(tL - sS);
				}
			}

			long r2 = 0L;
			if (Math.abs(sL - x) < Math.abs(tL - x)) {
				r2 += Math.abs(sL - x);
				if (tL - sL < sL - tS) {
					r2 += Math.abs(tL - sL);
				} else {
					r2 += Math.abs(sL - tS);
				}
			} else {
				r2 += Math.abs(tL - x);
				if (sL - tL < tL - sS) {
					r2 += Math.abs(sL - tL);
				} else {
					r2 += Math.abs(tL - sS);
				}
			}
			System.out.println(Math.min(r1, r2));
		}
	}

	private static int binarySearch(long[] array, long val) {
		int ng = -1;
		int ok = array.length;

		while (Math.abs(ok - ng) > 1) {
			int mid = (ok + ng) / 2;
			if (isOK(array, mid, val)) {
				ok = mid;
			} else {
				ng = mid;
			}
		}
		return ok;
	}

	private static boolean isOK(long[] array, int index, long val) {
		if (array[index] >= val) {
			return true;
		} else {
			return false;
		}
	}
}
