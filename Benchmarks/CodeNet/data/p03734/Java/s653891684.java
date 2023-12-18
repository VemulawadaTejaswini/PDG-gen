import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	static List<Integer> path;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < 4; i++) {
			list.add(new ArrayList<Integer>());
		}
		sa = br.readLine().split(" ");
		int w1 = Integer.parseInt(sa[0]);
		list.get(0).add(Integer.parseInt(sa[1]));

		for (int i = 1; i < n; i++) {
			sa = br.readLine().split(" ");
			int wi = Integer.parseInt(sa[0]);
			list.get(wi - w1).add(Integer.parseInt(sa[1]));
		}
		br.close();

		for (int i = 0; i < 4; i++) {
			List<Integer> li = list.get(i);
			Collections.sort(li);
			Collections.reverse(li);
			for (int j = 1; j < li.size(); j++) {
				li.set(j, li.get(j - 1) + li.get(j));
			}
		}

		long ans = 0;
		List<Integer> list0 = list.get(0);
		List<Integer> list1 = list.get(1);
		List<Integer> list2 = list.get(2);
		List<Integer> list3 = list.get(3);
		for (int a = 0; a <= list0.size(); a++) {
			long sum = w1 * a;
			if (sum > w) {
				break;
			}

			for (int b = 0; b <= list1.size(); b++) {
				sum += (w1 + 1) * b;
				if (sum > w) {
					sum -= (w1 + 1) * b;
					break;
				}

				for (int c = 0; c <= list2.size(); c++) {
					sum += (w1 + 2) * c;
					if (sum > w) {
						sum -= (w1 + 2) * c;
						break;
					}

					for (int d = 0; d <= list3.size(); d++) {
						sum += (w1 + 3) * d;
						if (sum > w) {
							sum -= (w1 + 3) * d;
							break;
						}

						long val = 0;
						if (a > 0) val += list0.get(a - 1);
						if (b > 0) val += list1.get(b - 1);
						if (c > 0) val += list2.get(c - 1);
						if (d > 0) val += list3.get(d - 1);
						ans = Math.max(ans, val);

						sum -= (w1 + 3) * d;
					}
					sum -= (w1 + 2) * c;
				}
				sum -= (w1 + 1) * b;
			}
		}
		System.out.println(ans);
	}
}
