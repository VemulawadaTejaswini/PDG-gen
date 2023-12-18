import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();

		int count = 0;

		for (int i = x - k + 1; i < x + k; i++) {
			System.out.print(i);
			if (x != x + k - 1) {
				System.out.print(" ");
			}
		}
		sc.close();

	}
}