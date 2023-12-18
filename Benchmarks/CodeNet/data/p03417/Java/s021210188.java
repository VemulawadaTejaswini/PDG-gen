import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		long M = in.nextLong();
		if (N == 1 && M == 1) {
			System.out.println(1);
		} else if (N == 1 || M == 1) {
			System.out.println(N * M - 2);
		} else {
			System.out.println((N * (M - 2)) - (M - 2) * 2);
		}
		in.close();
	}
}
