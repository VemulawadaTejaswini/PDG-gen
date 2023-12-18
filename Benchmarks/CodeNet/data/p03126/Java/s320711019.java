import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void doIt() {
		sB();
	}
	
	void sB() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt[] = new int[m + 1];
		Arrays.fill(cnt, 0);
		for(int i = 0; i < n; i++) {
			int k = sc.nextInt();
			for(int j = 0; j < k; j++) {
				cnt[sc.nextInt()]++;
			}
		}
		int ans = 0;
		for(int i = 1; i <= m; i++) {
			if(cnt[i] == n) ans++;
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
