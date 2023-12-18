import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		int N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		long[] H = new long[N];
		for (int i = 0; i < N; ++i) {
			H[i] = Long.parseLong(tokens[i]);
		}

		H[0]--;
		boolean enable = true;
		for (int i = 1; i < N; ++i) {
			if (H[i - 1] < H[i]) {
				H[i]--;
			}
			if (H[i - 1] > H[i]) {
				enable = false;
				break;
			}
		}
		String result = enable ? "Yes" : "No";
		System.out.println(result);

	}
}
