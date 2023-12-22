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
		if ((X / D + K % 2) % 2 == 0) {
			System.out.println(X % D);
		} else {
			System.out.println(-(X % D - D));
		}
	}
}