import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int MOD = 1000000007;

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		int cnt[] = new int[n+1];
		for(int i=2; i<=n; i++) {
			int d = i;
			for(int j=2; j<=d; j++) {
				if(d%j==0) {
					while(d%j==0) {
						cnt[j]++;
						d/=j;
					}
				}
			}
		}
		long ans = 1;
		for(int i=2; i<=n; i++) {
			ans *= (cnt[i]+1);
			ans %= MOD;

		}
		System.out.println(ans);
		sc.close();
	}


}
