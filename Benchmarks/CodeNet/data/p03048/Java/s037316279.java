import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		@SuppressWarnings("resource")
		final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		final int R = in.nextInt();
		final int G = in.nextInt();
		final int B = in.nextInt();
		final int N = in.nextInt();

		int ans = solve(R, G, B, N);
		// N = R * r + G * g + B * b
		System.out.println(ans);
	}

	static int solve(int R, int G, int B, int N) {
		int ans = 0;
		for (int r = 0; r <= 3000; ++r)
			for (int g = 0; g <= 3000; ++g) {
				final int rest = N - r * R - g * G;
				if (rest < 0)
					continue;
				if (rest % B != 0)
					continue;
				++ans;
			}
		return ans;
	}
}
