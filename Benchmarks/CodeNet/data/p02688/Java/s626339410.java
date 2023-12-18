import java.util.*;

public class Main {

	private static List<Integer> getStrings(Scanner sc, int num) {
		List<Integer> stringList = new ArrayList<>();
		while(num>0) {
			int nextInt = sc.nextInt();
			stringList.add(nextInt);
			num--;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<List<Integer>> lists = new ArrayList<>();
		while(k>0) {
			int d = sc.nextInt();
			List<Integer> list = getStrings(sc, d);
			lists.add(list);
			k--;
		}

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < lists.size(); i++) {
			List<Integer> cur = lists.get(i);
			for (int j = 0; j < cur.size(); j++) {
				set.add(cur.get(j));
			}
		}
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (!set.contains(i)) {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
