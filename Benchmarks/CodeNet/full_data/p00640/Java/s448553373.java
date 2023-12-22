import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Problem D: Distorted Love
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Comparator<int[]> cmp = new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] != o2[0]) {
					return Integer.compare(o1[0], o2[0]);
				} else {
					return Integer.compare(o1[1], o2[1]);
				}
			}
		};

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			//????????¨??????
			br.readLine();

			Map<String, Map<int[], String>> pages = new HashMap<>();
			Deque<String> stackF, stackB;
			stackF = new ArrayDeque<>();
			stackB = new ArrayDeque<>();

			for (int i = 0; i < n; i++) {
				words = br.readLine().split(" ");

				String name = words[0];
				int b = parseInt(words[1]);

				pages.put(name, new TreeMap<>(cmp));

				for (int j = 0; j < b; j++) {
					words = br.readLine().split(" ");
					int[] pos = new int[4];
					for (int k = 0; k < 4; k++) {
						pos[k] = parseInt(words[k]);
					}
					pages.get(name).put(pos, words[4]);
				}
				if (i == 0) {
					stackF.push(name);
				}
			}

			int m = parseInt(br.readLine());

			for (int i = 0; i < m; i++) {
				words = br.readLine().split(" ");

				String op = words[0];

				switch (op) {
					case "click":
						int x = parseInt(words[1]);
						int y = parseInt(words[2]);
						String page = stackF.peek();
						Map<int[], String> btns = pages.get(page);
						for (int[] btn : btns.keySet()) {
							if (btn[0] <= x && x <= btn[2]
									&& btn[1] <= y && y <= btn[3]) {
								stackF.push(btns.get(btn));
								stackB.clear();
							}
						}
						break;
					case "back":
						if (stackF.size() > 1) {
							stackB.push(stackF.pop());
						}
						break;
					case "forward":
						if (!stackB.isEmpty()) {
							stackF.push(stackB.pop());
						} break;
					case "show":
						System.out.println(stackF.peek());
						break;
				}
			}
		}
	}
}