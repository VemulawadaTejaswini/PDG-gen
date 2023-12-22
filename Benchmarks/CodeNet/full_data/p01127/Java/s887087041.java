import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();

			char[][] result = new char[h][];
			for (int j = 0; j < result.length; j++) {
				String line = sc.next();
				result[j] = line.toCharArray();
			}

			Map<Character, Integer[]> map = new HashMap<Character, Integer[]>();
			HashMap<Character, ArrayList<Character>> underBy = new HashMap<Character, ArrayList<Character>>();
			for (int j = 0; j < result.length; j++) {
				for (int k = 0; k < result[j].length; k++) {
					if (result[j][k] != '.') {
						if (map.get(result[j][k]) == null) {
							Integer[] put = { j, k, j, k };
							map.put(result[j][k], put);
							underBy.put(result[j][k],
									new ArrayList<Character>());
						} else {
							Integer[] get = map.get(result[j][k]);
							map.get(result[j][k])[0] = Math.min(get[0], j);
							map.get(result[j][k])[1] = Math.min(get[1], k);
							map.get(result[j][k])[2] = Math.max(get[2], j);
							map.get(result[j][k])[3] = Math.max(get[3], k);
						}
					}
				}
			}

			boolean safe = true;

			check: for (Map.Entry<Character, Integer[]> entry : map.entrySet()) {
				char key = entry.getKey();
				Integer[] get = map.get(key);

				for (int j = get[0]; j <= get[2]; j++) {
					for (int k = get[1]; k <= get[3]; k++) {
						if (result[j][k] == '.') {
							// 明らかに長方形でない時
							System.out.println("SUSPICIOUS");
							safe = false;
							break check;
						} else if (result[j][k] != key) {
							// 別の文字がかぶっている時
							// keyの上にresult[j][k]
							underBy.get(key).add(result[j][k]);
						}
					}
				}
			}

			if (!safe) {
				continue;
			}

			check: for (Map.Entry<Character, ArrayList<Character>> entry : underBy
					.entrySet()) {
				Deque<Character> deque = new ArrayDeque<Character>();
				for (Character character : entry.getValue()) {
					deque.add(character);
				}
				while (!deque.isEmpty()) {
					char poll = deque.poll();
					if (poll == entry.getKey()) {
						// 明らかに長方形でない時
						System.out.println("SUSPICIOUS");
						safe = false;
						break check;
					}

					for (Character character : underBy.get(poll)) {
						deque.add(character);
					}
				}

			}

			if (safe) {
				System.out.println("SAFE");
			}
		}
		sc.close();
	}
}