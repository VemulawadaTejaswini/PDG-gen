import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String[] tokens = in.readLine().split(" ");
		long X = Long.parseLong(tokens[0]);
		long Y = Long.parseLong(tokens[1]);

		long val = X;
		List<Long> list = new ArrayList<>();
		while (val <= Y) {
			list.add(val);
			val *= 2;
		}
		System.out.println(list.size());
	}
}