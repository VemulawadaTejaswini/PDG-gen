import java.util.ArrayList;
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

		List<Integer> list = new ArrayList<>();
		list.add(-1);
		List<TreeSet<Integer>> nexts = new ArrayList<>();
		for (int i = 0; i < 26; i++) {
			nexts.add(new TreeSet<>());
		}
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			int c = a[i] - 'a';
			nexts.get(c).add(i);
			set.add(c);
			if (set.size() == 26) {
				list.add(i);
				set = new HashSet<>();
			}
		}

		StringBuilder sb = new StringBuilder();
		int now = -1;
		for (int i = 0; i < list.size(); i++) {
			int idx = list.get(i);
			for (int j = 0; j < 26; j++) {
				if (i < list.size() - 1) {
					int next = nexts.get(j).higher(now);
					if (next > idx) {
						sb.append((char) ('a' + j));
						now = next;
						break;
					}
				} else {
					if (nexts.get(j).higher(now) == null) {
						sb.append((char) ('a' + j));
						break;
					}
				}
			}
		}
		System.out.println(sb.toString());
	}
}
