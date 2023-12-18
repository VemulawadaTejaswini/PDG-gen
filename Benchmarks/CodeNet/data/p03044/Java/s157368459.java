import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(bf.readLine());

			// 各頂点につながっている頂点・距離をまとめる
			Map<Integer, Map<Integer, Integer>> connectMap = new HashMap<Integer, Map<Integer, Integer>>();
			for (int i = 1; i < n; i++) {
				String[] input = bf.readLine().split(" ");
				int from = Integer.parseInt(input[0]);
				int to = Integer.parseInt(input[1]);
				int range = Integer.parseInt(input[2]);

				if (!connectMap.containsKey(from)) {
					connectMap.put(from, new HashMap<Integer, Integer>());
				}
				connectMap.get(from).put(to, range);
				if (!connectMap.containsKey(to)) {
					connectMap.put(to, new HashMap<Integer, Integer>());
				}
				connectMap.get(to).put(from, range);
			}
			bf.close();

			// 頂点番号1を基準に、そこからの距離が偶数なら同色、違ったら異色に塗り替えていく
			int start = 1;
			int[] colors = new int[n + 1];
			colors[start] = 1;
			for (Integer next : connectMap.get(start).keySet()) {
				changeColor(start, next, connectMap, colors);
			}

			// 出力
			for (int i = 1; i < colors.length; i++) {
				System.out.println(colors[i]);
			}
		} catch (Exception e) {
		}
	}

	private static void changeColor(int from, int curr, Map<Integer, Map<Integer, Integer>> connectMap, int[] colors) {

		// 距離が偶数なら前の頂点と同じ色、奇数なら違う色（0→1 or 1→0）
		int range = connectMap.get(from).get(curr);
		colors[curr] = (range % 2 == 0 ? colors[from] : Math.abs(colors[from] - 1));

		// 現在の頂点につながっているほかの頂点にも同じことを繰り返す
		for (Integer next : connectMap.get(curr).keySet()) {
			if (next == from) {
				continue;
			}
			changeColor(curr, next, connectMap, colors);
		}
	}
}
