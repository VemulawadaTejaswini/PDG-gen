

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		ArrayList<Integer> primeList = new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		primeList.add(2);

		for (int i = 3; i <= 55555; i++) {

			boolean primeFlg = true;

			for (int prime : primeList) {
				if (i % prime == 0) {
					primeFlg = false;
					break;
				}
			}

			if (primeFlg) {
				primeList.add(i);
				if (i % 5 == 1)
					ans.add(i);
			}

			if (ans.size() == n)
				break;
		}

		for (int a : ans) {
			System.out.print(a + " ");
		}

	}

}
