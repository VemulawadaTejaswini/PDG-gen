import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long X = Math.abs(scan.nextLong());
		long K = scan.nextLong();
		long D = scan.nextLong();

		if (X - (K * D) < 0) {
			long i = K - Math.floorDiv(X, D);
			if (i % 2 == 0) System.out.println(X % D);
			else System.out.println(D - (X % D));
		}
		else System.out.println(X - (K * D));
 	}
}