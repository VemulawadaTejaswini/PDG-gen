import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Obj> list = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			list.add(new Obj(sc.nextInt(), sc.nextInt()));
		}

		int max = (int) Math.pow(10, n) - 1;
		for (int i = 0; i <= max; i++) {
			int num = i;

			if (Integer.toString(i).length() != n) {
				continue;
			}

			int[] nums = new int[n];
			for (int j = 0; j < n; j++) {
				nums[n - j - 1] = num % 10;
				num = num / 10;
			}

			boolean temp = true;
			for (Obj o : list) {
				temp = temp && nums[o.k - 1] == o.v;
			}
			if (temp) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}

	private static class Obj {
		public Integer k;
		public Integer v;

		public Obj(Integer k, Integer v) {
			this.k = k;
			this.v = v;
		}
	}
}
