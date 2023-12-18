import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());

		Map<Integer, Queue<Integer>> map = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			Queue<Integer> que = new ArrayDeque<Integer>();
			String[] tokens = in.readLine().split(" ");
			for (int j = 0; j < tokens.length; ++j) {
				que.add(Integer.parseInt(tokens[j]) - 1);
			}
			map.put(i, que);
		}

		int doneMatchNum = 0;
		boolean possible = true;
		int days = 0;
		while (doneMatchNum < ((N - 1) * N / 2)) {
			Set<Integer> done = new HashSet<>();
			Set<Integer> keySet = new HashSet<>();
			keySet.addAll(map.keySet());
			for (Integer key : keySet) {
				if (!map.containsKey(key)) {
					continue;
				}
				if (map.get(key).isEmpty()) {
					map.remove(key);
					continue;
				}
				int target = map.get(key).peek();
				if (done.contains(key) || done.contains(target)) {
					continue;
				}
				if (map.get(target).peek() == key) {
					// match
					done.add(key);
					done.add(target);
					map.get(key).poll();
					map.get(target).poll();
					++doneMatchNum;
					if (map.get(key).isEmpty()) {
						map.remove(key);
					}
					if (map.get(target).isEmpty()) {
						map.remove(target);
					}
				}
			}
			if (done.isEmpty()) {
				possible = false;
				break;
			}
			++days;
		}
		if (!possible) {
			System.out.println("-1");
		} else {
			System.out.println(days);
		}

	}

}