import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int area = a * b;
		int round = (a + b) * 2;
		System.out.println(area + " " + round);

	}
}