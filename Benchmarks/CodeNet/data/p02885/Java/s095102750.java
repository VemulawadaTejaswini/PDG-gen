import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();

		Integer result = a - 2 * b > 0 ? a - 2 * b : 0;

		System.out.println(result);
	}



}
