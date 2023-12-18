import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());

		List<Integer> sosuu = sosuuList(100000);
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(sosuu);

		int[] sum = new int[1000001];
		int cnt = 0;
		for (int i = 1; i < sum.length; i++) {
			if (i % 2 == 1 && set.contains(i) && set.contains((i + 1) / 2)) {
				cnt++;
			}
			sum[i] = cnt;
		}

		for (int i = 0; i < q; i++) {
			String[] sa = br.readLine().split(" ");
			int l = Integer.parseInt(sa[0]);
			int r = Integer.parseInt(sa[1]);
			System.out.println(sum[r] - sum[l - 1]);
		}
		br.close();
	}

	static List<Integer> sosuuList(int n) {
		List<Integer> sosuu = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
			int r = (int) Math.sqrt(i);
			boolean flg = false;
			for (Integer o : sosuu) {
				if (r < o) {
					break;
				}
				if (i % o == 0) {
					flg = true;
					break;
				}
			}
			if (!flg) {
				sosuu.add(i);
			}
		}
		return sosuu;
	}
}
