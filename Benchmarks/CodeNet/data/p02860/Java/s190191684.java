import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		String S = in.readLine();
		boolean result = false;
		if (N % 2 == 0) {
			String s1 = S.substring(0, N / 2);
			String s2 = S.substring(N / 2, N);
			if (s1.equals(s2)) {
				result = true;
			}
		}
		System.out.println((result ? "Yes" : "No"));
	}
}
