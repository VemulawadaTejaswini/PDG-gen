import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 条件分岐
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {
			System.out.println(0);
		} else if (n == 1) {
			if (a != b) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		} else {
			System.out.println((b - a) * (n - 2) + 1);
		}
	}

}
