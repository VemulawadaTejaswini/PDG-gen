import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();
		int m = scan.nextInt();

		int count = 0;
		for (int i = 1 ; i < n ; i++) {
			count += i;
		}
		for (int i = 1 ; i < m ; i++) {
			count += i;
		}
		System.out.println(count);

	}
}