import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		abc155_a();

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
}
