import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.toBinaryString(sc.nextLong());
		}
		sc.close();

		int[] cnt1 = new int[40];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < a[i].length(); j++) {
				if (a[i].charAt(j) == '1') {
					cnt1[a[i].length() - 1 - j]++;
				}
			}
		}

		long[][] val = new long[40][2];
		char[] bit0 = new char[40];
		long base = 1;
		for (int i = 0; i < 40; i++) {
			if (cnt1[i] < n - cnt1[i]) {
				bit0[i] = '1';
			} else {
				bit0[i] = '0';
			}
			val[i][0] = base * cnt1[i];
			val[i][1] = base * (n - cnt1[i]);
			base *= 2;
		}

		char[] k2 = Long.toBinaryString(k).toCharArray();
		char[] bitk = new char[40];
		Arrays.fill(bitk, '0');
		System.arraycopy(k2, 0, bitk, 0, k2.length);

		long ans = 0;
		char[] bit = new char[40];
		System.arraycopy(bit0, 0, bit, 0, bit.length);

		boolean flg = false;
		for (int i = bit.length - 1; i >= 0; i--) {
			if (bit[i] < bitk[i]) {
				ans = Math.max(ans, calc(val, bit));
				break;
			} else if (bit[i] > bitk[i]) {
				bit[i] = '0';

			} else if (bit[i] == '1' && bitk[i] == '1') {
				if (!flg) {
					boolean flg2 = true;
					for (int j = i; j >= 0; j--) {
						if (bit[i] > bitk[i]) {
							flg2 = false;
							break;
						}
					}
					if (flg2) {
						flg = true;
					}
				}
				if (flg) {
					ans = Math.max(ans, calc(val, bit));
				}
				bit[i] = '0';
				ans = Math.max(ans, calc(val, bit));
				bit[i] = '1';
			}
		}
		ans = Math.max(ans, calc(val, bit));
		System.out.println(ans);
	}

	static long calc(long[][] val, char[] bit) {
		long ret = 0;
		for (int i = 0; i < bit.length; i++) {
			ret += val[i][bit[i] - '0'];
		}
		return ret;
	}
}
