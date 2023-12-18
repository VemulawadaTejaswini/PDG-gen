import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		int max = (n - 1) * (n - 2) / 2;
		if (k == 0 || k > max) {
			System.out.println(-1);
			return;
		}

		int m = n - 1;
		int plus = max - k;
		m += plus;
		System.out.println(m);
		for (int i = 2; i <= n; i++) {
			System.out.println("1 " + i);
		}

		int cnt = 0;
		label:
		for (int i = 2; i <= n - 1; i++) {
			for (int j = i + 1; j <= n; j++) {
				System.out.println(i + " " + j);
				cnt++;
				if (cnt == plus) {
					break label;
				}
			}
		}
	}
}
