import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();

		if (a <= 0 && 0 <= b) {
			System.out.println("Zero");
		} else if (0 < a) {
			System.out.println("Positive");
		} else if (b < 0) {
			if ((b-a) % 2 == 0)
				System.out.println("Positive");
			else
				System.out.println("Negative");
		}
	}
}