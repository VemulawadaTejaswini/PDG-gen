import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();

		int result = 0;

		if (op == "+") {
			result = a + b;
		} else if (op == "-") {
			result = a - b;
		}

		System.out.println(result);

		sc.close();

	}

}