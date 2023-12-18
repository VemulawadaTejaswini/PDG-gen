import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int ans = 0;
		if ((a - b) % 2 == 0) {
			ans = (a - b) / 2;
		} else {
			int x = Math.max(a, b);
			int y = Math.max(n - a, n - b);
			ans = Math.min(x, y) - 1;
		}

		System.out.println(ans);

		sc.close();
	}

}
