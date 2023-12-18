import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		LinkedList<Integer> list = new LinkedList<Integer>();
		String[] sa = br.readLine().split(" ");
		int a0 = Integer.parseInt(sa[1]);
		int b0 = Integer.parseInt(sa[2]);
		list.add(a0);
		int idx = 0;
		int x = a0;
		long v = b0;
		int cnt = 1;

		for (int i = 1; i < q; i++) {
			sa = br.readLine().split(" ");
			int y = Integer.parseInt(sa[0]);
			if (y == 1) {
				int a = Integer.parseInt(sa[1]);
				int b = Integer.parseInt(sa[2]);
				if (cnt % 2 == 0) {
					idx++;
				}
				int j = binarySearch(list, a);
				list.add(j, a);
				v += Math.abs(x - a) + b;
				x = list.get(idx);
				cnt++;
			} else {
				System.out.println(x + " " + v);
			}
		}
	}

	static int binarySearch(List<Integer> list, long val) {
		int start = -1;
		int end = list.size();

		while (Math.abs(end - start) > 1) {
			int mid = (end + start) / 2;
			if (list.get(mid) >= val) {
				end = mid;
			} else {
				start = mid;
			}
		}
		return end;
	}
}
