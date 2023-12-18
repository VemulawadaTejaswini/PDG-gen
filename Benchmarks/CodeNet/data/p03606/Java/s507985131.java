import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();

			int ans = 0;

			for (int i = 0; i < n; i++) {
				int l = sc.nextInt();
				int r = sc.nextInt();
				ans = ans + r - l + 1;
			}

			System.out.println(ans);

		}
	}
}