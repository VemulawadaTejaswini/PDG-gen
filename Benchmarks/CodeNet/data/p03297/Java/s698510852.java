import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int t = sc1.nextInt();
		boolean ans = true;

		for ( int i = 0 ; i < t ; i++ ) {
			ans = true;
			long a = sc1.nextLong();
			long b = sc1.nextLong();
			long c = sc1.nextLong();
			long d = sc1.nextLong();

			//odd check
			boolean check = true;
			if ((a % 2 == 0) && (b % 2 == 0) && (d % 2 == 0)) {
				check = false;
			}
			if ((a % 2 == 0) && (b % 2 != 0) && (d % 2 != 0)) {
				check = false;
			}

			if ( a < b ) {
				ans = false;
			}

			if ( d != b ) {
				if (check) {
					if ((c + 1) < b) {
						ans = false;
					}
					if ( d < b ) {
						ans = false;
					}
				}
				else {
					if ((c + 2) < b) {
						ans = false;
					}
					if ( (d + 1) < b ) {
						ans = false;
					}
				}
			}
			else {
				if (a % b > c ) {
					ans = false;
				}
			}

			if (ans) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}

		}

		sc1.close();
	}

}
