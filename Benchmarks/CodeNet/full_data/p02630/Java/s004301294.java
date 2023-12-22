import java.util.*;

public class Main {

	static Map<Long, Integer> map = new TreeMap<Long, Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long sum = 0;
		for (int i = 0; i < N; i++) {
			long a = sc.nextLong();
			if (!map.containsKey(a)) {
				map.put(a, 1);
			} else {
				map.put(a, map.get(a) + 1);
			}
			sum += a; // 初期の合計を計算
		}
		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			long b = sc.nextLong();
			long c = sc.nextLong();
			// Biが含まれない場合はスキップ
			if (!map.containsKey(b)) {
				System.out.println(sum);
				continue;
			}
			// BiをCiに置き換える
			int cnt = map.get(b);
			// sumの更新
			sum += (c - b) * (long) cnt;
			// Map操作
			map.remove(b);
			if (!map.containsKey(c)) {
				map.put(c, cnt);
			} else {
				map.put(c, map.get(c) + cnt);
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
