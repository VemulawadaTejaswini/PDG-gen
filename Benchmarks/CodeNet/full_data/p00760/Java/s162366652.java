import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(Yamada(1000, 1, 1)
					- Yamada(s.nextInt(), s.nextInt(), s.nextInt()));
		}
		s.close();
	}

	public static int Yamada(int y, int m, int d) {
		int ans = -1;

		ans += 19 * 10 * (y - 1);
		ans += 10 * ((y - 1) / 3) + 5 * ((y - 1) - (y - 1) / 3);

		if (y % 3 == 0) {
			ans += 20 * (m - 1);
		} else {
			ans += 19 * ((m - 1) / 2);
			ans += 20 * ((m - 1) - ((m - 1) / 2));
		}
		return ans += d;
	}
}