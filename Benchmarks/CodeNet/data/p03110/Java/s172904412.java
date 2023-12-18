import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int N = sc.nextInt();
		double ans = 0;

		for (int i = 0; i < N; i++) {
			double x = sc.nextDouble();
			String u = sc.next();

			if (u.equals("JPY")) {
				ans += x;
			}
			if (u.equals("BTC")) {
				ans += x * 380000.0;

			}
		}

		System.out.println(ans);
	}
}