import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int K = Integer.parseInt(tokens[1]);
		Integer[] nums = new Integer[N];
		Arrays.fill(nums, 0);
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			int A = Integer.parseInt(tokens[i]) - 1;
			nums[A]++;
		}
		Arrays.sort(nums, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return -1 * Integer.compare(o1, o2);
			}
		});
		int num = 0;
		for (int i = K; i < N; ++i) {
			if (nums[i] > 0) {
				num += nums[i];
			} else {
				break;
			}
		}
		System.out.println(num);
	}
}
