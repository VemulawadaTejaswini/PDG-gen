import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int D = Integer.parseInt(tokens[1]);
		int result = (N / (2 * D + 1));
		if (N % (2 * D + 1) != 0) {
			result++;
		}
		System.out.println(result);
	}
}
