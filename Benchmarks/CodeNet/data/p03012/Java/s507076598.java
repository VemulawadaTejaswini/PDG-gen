
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());

		int[] W = new int[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			W[i] = Integer.parseInt(tokens[i]);
		}

		int r = calc(W);
		System.out.println(r);

	}

	static int calc(int[] W) {
		int sum = 0;
		for (int i = 0; i < W.length; ++i) {
			sum += W[i];
		}

		int s = 0;
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < W.length; ++i) {
			s += W[i];
			int diff = Math.abs((sum - s) - s);
			result = Math.min(diff, result);
		}
		return result;
	}

}
