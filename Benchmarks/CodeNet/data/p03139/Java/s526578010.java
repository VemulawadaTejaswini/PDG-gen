import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.next());

		int a = Integer.parseInt(scanner.next());

		int b = Integer.parseInt(scanner.next());


		int max = a > b ? b : a;

		int min = a + b - n;
		min = min > 0 ? min : 0;

		System.out.println(max + " " + min);
	}

}
