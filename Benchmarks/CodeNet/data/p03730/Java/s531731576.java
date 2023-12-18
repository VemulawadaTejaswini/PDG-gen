
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		for (int i = 0; i < a; i++) {
			if (a % a == 0 && a % b == c) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}
}
