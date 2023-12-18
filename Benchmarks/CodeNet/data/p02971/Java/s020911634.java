import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		int[] A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(in.readLine());
		}

		Map<Integer, Set<Integer>> map = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			if (!map.containsKey(A[i])) {
				map.put(A[i], new HashSet<>());
			}
			map.get(A[i]).add(i);
		}
		int max = Integer.MIN_VALUE;
		int nextMax = Integer.MIN_VALUE;
		for (int i = 0; i < N; ++i) {
			int temp = -1;
			if (max < A[i]) {
				temp = max;
				max = A[i];
			}
			if (temp >= 0) {
				// 置換が実施された
				if (nextMax < temp) {
					nextMax = temp;
				}
			} else {
				if (max > A[i] && nextMax < A[i]) {
					nextMax = A[i];
				}
			}
		}

		for (int i = 0; i < N; ++i) {
			if (A[i] != max) {
				System.out.println(max);
			} else {
				if (map.get(A[i]).size() >= 2) {
					System.out.println(max);
				} else {
					System.out.println(nextMax);
				}
			}
		}
	}
}