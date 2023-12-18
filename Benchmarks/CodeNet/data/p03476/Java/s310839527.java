import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		int[] l = new int[Q];
		int[] r = new int[Q];
		for(int i = 0; i < Q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		boolean[] dp = new boolean[100000];
		dp[0] = dp[1] = true;
		int[] likeNo = new int[100000];
		List<Integer> prime = new LinkedList<Integer>();
		for(int i = 2; i < 100000; i++) {
			if(dp[i]) {
				likeNo[i] = likeNo[i - 1];
				continue;
			}
			prime.add(i);
			if(dp[(i + 1) / 2]) {
				likeNo[i] = likeNo[i - 1];
			} else {
				likeNo[i] = likeNo[i - 1] + 1;
			}
			for(int j = i * 2; j < 100000; j += i) {
				dp[j] = true;
			}
		}
		for(int i = 0; i < Q; i++) {
			System.out.println(likeNo[r[i]] - likeNo[l[i] - 1]);
		}
	}
}