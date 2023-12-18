import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();

		if (Math.max(Math.max(p, q), r) == p) {
			System.out.print(q + r);
		} else if (Math.max(Math.max(p, q), r) == q) {
			System.out.print(p + r);
		} else {
			System.out.print(p + q);
		}
	}
}