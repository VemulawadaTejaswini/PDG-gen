
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 9;
		while (n-- > 0) {
			System.out.print(scanner.next() + " ");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.print(a + b + " ");
			System.out.println(a * 200 + b * 300);
		}
	}
}