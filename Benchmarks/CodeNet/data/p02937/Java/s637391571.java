import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String t = br.readLine();
		br.close();

		List<TreeSet<Integer>> list = new ArrayList<>(26);
		for (int i = 0; i < 26; i++) {
			list.add(new TreeSet<>());
		}

		int n = s.length();
		for (int i = 0; i < n; i++) {
			int k = s.charAt(i) - 'a';
			list.get(k).add(i);
			list.get(k).add(i + n);
		}

		long base = 0;
		int idx = -1;
		for (int i = 0; i < t.length(); i++) {
			int k = t.charAt(i) - 'a';
			Integer j = list.get(k).higher(idx);
			if (j == null) {
				System.out.println(-1);
				return;
			}
			idx = j;
			if (idx >= n) {
				base += n;
				idx -= n;
			}
		}
		System.out.println(base + idx + 1);
	}
}
