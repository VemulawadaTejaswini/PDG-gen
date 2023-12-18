import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TreeMap<Integer, Integer> map = new TreeMap<>();
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int a = scan.nextInt();
			if (!map.containsKey(a)) {
				map.put(a, 1);
			} else {
				int temp = map.get(a);
				map.put(a, temp + 1);
			}
		}
		int sq = 1;
		int count = 0;
		int len = map.size();
		for (int i = 0; i < len; i++) {
			Entry<Integer, Integer> ans = map.pollLastEntry();
			if (ans.getValue() >= 4) {
				System.out.println(ans.getKey() * 2);
				return;
			} else if (ans.getValue() >= 2) {
				sq = sq * ans.getKey();
				count++;
				if (count >= 2) {
					System.out.println(sq);
					return;
				}
			}
		}
		System.out.println(0);

	}
}