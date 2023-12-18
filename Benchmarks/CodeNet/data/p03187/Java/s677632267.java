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
		
		int ans = 0;
		int now = 0;
		int cnt = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		while(cnt < N) {
			if(X[cnt1] < now) {
				if(X[cnt1] + now >= X[N - cnt2 - 1] - now) {
					ans += X[cnt1] + now;
					now = X[cnt1];
					cnt1++;
					cnt++;
					//System.out.print("1:");
				} else {
					ans += L - X[N - cnt2 - 1] - now;
					now = X[cnt2];
					cnt2++;
					cnt++;
					//System.out.print("2:");
				}
			} else {
			if(X[cnt1] - now >= L - X[N - cnt2 - 1] + now) {
				ans += X[cnt1] - now;
				now = X[cnt1];
				cnt1++;
				cnt++;
				//System.out.print("1:");
			} else {
				ans += L - X[N - cnt2 - 1] + now;
				now = X[cnt2];
				cnt2++;
				cnt++;
				//System.out.print("2:");
			}
			}
			//System.out.println(ans);
		}
		System.out.println(ans);
	}
}
