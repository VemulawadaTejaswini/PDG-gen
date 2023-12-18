
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int Q = in.nextInt();
		char[] S = in.next().toCharArray();

		long[] result = new long[Q];
		Arrays.fill(result, 0);

		for (int i = 0; i < Q; i++) {
			int l = in.nextInt();
			int r = in.nextInt();
			long count = 0;
			while (l < r) {
				if (S[l - 1] == 'A' && S[l] == 'C') {
					count++;
				}
				l++;
			}
			result[i] = count;
		}
		Arrays.stream(result).forEach(System.out::println);
	}
}
