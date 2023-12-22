import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		for (int i = 1; i <= (1000 / k); i++) {
			if (a <= i * k && b >= k * i) {
				ans++;
				break;
			}

		}
		if (ans == 1) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}

	}

}