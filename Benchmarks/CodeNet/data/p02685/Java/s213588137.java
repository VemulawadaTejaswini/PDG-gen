import java.util.*;
public class Main{ 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int K = sc.nextInt();
		long res = 0;
		int mod = 998244353;
		long[][] arr = new long[K + 1][m + 1];
		Arrays.fill(arr[0], 1);
		for(int i = 2; i <= n; i++) {
			long[][] next = new long[K + 1][m + 1];
			for(int j = 0; j <= K; j++) {
				for(int k = 1; k <= m; k++) {
					for(int l = 1; l <= m; l++) {
						if(k == l) {
							if(j > 0)
								next[j][k] += arr[j - 1][k];
							continue;
						}
						next[j][k] += arr[j][l];
					}
					next[j][k] %= mod;
				}
			}
			arr = next;
		}
		for(int i = 0; i <= K; i++) {
			for(int j = 1; j <= m; j++) {
				res += arr[i][j];
			}
			res %= mod;
		}
		
		System.out.println(res);
    }
}