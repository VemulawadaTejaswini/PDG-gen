import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		long[] A = new long[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
		long[] sums = new long[N];
		sums[0] = A[0];
		for (int i = 1; i < N; ++i) {
			sums[i] = A[i] + sums[i - 1];
		}
		long totalLength = sums[N - 1];
		long halfLength = totalLength / 2;
		int index = Arrays.binarySearch(sums, halfLength);
		if (index >= 0) {
			if (totalLength % 2 == 0) {
				// なにもやる必要がない
				System.out.println("0");
			} else {
				// どちらかを1つ延ばす必要がある
				System.out.println("1");
			}
		} else {
			long target = sums[-1 * index - 1];
			long result = Math.abs(target - halfLength) + Math.abs(totalLength - halfLength - target);
			System.out.println(result);
		}

	}

}
