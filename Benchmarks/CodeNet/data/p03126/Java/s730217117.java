import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int k, idx, cnt = 0;
		for (int i = 0; i < n; i++) {
			k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				idx = sc.nextInt() - 1;
				a[idx]++;
			}
		}

		for (int i = 0; i < m; i++) {
			if (a[i] == n) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
