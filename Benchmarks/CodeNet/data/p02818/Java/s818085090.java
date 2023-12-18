import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long A = in.nextLong();
		long B = in.nextLong();
		long K = in.nextLong();
		if (A >= K) {
			System.out.println((A - K) + " " + B);
		} else {
			K -= A;
		}

		if (B >= K) {
			System.out.println(0 + " " + (B - K));
		} else {
			System.out.println(0 + " " + 0);
		}
		in.close();
	}
}