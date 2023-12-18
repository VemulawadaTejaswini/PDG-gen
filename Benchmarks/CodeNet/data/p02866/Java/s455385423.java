import java.util.Scanner;

public class Main {

	private final static long MOD = 998244353;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] D = new int[N];
		int[] cnt = new int[N];
		for(int i = 0;i < N;i++) {
			D[i] = sc.nextInt();
			cnt[D[i]]++;
		}
		sc.close();
		long ans = 1;
		if(D[0] == 0) {
			for(int i = 1;i < N;i++) {
				for(int j = 0;j < cnt[i];j++) {
					ans *= cnt[i-1];
					ans %= MOD;
				}
			}
		}else {
			ans = 0;
		}
		System.out.println(ans);
	}
}