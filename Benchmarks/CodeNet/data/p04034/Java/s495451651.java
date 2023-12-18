import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];
		boolean b[] = new boolean[n];
		b[0] = true;
		Arrays.fill(a, 1);
		int x, y;
		for (int i = 0; i < m; i++) {
			x = sc.nextInt() - 1;
			y = sc.nextInt() - 1;
			if (b[x]) {
				a[x]--;
				a[y]++;
				b[y] = true;
				if (a[x] == 0) {
					b[x] = false;
				}
			} else {
				a[x]--;
				a[y]++;
			}
		}

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (b[i] && a[i] > 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}