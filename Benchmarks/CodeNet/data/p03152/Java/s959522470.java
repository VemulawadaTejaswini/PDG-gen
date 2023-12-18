import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		TreeSet<Integer> setA = new TreeSet<Integer>();
		for (int i = 0; i < n; i++) {
			setA.add(sc.nextInt());
		}
		TreeSet<Integer> setB = new TreeSet<Integer>();
		for (int i = 0; i < m; i++) {
			setB.add(sc.nextInt());
		}
		sc.close();

		if (setA.size() != n || setB.size() != m) {
			System.out.println(0);
			return;
		}

		int[] cntA = new int[n * m + 1];
		cntA[0] = n;
		for (int i = 1; i < cntA.length; i++) {
			if (setA.contains(i)) {
				cntA[i] = cntA[i - 1] - 1;
			} else {
				cntA[i] = cntA[i - 1];
			}
		}
		int[] cntB = new int[n * m + 1];
		cntB[0] = m;
		for (int i = 1; i < cntB.length; i++) {
			if (setB.contains(i)) {
				cntB[i] = cntB[i - 1] - 1;
			} else {
				cntB[i] = cntB[i - 1];
			}
		}

		int mod = 1000000007;
		long ans = 1;
		for (int i = n * m; i > 0; i--) {
			if (setA.contains(i) && setB.contains(i)) {
			} else if (setA.contains(i)) {
				ans *= cntB[i];
				ans %= mod;
			} else if (setB.contains(i)) {
				ans *= cntA[i];
				ans %= mod;
			} else {
				int cnt = cntA[i] * cntB[i] - (n * m - i);
				ans *= Math.max(cnt, 0);
				ans %= mod;
			}
		}
		System.out.println(ans);
	}
}
