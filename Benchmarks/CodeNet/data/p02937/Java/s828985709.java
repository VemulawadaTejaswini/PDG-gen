import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s_str = sc.nextLine();
		char[] s = s_str.toCharArray();
		char[] t = sc.nextLine().toCharArray();

		List<List<Integer>> t_idx_list = new ArrayList<>();
		for (int i = 0; i < t.length; i++) {
			t_idx_list.add(new ArrayList<>());
			for (int j = 0; j < s.length; j++) {
				if (t[i] == s[j]) {
					t_idx_list.get(i).add(j);
				}
			}
		}
		for (List<Integer> t_idx : t_idx_list) {
			if (t_idx.isEmpty()) {
				System.out.println(-1);
				return;
			}
		}

		int s_idx = 0, t_idx = 0;
		long ans = 0;
		while (true) {
			if (s[s_idx] == t[t_idx]) {
				t_idx++;
			}
			if (t_idx == t.length) {
				break;
			}

			int next = s.length;
			for (int idx : t_idx_list.get(t_idx)) {
				if (idx > s_idx) {
					next = Math.min(next, idx);
				}
				else {
					next = idx;
				}
			}

			if (next > s_idx) {
				ans += next - s_idx;
			}
			else {
				ans += s.length - s_idx + next;
			}
			s_idx = next;
		}

		System.out.println(ans + 1);
	}
}