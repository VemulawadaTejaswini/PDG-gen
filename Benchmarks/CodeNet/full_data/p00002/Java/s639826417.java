import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		while ((a = scan.nextInt()) != 0 && (b = scan.nextInt()) != 0) {
			System.out.println(String.valueOf(a + b).length());
		}
	}
}