
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		int m[] = new int[q];
		for (int i = 0; i < q; i++) {
			m[i] = sc.nextInt();
		}
		for (int i = 0; i < q; i++) {
			if(dfs(n, a, m[i], 0, 0)) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}

	public static boolean dfs(int n, int a[], int m, int sum, int i) {
		if (i == n)
			return sum == m;
		if (dfs(n, a, m, sum + a[i], i + 1))
			return true;
		if (dfs(n, a, m, sum, i + 1))
			return true;
		return false;
	}
}

