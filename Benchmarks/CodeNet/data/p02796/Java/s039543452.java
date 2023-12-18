import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		List<int[]> num = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int o = sc.nextInt();
			int r = sc.nextInt();
			int[] node = { o - r, o + r };
			num.add(node);
		}
		Collections.sort(num, new NumComp());

		int tmp = num.get(0)[1];
		int cnt = 1;
		for (int i = 1; i < n; i++) {
			if (tmp <= num.get(i)[0]) {
				tmp = num.get(i)[1];
				cnt++;
			}
		}
		System.out.println(cnt);

	}

	static class NumComp implements Comparator<int[]> {
		@Override
		public int compare(int[] a, int[] b) {
			return a[1] > b[1] ? 1 : -1;
		}
	}
}