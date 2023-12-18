import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int b[] = new int[m];
		int a[][] = new int[n][m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int o = 0; o < m; o++) {
				a[i][o] = sc.nextInt();
			}
		}
		int kei = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			kei = 0;
			for (int o = 0; o < m; o++) {
				kei += b[o] * a[i][o];
			}
			kei += c;
			if (kei > 0) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}