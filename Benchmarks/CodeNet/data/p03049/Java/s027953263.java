
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static int countAB(final String text) {
		int count = 0;
		int index = 0;
		while (true) {
			index = text.indexOf("AB", index);
			if (index < 0)
				return count;
			count += 1;
			index += 2;
		}
	}

	public static int solve(final String[] in) {
		int beginsWithB = 0;
		int endsWithA = 0;
		int sum = 0;
		int both = 0;
		for (int i = 0; i < in.length; ++i) {
			final String si = in[i].trim();
			final boolean b = si.charAt(0) == 'B';
			final boolean a = si.charAt(si.length() - 1) == 'A';
			if (a && b) {
				++both;
			} else {
				if (a)
					++endsWithA;
				if (b)
					++beginsWithB;
			}
			sum += countAB(si);
		}
		
		sum += Math.max(both - 1, 0);
		if (both > 0) {
			if (endsWithA > 0) {
				sum += 1;
				endsWithA -= 1;
			}
			if (beginsWithB > 0) {
				sum += 1;
				beginsWithB -= 1;
			}
		}

		sum += Math.min(endsWithA, beginsWithB);
		return sum;
	}

	public static void main(final String[] args) {
		@SuppressWarnings("resource")
		final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		final int N = in.nextInt();

		final String[] S = new String[N];
		for (int i = 0; i < N; ++i) {
			S[i] = in.next().trim();
		}
		System.out.println(solve(S));
	}
}
