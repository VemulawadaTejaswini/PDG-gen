import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();
		if (X < 0) X = -X;
		if (X - K * D > 0) {
			System.out.println(X - K * D);
			return;
		}
		if ((X / D) % 2 == 0) {
			System.out.println(Math.min(X % D, -(X % D - 2 * D)));
		} else {
			System.out.println(Math.min((X % D + D), -(X % D - D)));
		}
	}
}
