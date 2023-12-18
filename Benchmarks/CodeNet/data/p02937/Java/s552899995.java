import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		char[] t = sc.nextLine().toCharArray();

		Map<Character, List<Integer>> s_map = new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			List<Integer> idx_list = s_map.get(s[i]);
			if (idx_list == null) {
				idx_list = new ArrayList<>();
				s_map.put(s[i], idx_list);
			}
			idx_list.add(i);
		}

		for (char ti : t) {
			if (!s_map.containsKey(ti)) {
				System.out.println(-1);
				return;
			}
		}

		int s_idx = 0, t_idx = 0;
		long ans = 0;
		while (true) {
			if (s[s_idx] == t[t_idx]) t_idx++;
			if (t_idx == t.length) break;

			int next_idx;
			List<Integer> idx_list = s_map.get(t[t_idx]);
			if (s_idx > idx_list.get(idx_list.size() - 1) || s_idx < idx_list.get(0) || idx_list.size() == 1) {
				next_idx = idx_list.get(0);
			}
			else {
				next_idx = idx_list.get(-Collections.binarySearch(idx_list, s_idx));
			}

			ans += next_idx > s_idx ? next_idx - s_idx : s.length - s_idx + next_idx;
			s_idx = next_idx;
		}

		System.out.println(ans + 1);
	}
}