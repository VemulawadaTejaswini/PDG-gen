import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		sc.close();

		List<TreeSet<Integer>> list = new ArrayList<>();
		for (int i = 0; i < 26; i++) {
			list.add(new TreeSet<>());
		}
		for (int i = 0; i < s.length; i++) {
			int c = s[i] - 'a';
			list.get(c).add(i);
			list.get(c).add(i + s.length);
		}

		long a = 0;
		int now = -1;
		for (int i = 0; i < t.length; i++) {
			int c = t[i] - 'a';
			int d = (int) (now % s.length);
			Integer next = list.get(c).higher(d);
			if (next == null) {
				System.out.println(-1);
				return;
			}
			if (next >= s.length) {
				a++;
				next -= s.length;
			}
			now = next;
		}
		System.out.println(a * s.length + now + 1);
	}
}
