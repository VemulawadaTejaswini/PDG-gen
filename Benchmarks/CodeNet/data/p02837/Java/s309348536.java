import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {

			// 人数
			int n = sc.nextInt();
			List<Map<Integer, Integer>> list = new ArrayList<>();
			for(int i = 0 ; i < n ; i++) {
				Map<Integer, Integer> map = new HashMap<>();
				int a = sc.nextInt();
				for(int j = 0 ; j < a ; j++) {
					map.put(sc.nextInt(), sc.nextInt());
				}
				list.add(map);
			}
			// 全検索
			int ans = 0;
			ONE: for(long i = 0 ; i < 1L << n ; i++) {
				// 正直判定
				Integer[] judge = new Integer[n];
				int sum = 0;
				for(int j = 0 ; j < n ; j++) {
					if((1 & i >> j) == 1 || (judge[j] != null && judge[j] == 1)) {
						judge = isHonest(judge, list, j);
						if(judge == null) continue ONE;
					}
				}
				for(Integer j : judge) {
					if(j != null && j.intValue() == 1) {
						sum++;
					}
				}
				ans = Math.max(ans, sum);
			}

			System.out.println(ans);

		}

	}

	private static Integer[] isHonest(Integer[] judge, List<Map<Integer, Integer>> list, int listIndex) {
		for(Map.Entry<Integer, Integer> entry : list.get(listIndex).entrySet()) {
			if(judge[entry.getKey() - 1] == null && entry.getValue() == 1) {
				judge[entry.getKey() - 1] = entry.getValue();
				judge = isHonest(judge, list, entry.getKey() - 1);
				if(judge == null) {
					return null;
				}
			}
			else if(judge[entry.getKey() - 1] == null && entry.getValue() == 0) {
				judge[entry.getKey() - 1] = entry.getValue();
			}
			else if(judge[entry.getKey() - 1].intValue() != entry.getValue()) {
				return null;
			}
		}
		if(judge != null) {
			judge[listIndex] = 1;
		}
		return judge;
	}

}
