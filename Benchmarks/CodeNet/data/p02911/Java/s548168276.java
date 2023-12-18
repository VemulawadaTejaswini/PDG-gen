import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] a = new int[q];
		int[] p = new int[n];
		int count = 0;
		for (int i = 0; i < q; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			p[i] = k;
		}
		for (int i = 0; i < q; i++) {
			for (int j = 0; j < n; j++) {
				if (j + 1 != a[i]) {
					p[j]--;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (p[i] > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}