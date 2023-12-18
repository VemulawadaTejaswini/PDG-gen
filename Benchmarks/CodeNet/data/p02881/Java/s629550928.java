import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();

		long i = 2;
		long M = (long) Math.sqrt(N);

		long movement = N-1;
		for (i = 2; i < M; i++) {
			if (N % i == 0) {
				long j = N / i;
				if ((i + j - 2) < movement)
					movement = i + j - 2;
			}
		}

		System.out.println(movement);
		sc.close();
	}

}
