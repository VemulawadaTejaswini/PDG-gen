import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		long[] a = new long[N];
		String[] tokens = in.readLine().split(" ");
		boolean allZero = true;
		for (int i = 0; i < N; ++i) {
			a[i] = Long.parseLong(tokens[i]);
			if (a[i] != 0L) {
				allZero = false;
			}
		}
		long value = 0L;
		for (int i = 0; i < N; ++i) {
			value = value ^ a[i];
		}
		if (allZero) {
			System.out.println("Yes");
		} else if ((value == 0) && (N % 3 == 0)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
