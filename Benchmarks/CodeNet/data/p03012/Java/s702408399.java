package atcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> omori = new ArrayList<Integer>();
		int n = sc.nextInt();
		for (int i = 0; i <= n - 1; i++) {
			omori.add(sc.nextInt());
		}
		int weight = 0;
		for (int i = 0; i <= n - 1; i++) {
			weight += omori.get(i);
		}
		int weight2 = weight / 2;

		int zen = 0;
		int kou = 0;
		for (int i = 0; i <= n - 1; i++) {
			weight2 -= omori.get(i);
			if (weight2 <= 0) {
				for (int j = 0; j <= i; j++) {
					zen = omori.get(j);

				}

			}

		}

		kou = weight - zen;
		int abs = Math.abs(kou - zen);
		System.out.println(abs);

	}
}
