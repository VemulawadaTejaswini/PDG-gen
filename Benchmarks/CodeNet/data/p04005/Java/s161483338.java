import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long A = in.nextLong();
		long B = in.nextLong();
		long C = in.nextLong();
		if (A % 2 == 0 || B % 2 == 0 || C % 2 == 0) {
			System.out.println(0);
		} else {
			long sum = A + B + C;
			long min = Math.min(A, Math.min(B, C));
			long max = Math.max(A, Math.max(B, C));
			System.out.println(min * max);
		}
		in.close();
	}
}