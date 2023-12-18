import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			long A = scn.nextLong();
			long B = scn.nextLong();
			long N = scn.nextLong();

			N = Math.min(B-1, N);

			System.out.println(Math.floor(A*N/B) - A * (Math.floor(N/B)));
		}
	}
}

