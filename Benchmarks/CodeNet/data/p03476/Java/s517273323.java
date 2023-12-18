import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int[] f = calc();
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			if (l == 1) {
				System.out.println(f[r]);
			} else {
				System.out.println(f[r] - f[l - 2]);
			}
		}
		sc.close();
	}

	static int[] calc() {
		int[] ret = new int[100001];
		for (int i = 3; i < ret.length; i+=2) {
			ret[i] = ret[i - 2];
			if (isSosuu(i) && isSosuu((i + 1) / 2)) {
				ret[i]++;
			}
		}
		return ret;
	}

	static boolean isSosuu(long n) {
		if (n < 2) return false;
		if (n == 2) return true;
		long end = (int) Math.sqrt(n) + 1;
		for (int i = 2; i <= end; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
