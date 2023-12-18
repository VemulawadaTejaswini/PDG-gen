import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		long N = Long.parseLong(tokens[0]);
		if (N % conv(tokens[0]) == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	static int conv(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); ++i) {
			result += Integer.parseInt(s.substring(i, i + 1));
		}
		return result;
	}
}