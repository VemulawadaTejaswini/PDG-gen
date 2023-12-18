import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int N = sc.nextInt();
		if(N > 2000) return;
		int X[] = new int[N];
		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}
		Arrays.sort(X);
		
		long ans = 0;
		long now = 0;
		/*int cnt = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		*/
		
		long dp[][] = new long[N][L];
		int cnt = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 0);
		for(int i = 1; i < L; i++) {
			for(int j : map.keySet()) {
				if(j > X[cnt - map.get(j)]) {
					dp[cnt][X[cnt - map.get(j)]] = dp[cnt - 1][j] + (L - j) + X[cnt - map.get(j)];
					map.put(X[cnt - map.get(j)], map.get(j));
					dp[cnt][X[map.get(j)]] = dp[cnt - 1][j] + X[map.get(j)] - j;
					map.put(X[map.get(j) + 1], map.get(j) + 1);
				} else {
					dp[cnt][X[cnt - map.get(j)]] = dp[cnt - 1][j] + X[cnt - map.get(j)] - j;
					map.put(X[cnt - map.get(j)], map.get(j));
					dp[cnt][X[map.get(j)]] = dp[cnt - 1][j] + j + X[map.get(j)];
					map.put(X[map.get(j) + 1], map.get(j) + 1);
				}
				cnt++;
				map.remove(j);
			}
		}
		//int ans = 0;
		for(int i = 0; i < L; i++) {
			ans = Math.max(ans, dp[N][i]);
		}
		System.out.println(ans);
		
		/*while(cnt < N) {
			//System.out.print("now:" + now);
			//System.out.print("X:" + X[cnt1] + ",");
			if(X[cnt1] < now) {
				if(X[cnt1] + L - now >= X[N - cnt2 - 1] - now) {
					ans += X[cnt1] + L - now;
					now = X[cnt1];
					cnt1++;
					cnt++;
					System.out.print("1:");
				} else {
					ans += X[N - cnt2 - 1] - now;
					now = X[N - cnt2 - 1];
					cnt2++;
					cnt++;
					System.out.print("2:");
				}
			} else {
				if(X[cnt1] - now > L - X[N - cnt2 - 1] + now) {
					ans += X[cnt1] - now;
					now = X[cnt1];
					cnt1++;
					cnt++;
					System.out.print("3:");
				} else {
					System.out.print(L - X[N - cnt2 - 1] + now + ":");
					ans += L - X[N - cnt2 - 1] + now;
					now = X[N - cnt2 - 1];
					cnt2++;
					cnt++;
				System.out.print("4:");
				}
			}
			System.out.println(ans);
		}*/
		System.out.println(ans);
	}
}
