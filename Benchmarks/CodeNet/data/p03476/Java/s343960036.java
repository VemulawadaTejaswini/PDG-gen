import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
		boolean[] p = new boolean[100001];
		int[] pp = new int[100001];

		for (int i = 0; i < 100001; i++) {
			p[i] = isPrime(i);
		}

		int[] ans = new int[q];
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int cnt = 0;
			if (l % 2 == 0) {
				l++;
			}
			for (int j = l; j <= r; j+=2) {
				if (p[j] && p[(j + 1) / 2]) {
					cnt++;
				}
			}
			ans[i] = cnt;
		}

		for (int i = 0; i < q; i++) {
			System.out.println(ans[i]);
		}
	}

	private static boolean isPrime(int x) {
		if (x == 0 || x == 1) {
			return false;
		}
		if (x == 2) {
			return true;
		}
		if (x % 2 == 0) {
			return false;
		}
		for (int i = 3; i*i <= x; i+=2) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
