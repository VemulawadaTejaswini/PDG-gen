

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int ans = 0;

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (i == j)
					ans++;
			}
		}

		System.out.println(ans);
	}

}
