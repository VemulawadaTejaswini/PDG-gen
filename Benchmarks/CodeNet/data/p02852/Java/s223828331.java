import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		char[] s = br.readLine().toCharArray();
		br.close();

		List<Integer> list = new ArrayList<>();
		int idx = n;
		while (idx > 0) {
			int bef = idx;
			for (int i = Math.max(idx - m, 0); i < idx; i++) {
				if (s[i] == '0') {
					list.add(idx - i);
					idx = i;
				}
			}
			if (bef == idx) {
				System.out.println(-1);
				return;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = list.size() - 1; i >= 0; i--) {
			sb.append(list.get(i)).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
