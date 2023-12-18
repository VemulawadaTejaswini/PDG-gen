import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ans = "";

		if (n == a && n == b) {
			ans = n + " " + a;
		} else {
			if (a < b) {
				ans = String.valueOf(a) + " " + 0;
			} else {
				ans = String.valueOf(b) + " " + String.valueOf(a - b);
			}
		}

		System.out.println(ans);

		sc.close();
	}
}