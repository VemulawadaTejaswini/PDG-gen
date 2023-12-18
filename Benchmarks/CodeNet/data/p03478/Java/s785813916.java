
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int A = Integer.parseInt(tokens[1]);
		int B = Integer.parseInt(tokens[2]);
		int result = 0;
		for (int i = 1; i <= N; ++i) {
			int conv = conv(i);
			if (conv >= A && conv <= B) {
				result += i;
			}
		}
		System.out.println(result);
	}

	static int conv(int val) {
		String s = Integer.toString(val);
		int result = 0;
		for (int i = 0; i < s.length(); ++i) {
			result += Integer.parseInt(s.substring(i, i + 1));
		}
		return result;
	}
}