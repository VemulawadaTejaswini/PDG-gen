import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Pair> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new Pair(sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(list, new ComparatorByKey());
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		int[] dp = new int[m + 1];
		dp[0] = 0;
		int j = 0;
		for (int i = 1; i <= m; i++) {
			while (j < list.size() && list.get(j).key <= i) {
				queue.add(list.get(j).value);
				j++;
			}
			if (queue.isEmpty()) {
				dp[i] = dp[i - 1];
			} else {
				dp[i] = dp[i - 1] + queue.poll();
			}
		}
		System.out.println(dp[m]);
	}
}
class Pair {
	public int key;
	public int value;
	public Pair(int key, int value) {
		this.key = key;
		this.value = value;
	}
}

class ComparatorByValue implements Comparator<Pair> {
	@Override
	public int compare(Pair sort1, Pair sort2) {
		if (sort1.value == sort2.value) {
			return 0;
		} else if (sort1.value > sort2.value) {
			return 1;
		} else {
			return -1;
		}
	}
}

class ComparatorByKey implements Comparator<Pair> {
	@Override
	public int compare(Pair sort1, Pair sort2) {
		if (sort1.key == sort2.key) {
			return 0;
		} else if (sort1.key > sort2.key) {
			return 1;
		} else {
			return -1;
		}
	}
}