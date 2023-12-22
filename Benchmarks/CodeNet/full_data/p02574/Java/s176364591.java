import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int max = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				max = Math.max(a[i], max);
			}
			int sq = (int) Math.sqrt((double) max) + 2;
			int[] cnt = new int[sq];
			boolean pairwise = true;
			boolean setwise = false;
			int tmpgcd = a[0];
			for (int i = 0; i < n; i++) {
				if (!setwise) {
					tmpgcd = gcd(tmpgcd, a[i]);
					if (tmpgcd == 1) {
						setwise = true;
					}
				}
				if (pairwise) {
					int tmpa = a[i];
					int tmpsq = (int) Math.sqrt((double) a[i]) + 1;
					for (int j = 2; j <= tmpsq; j++) {
						boolean ok = false;
						while (tmpa % j == 0 && pairwise) {
							ok = true;
							tmpa /= j;
						}
						if (ok) {
							cnt[j]++;
							if (cnt[j] > 1) {
								pairwise = false;
								break;
							}
						}
						if (tmpa == 1) {
							break;
						}
					}
				}
			}
			if (pairwise) {
				System.out.println("pairwise coprime");
			} else {
				if (setwise) {
					System.out.println("setwise coprime");
				} else {
					System.out.println("not coprime");
				}
			}
		}
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}