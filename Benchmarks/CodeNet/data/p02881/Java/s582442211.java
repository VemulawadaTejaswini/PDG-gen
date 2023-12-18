import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		
		long A = 0L;
		long B = 0L;
		long C = N;

		for (int i = 1; i <= Math.sqrt(N); i++) {
			if (N % i == 0) {
				if (i + (N/i) < C) {
					A = i;
					B = N/i;
					C = A + B;
				}
			}
		}
		if (A == 0) {
			System.out.println(N - 1);
		} else {
			System.out.println((A-1) + (B-1));
		}
		
	}

}
