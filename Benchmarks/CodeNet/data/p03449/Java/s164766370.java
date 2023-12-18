import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[2][n];
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = sc.nextInt();
		int ans = a[0][0];
		for (int k = 0; k < n; k++) {
			ans += a[1][k];
		}
		for (int k = 1; k < n; k++) {
			int t = 0;
			for (int l = 0; l < k; l++)
				t += a[0][l];
			for (int l = k - 1; l < n; l++)
				t += a[1][l];
			if (t > ans)
				ans = t;
		}
		System.out.println(ans);
	}
}