import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			List<Set<Integer>> s_list = new ArrayList<>();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			Set<Integer> s = new HashSet<>();
			s.add(x);
			s.add(y);
			Set<Integer> s_sum = new HashSet<>();
			s_sum.add(x);
			s_sum.add(y);
			s_list.add(s);
			for (int i = 1; i < m; i++) {
				x = sc.nextInt();
				y = sc.nextInt();
				z = sc.nextInt();
				s_sum.add(x);
				s_sum.add(y);
				boolean exist = false;
				for (Set<Integer> s_sub : s_list) {
					if (s_sub.contains(x)) {
						s_sub.add(y);
						exist = true;
					}
					else if (s_sub.contains(y)) {
						s_sub.add(x);
						exist = true;
					}
				}
				if (!exist) {
					s = new HashSet<>();
					s.add(x);
					s.add(y);
					s_list.add(s);
				}
			}
			System.out.println(s_list.size() + n - s_sum.size());
		}
	}
}