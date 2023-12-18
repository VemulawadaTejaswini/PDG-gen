import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x[][] = new int[n][d];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < d; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (dist(x[i], x[j])) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

	static public boolean dist(int a[], int b[]) {
		int dist = 0;
		for (int i = 0; i < a.length; i++) {
			dist += (a[i] - b[i]) * (a[i] - b[i]);
		}
		if ((int)Math.sqrt(dist) *(int)Math.sqrt(dist) - dist == 0) {
			return true;
		} else {
			return false;
		}
	}

}