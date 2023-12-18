import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
		int m = Integer.MAX_VALUE;

		m = Math.min(m, (p + q));
		m = Math.min(m, (p + r));
		m = Math.min(m, (q + r));

		System.out.println(m);
	}
}
