import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		List<List<Integer>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(b);
			list.get(b).add(a);
		}
		br.close();

		ArrayDeque<Integer> que = new ArrayDeque<>();
		que.add(0);
		que.add(list.get(0).get(0));
		Set<Integer> set = new HashSet<>();
		set.add(0);
		set.add(list.get(0).get(0));
		while (true) {
			boolean flg = true;
			List<Integer> list1 = list.get(que.peekFirst());
			for (Integer o : list1) {
				if (!set.contains(o)) {
					que.addFirst(o);
					set.add(o);
					flg = false;
					break;
				}
			}
			List<Integer> list2 = list.get(que.peekLast());
			for (Integer o : list2) {
				if (!set.contains(o)) {
					que.addLast(o);
					set.add(o);
					flg = false;
					break;
				}
			}
			if (flg) {
				break;
			}
		}

		System.out.println(que.size());
		StringBuilder sb = new StringBuilder();
		for (int i : que) {
			sb.append(i + 1).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
