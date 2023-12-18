import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int ans = 0;

		for (int i = 1; i <= 1000000000; i++) {
			if (i % 2 == 0 && i % n == 0) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);

		sc.close();
	}
}
