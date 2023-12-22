
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int num, i = 1; (num = scanner.nextInt()) != 0; i++) {
			System.out.printf("Case %d: %d\n", i, num);
		}
	}
}