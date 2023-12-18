import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		sc.close();

		List<TreeSet<Integer>> nexts = new ArrayList<>();
		for (int i = 0; i < 26; i++) {
			nexts.add(new TreeSet<>());
		}
		for (int i = 0; i < a.length; i++) {
			int c = a[i] - 'a';
			nexts.get(c).add(i);
		}

		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int i = a.length - 1; i >= 0; i--) {
			int c = a[i] - 'a';
			set.add(c);
			if (set.size() == 26) {
				list.add(i);
				set = new HashSet<>();
			}
		}
		Collections.reverse(list);
		list.add(a.length);

		StringBuilder sb = new StringBuilder();
		int now = -1;
		for (int i = 0; i < list.size(); i++) {
			int idx = list.get(i);
			for (int j = 0; j < 26; j++) {
				if (i == list.size() - 1) {
					if (nexts.get(j).higher(now) == null) {
						sb.append((char) ('a' + j));
						break;
					}
				} else {
					int next = nexts.get(j).higher(now);
					if (next >= idx) {
						boolean flg = false;
						for (int k = 0; k < 26; k++) {
							Integer next2 = nexts.get(k).higher(next);
							if (next2 == null || next2 >= list.get(i + 1)) {
								flg = true;
								break;
							}
						}
						if (flg) {
							sb.append((char) ('a' + j));
							now = next;
							break;
						}
					}
				}
			}
		}
		System.out.println(sb.toString());
	}
}
