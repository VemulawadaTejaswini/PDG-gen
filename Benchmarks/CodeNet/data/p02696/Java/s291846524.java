import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();

		long max = 0;

		HashSet<Integer> nSet = new HashSet<Integer>();
		for (int i = 1; i <= N; i++) {
			nSet.add(i);
		}

		for (int i : nSet) {
			long tmp = floor(A * i, B) - A * floor(i, B);
			max = Math.max(max, tmp);
		}

		System.out.println(max);
	}

	private static long floor(long a, long b) {
		return a / b;

	}
}
