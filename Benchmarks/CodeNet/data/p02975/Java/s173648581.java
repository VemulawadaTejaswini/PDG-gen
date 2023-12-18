import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args)  {
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

		if (allZero) {
			System.out.println("Yes");
			return;
		}
		Map<Long, Integer> counts = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			if (!counts.containsKey(a[i])) {
				counts.put(a[i], 1);
			} else {
				counts.put(a[i], counts.get(a[i]) + 1);
			}
		}
		if (counts.size() >= 4 || counts.size() == 1) {
			System.out.println("No");
			return;
		}

		if (counts.size() == 3) {
			List<Integer> nums = new ArrayList<>();
			nums.addAll(counts.values());
			Collections.sort(nums);
			if (nums.get(0) != nums.get(2)) {
				System.out.println("No");
				return;
			}
			List<Long> values = new ArrayList<>();
			values.addAll(counts.keySet());
			Collections.sort(values);
			long x = values.get(0);
			long y = values.get(1);
			long z = values.get(2);
			if ((x ^ y ^ z) == 0L) {
				System.out.println("Yes");
				return;
			} else {
				System.out.println("No");
				return;
			}
		} else { // counts == 2
			List<Long> keys = new ArrayList<>();
			keys.addAll(counts.keySet());
			Collections.sort(keys);
			if (keys.get(0) != 0L) {
				System.out.println("No");
			} else if ((counts.get(keys.get(0)) * 2) == counts.get(keys.get(1))) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			return;
		}
	}

}