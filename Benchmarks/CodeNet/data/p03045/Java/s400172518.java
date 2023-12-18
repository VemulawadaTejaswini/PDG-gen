import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String[] input1 = bf.readLine().split(" ");
			int n = Integer.parseInt(input1[0]);
			int m = Integer.parseInt(input1[1]);

			int magic = 0;
			Map<Integer, Set<Integer>> convination = new HashMap<Integer, Set<Integer>>();
			boolean[] cards = new boolean[n + 1];
			for (int i = 1; i <= m; i++) {
				String[] input2 = bf.readLine().split(" ");
				int ax = Integer.parseInt(input2[0]);
				int ay = Integer.parseInt(input2[1]);
				int z = Integer.parseInt(input2[1]);
				if (!convination.containsKey(ax)) {
					convination.put(ax, new HashSet<Integer>());
				}
				if (!convination.containsKey(ay)) {
					convination.put(ay, new HashSet<Integer>());
				}
				convination.get(ax).add(ay);
			}

			// 計算式で結ばれているものは、Ax、Ayいずれか一つが分かればもう片方も分かる
			for (Map.Entry<Integer, Set<Integer>> conv : convination.entrySet()) {
				int ones = conv.getKey();
				if (!cards[ones]) {
					magic++;
					cards[ones] = true;
				}
				for (Integer other : conv.getValue()) {
					cards[other] = true;
				}
			}

			// それでも分からないカードはひとつずつ魔法を使う
			for (int i = 1; i < n + 1; i++) {
				if (!cards[i]) {
					magic++;
				}
			}
			System.out.println(magic);
		} catch (IOException e1) {
		}
	}

}
