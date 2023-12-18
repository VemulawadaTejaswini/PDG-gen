import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<List<Integer>> ans;
	static int num = 0;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 2; i < n + 2; i++) {
			int val = i * (i - 1) / 2;
			if (val == n) {
				System.out.println("Yes");
				System.out.println(i);
				ans = new ArrayList<>(i);
				int[] target = new int[i];
				for (int j = 0; j < i; j++) {
					ans.add(new ArrayList<>());
					target[j] = j;
				}
				combination(target, 2, new ArrayList<Integer>());
				for (int j = 0; j < i; j++) {
					StringBuilder sb = new StringBuilder();
					sb.append(ans.get(j).size()).append(' ');
					for (int s : ans.get(j)) {
						sb.append(s).append(' ');
					}
					sb.deleteCharAt(sb.length() - 1);
					System.out.println(sb.toString());
				}
				return;
			} else if (val > n) {
				System.out.println("No");
				return;
			}
		}
	}

	static void combination(int[] target, int k, List<Integer> list) {
		if (list.size() == k) {
			num++;
			for (int i : list) {
				ans.get(target[i]).add(num);
			}
			return;
		}

		int i = 0;
		if (!list.isEmpty()) {
			i = list.get(list.size() - 1) + 1;
			if (list.size() + target.length - i < k) {
				return;
			}
		}
		for ( ; i < target.length; i++) {
			list.add(i);
			combination(target, k, list);
			list.remove(list.size() - 1);
		}
	}
}
