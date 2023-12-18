import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (x + 1 <= b - a) {
			System.out.println("dangerous");
		} else if (0 >= b - a) {
			System.out.println("delicious");
		} else {
			System.out.println("safe");
		}

		sc.close();

	}

}