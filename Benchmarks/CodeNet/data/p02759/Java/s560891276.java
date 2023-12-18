import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		int n1 = sc.nextInt();

		if (n1 % 2 == 0) {
			System.out.println(n1 / 2);
		} else {
			System.out.println(1 + n1 / 2);
		}
	}
}
