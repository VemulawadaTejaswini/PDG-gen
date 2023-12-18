import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int ans = 0;
		int min = 10;
		int trg = 0;

		for (int i = 0; i < 5; i++) {
			int X = sc.nextInt();
			if ((X - 1) % 10 < min) {
				trg = X;
				min = (X - 1) % 10;
			}
			ans += Math.min(((X / 10) * 10 + 10), ((X / 10) * 10));
		}

		ans -= Math.min(((trg / 10) * 10 + 10), ((trg / 10) * 10));
		ans += trg;
		sc.close();

		System.out.println(ans);
	}
};