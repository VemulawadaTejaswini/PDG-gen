import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		if (A >= K) {
			System.out.print((A - K) + " " + B);
		} else {
			System.out.print(0 + " " + (B - K + A));
		}
	}
}