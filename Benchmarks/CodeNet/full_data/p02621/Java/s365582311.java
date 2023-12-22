import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();

		int b = 2;
		int c = 3;

		if (a <= 10) {
			System.out.println(a + (a * b) + (a * c));
		}
	}
}