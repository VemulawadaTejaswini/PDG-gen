import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		long N = Long.parseLong(in.readLine());
		in.close();

		List<Long> list = new ArrayList<>();
		for (long i = 1; i < Math.sqrt((double) N); ++i) {
			if (N % i == 0) {
				// list.add(i);
				list.add(((N - i) / i));
			}
		}
		Collections.sort(list);
		long result = 0;
		for (Long val : list) {
			result += val;
		}

		System.out.println(result);
	}

}