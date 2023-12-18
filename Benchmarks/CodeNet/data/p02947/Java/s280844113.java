import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		List<String> S = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			S.add(in.readLine());
		}
		Map<String, Integer> counts = new HashMap<>();
		for (String s : S) {
			String sorted = sortStr(s);
			if (counts.containsKey(sorted)) {
				counts.put(sorted, counts.get(sorted) + 1);
			} else {
				counts.put(sorted, 1);
			}
		}
		long result = 0;
		for (Integer num : counts.values()) {
			if (num > 1) {
				result += count(num);
			}
		}
		System.out.println(result);

	}

	static String sortStr(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}

	static long count(int val) {
		long result = (long) (val - 1);
		for (int i = val - 2; i >= 1; --i) {
			result += (long) i;
		}
		return result;
	}
}