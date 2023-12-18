import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// abc155_a();
		abc155_b();

	}

	static void abc155_a() {

		Scanner sc = new Scanner(System.in);
		// 数値
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		if ((n1 == n2 && n2 == n3) || (n1 != n2 && n1 != n3 && n2 != n3)) {

			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}

	static void abc155_b() {

		Scanner sc = new Scanner(System.in);
		// 数値
		int n1 = sc.nextInt();
		boolean flg = false;
		for (int i = 1; i <= n1; i++) {
			int n = sc.nextInt();
			if (n % 2 == 0) {
				if (!(n % 3 == 0 || n % 5 == 0)) {
					flg = true;
					break;
				}
			}
		}

		if (flg) {
			System.out.println("DENIED");
		} else {
			System.out.println("APPROVED");
		}

		//

	}
}
