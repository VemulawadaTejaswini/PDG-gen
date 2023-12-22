
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		int d = sc.nextInt();

		int ans = 0;

		for (int i = L; i <= R; i++) {

			if (i % d == 0) {
				ans++;
			}

		}
		System.out.println(ans);

	}

}
