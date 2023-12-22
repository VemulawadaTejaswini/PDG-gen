import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	long[] A;
	long count;
	Map<Long, Set<Integer>> upperMap;
	Map<Long, Set<Integer>> lowerMap;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		tokens = in.readLine().split(" ");
		A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
		upperMap = new HashMap<>();
		lowerMap = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			long upper = A[i] + i;
			long lower = i - A[i];
			if (!upperMap.containsKey(upper)) {
				upperMap.put(upper, new HashSet<>());
			}
			upperMap.get(upper).add(i);
			if (!lowerMap.containsKey(lower)) {
				lowerMap.put(lower, new HashSet<>());
			}
			lowerMap.get(lower).add(i);
		}
	}

	void calc() {
		for(Long upper: upperMap.keySet()) {
			if(lowerMap.containsKey(upper)) {
				count += upperMap.get(upper).size() * lowerMap.get(upper).size();
			}
		}
		System.out.println(count);
	}

	void showResult() {
	}
}
