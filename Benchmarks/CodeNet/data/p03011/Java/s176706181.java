import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int p = scan.nextInt();
		int q = scan.nextInt();
		int r = scan.nextInt();

		System.out.println(p + q + r - Math.max(Math.max(p, q), r));
	}
}