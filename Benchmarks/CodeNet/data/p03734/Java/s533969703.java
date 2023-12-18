import java.util.*;

public class Main {
	static class pair implements Comparable<pair> {
		public final long left;
		public final long right;

		public pair(long left, long right) {
			this.left = left;
			this.right = right;
		}

		public int compareTo(pair p) {
			if (right < p.right)
				return 1;
			else if (right > p.right)
				return -1;
			else
				return 0;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), w = sc.nextInt();
		pair goods[] = new pair[n];
		for (int i = 0; i < n; ++i) {
			goods[i] = new pair(sc.nextLong(), sc.nextLong());
		}
		Arrays.sort(goods);
		int ans = 0, weight = 0, tmp = 0;
		for (int i = 0; i < n; ++i) {
			tmp = 0;
			weight = 0;
			for (int j = i; j < n; ++j) {
				if (weight + goods[j].left > w)
					continue;
				tmp += goods[j].right;
				weight += goods[j].left;
			}
			ans = Math.max(ans, tmp);
		}
		System.out.println(ans);
		sc.close();

	}

}
