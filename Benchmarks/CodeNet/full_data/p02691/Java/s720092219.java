import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	long[] A;
	long count;
	Map<Long, List<Long>> map;

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
		map = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			if (!map.containsKey(A[i])) {
				map.put(A[i], new ArrayList<Long>());
			}
			map.get(A[i]).add((long) i);
		}
	}

	long getCount(long heightA, long heightB, List<Long> indexesA, List<Long> indexesB) {
		long count = 0;
		long sum = heightA + heightB;
		for (Long indexA : indexesA) {
			long lowerIndexB = indexA - sum;
			long upperIndexB = sum + indexA;
			if (Collections.binarySearch(indexesB, lowerIndexB) >= 0) {
				if (indexA != lowerIndexB) {
					++count;
				}
			}
			if (Collections.binarySearch(indexesB, upperIndexB) >= 0) {
				if (indexA != upperIndexB) {
					++count;
				}
			}
		}
		return count;
	}

	void calc() {
		List<Long> keys = new ArrayList<>();
		keys.addAll(map.keySet());
		for (int i = 0; i < keys.size(); ++i) {
			for (int j = i; j < keys.size(); ++j) {
				long c = getCount(keys.get(i), keys.get(j), map.get(keys.get(i)), map.get(keys.get(j)));
				if (i != j) {
					count += c;
				} else {
					count += c / 2;
				}
			}
		}
		System.out.println(count);
	}

	void showResult() {
	}
}