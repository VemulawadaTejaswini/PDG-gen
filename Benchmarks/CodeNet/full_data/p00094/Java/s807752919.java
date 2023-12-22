import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	private static final double PING = 3.305785;

	public static void main(String[] args) {
		int am = sc.nextInt();
		int bm = sc.nextInt();

		double ans = ((double)am * (double)bm) / PING;

		System.out.println(ans);
	}

}