import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 12; i >= 0; i--) {
			int[] a = new int[n + 1];
			System.arraycopy(d, 0, a, 1, n);
			boolean flg = true;
			label:
			for (int j = 0; j <= n; j++) {
				for (int j2 = 0; j2 < j; j2++) {
					if (Math.abs(a[j] - a[j2]) < i) {
						if (a[j] != 0) {
							a[j] = 24 - a[j];
						}
						flg = false;
						break;
					}
				}
				if (!flg) {
					flg = true;
					for (int j2 = 0; j2 < j; j2++) {
						if (Math.abs(a[j] - a[j2]) < i) {
							flg = false;
							break label;
						}
					}
				}
			}
			if (flg) {
				System.out.println(i);
				return;
			}
		}
	}
}
