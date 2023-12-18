import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final long K = sc.nextLong();
		final long A = sc.nextLong();
		final long B = sc.nextLong();

		if (B - A <= 2) {
			System.out.println(1L + K);
		} else if (K <= A) {
			System.out.println(1L + K);
		} else {
			long ops = K - A - 1L;
			long boost = B - A;
			long units = ops / 2;
			long r = ops % 2;

			System.out.println(B + boost * units + r);
		}
		sc.close();
	}

}
