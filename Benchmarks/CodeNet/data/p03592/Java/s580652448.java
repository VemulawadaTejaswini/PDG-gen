import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean result = false;
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();

		if (m ==0  && n == k) {
			System.out.println("Yes");
			return;
		} else if (n == 0 && m == k) {
			System.out.println("Yes");
			return;
		}

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <=n; j++) {
				int tmp = i * m + j * n - (Math.max(i,j) * Math.min(i,j));
				if (tmp == k) {
					System.out.println("Yes");
					return;
				}
			}
		}

		System.out.println("No");
	}
}