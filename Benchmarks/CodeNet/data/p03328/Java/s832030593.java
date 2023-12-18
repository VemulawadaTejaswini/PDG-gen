import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int east = (1 + (b - a)) * (b - a) / 2;
			int x = east - b;
			System.out.println(x);

		}

	}

}
