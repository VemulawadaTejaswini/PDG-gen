import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int ans = 0;

		for (int i = 1; i <= N; i++) {
			if (i % 2 != 0) {
				int a = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						a++;
					}
				}
				if (a == 8) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
