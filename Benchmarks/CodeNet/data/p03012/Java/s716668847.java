import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> omori = new ArrayList<Integer>();
		int n = sc.nextInt();
		for (int i = 0; i <= n - 1; i++) {
			int a = sc.nextInt();
			omori.add(a);
		}
		int weight = 0;
		for (int i = 0; i <= n - 1; i++) {
			weight += omori.get(i);
		}

		int ans = 1000000000;

		for (int i = 0; i < n - 1; i++) {
			int zen = 0;
			for (int j = 0; j <= i; j++) {
				zen += omori.get(j);
			}
			int kou = weight - zen;

			int zen2 = zen + omori.get(i + 1);
			int kou2 = weight - zen2;

			ans = Math.min(Math.abs(zen2 - kou2), Math.abs(zen - kou));

		}
		System.out.println(ans);

	}
}