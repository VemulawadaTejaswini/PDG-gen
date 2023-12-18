import java.util.*;

// ABC 50-C
// http://abc050.contest.atcoder.jp/tasks/arc066_a

public class Main {
	
	static int n;
	static int max;
	static int answer = 0;
	static int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		int[] diff = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			diff[i] = in.nextInt();
		}
		
		int[] used = new int[n + 1];
		int[] order = new int[n];
		
		solve(0, diff, used, order);
		System.out.println(answer);
	}
	
	public static void solve(int index, int[] diff, int[] used, int[] order) {
		if (index == n) {
			answer++;
			if (answer == MOD) {
				answer = 0;
			}
//			System.out.printf("order: ");
//			for (int i = 0; i < n; i++) {
//				System.out.printf("%d ", order[i]);
//			}
//			System.out.println();
			return;
		}
		int left = index;
		int right = n - index - 1;
		int d = Math.abs(left - right);
		
		for (int i = 1; i <= n; i++) {
			if (diff[i] == d && used[i] == 0) {
				order[index] = i;
				used[i] = 1;
				solve(index + 1, diff, used, order);
				used[i] = 0;
			}
		}
	}
}