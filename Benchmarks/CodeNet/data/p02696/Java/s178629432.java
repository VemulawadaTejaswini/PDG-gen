import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();

		long max = 0;
		//		long startp = Math.min(B, N);
		//		HashSet<Long> nSet = new HashSet<Long>();
		//		for (long i = startp; i <= N; i++) {
		//			nSet.add(i);
		//		}

		//		for (long i : nSet) {
		//			long tmp = floor(A * i, B) - A * floor(i, B);
		//			max = Math.max(max, tmp);
		//		}
		long i = 0;
		if (B <= N) {
			i = B - 1;
		} else {
			i = N;
		}
		long tmp = floor(A * i, B) - A * floor(i, B);

		System.out.println(tmp);
	}

	private static long floor(long a, long b) {
		return a / b;

	}
}
