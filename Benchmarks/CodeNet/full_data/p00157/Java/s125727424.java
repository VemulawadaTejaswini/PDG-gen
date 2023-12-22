import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int N = sc.nextInt();
			if(N == 0) break;
			ArrayList<Integer> H = new ArrayList<>();
			ArrayList<Integer> R = new ArrayList<>();
			H.add(0);
			R.add(0);
			for(int i = 0; i < N; i++) {
				int h = sc.nextInt();
				int r = sc.nextInt();
				H.add(h);
				R.add(r);
			}
			int M = sc.nextInt();
			for(int i = 0; i < M; i++) {
				int h = sc.nextInt();
				int r = sc.nextInt();
				H.add(h);
				R.add(r);
			}
			for(int i = 0; i < N; i++) {
				H.add(H.get(i));
				H.add(H.get(i+1));
			}
			int[] dp = new int[H.size()];
			dp[0] = 0;
			for(int i = 1; i < H.size(); i++) {
				dp[i] = 0;
				for(int j = 0; j < i; j++) {
					if(H.get(j) < H.get(i) && R.get(j) < R.get(i) && dp[j] + 1 > dp[i]) dp[i] = dp[j] + 1;
				}
			}
			int max = 0;
			for(int i = 0; i < dp.length; i++) {
				max = Math.max(max, dp[i]);
			}
			System.out.println(max);
		}
	}
}