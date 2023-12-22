import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.lang.Integer.parseInt;

/**
 * Watchin' TVA
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N = parseInt(line);
			if (N == 0) break;

			Map<Integer, Map<String, Integer>> progs = new HashMap<>();

			for (int i = 0; i < N; i++) {
				words = br.readLine().split(" ");

				String name = words[0];
				int weekday = parseInt(words[1]);
				int start;

				if (words[2].length() == 3) {
					start = parseInt(words[2].substring(0, 1)) * 60;
					start += parseInt(words[2].substring(1));
				} else {
					start = parseInt(words[2].substring(0, 2)) * 60;
					start += parseInt(words[2].substring(2));
				}

				progs.putIfAbsent(weekday, new HashMap<>());
				progs.get(weekday).put(name, start);
			}

			int P = parseInt(br.readLine());

			Set<String> favs = new HashSet<>();

			for (int i = 0; i < P; i++) {
				favs.add(br.readLine());
			}

			//
			int count = 0;

			outer:
			for (int i = 0; i < 7; i++) {

				if (!progs.containsKey(i)) continue;

				int[] time = new int[29 * 60 + 30];

				for (Map.Entry<String, Integer> prog : progs.get(i).entrySet()) {
					if (favs.contains(prog.getKey())) {
						time[prog.getValue()] += 1;
						time[prog.getValue() + 30] -= 1;
						count++;
					}
				}

				for (int j = 1; j < time.length; j++) {
					time[j] += time[j - 1];
					if (time[j] > 1) {
						count = -1;
						break outer;
					}
				}

				for (Map.Entry<String, Integer> prog : progs.get(i).entrySet()) {
					if (!favs.contains(prog.getKey())) {
						int start = prog.getValue();
						if (time[start] == 0 && time[start + 29] == 0) {
							for (int j = start; j <= start + 29; j++) {
								time[j] = 1;
							}
							count++;
						}
					}
				}
			}

			System.out.println(count);
		}
	}
}