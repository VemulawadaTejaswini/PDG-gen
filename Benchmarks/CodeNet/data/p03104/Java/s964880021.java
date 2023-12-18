import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();

		System.out.println(calc(a-1) ^ calc(b));
	}

	private static long calc(long val) {
		if (val <= 0) {
			return 0L;
		}
		String str = Long.toBinaryString(val);
		long base = 2;
		boolean[] odd = new boolean[41];
		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {
				long mod = val % 4;
				if (mod == 1 || mod == 2) {
					odd[i] = true;
				}
			} else {
				base *= 2;
				long mod = val % base;
				long cnt = Math.max(mod + 1 - base / 2, 0);
				if (cnt % 2 == 1) {
					odd[i] = true;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = str.length(); i >= 0; i--) {
			if (odd[i]) {
				sb.append("1");
			} else {
				sb.append("0");
			}
		}
//		System.out.println(Long.parseLong(sb.toString(), 2));
		return Long.parseLong(sb.toString(), 2);
	}
}
