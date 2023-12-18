
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int f[] = {-1, 2, 5, 5, 4, 5, 6, 3, 7, 6};

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[] = new int[m];
		for(int i=0; i<m; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int dp[] = new int[n+1];
		dp[0] = 0;
		for(int i=0; i<=n; i++) {
			int max = 0;
			for(int j=0; j<m; j++) {
				if(i-f[a[j]]>=0) {
					max = Math.max(max, dp[i-f[a[j]]]+1);
				}
			}
			dp[i] = max;
		}

		int rem = n;
		int keta = dp[n];
		StringBuilder ans = new StringBuilder();
		while(rem>0) {
			for(int i=m-1; i>=0; i--) {
				if(rem-f[a[i]]<0) continue;
				if(keta==1) {
					if(rem-f[a[i]]==0) {
						keta--;
						rem -= f[a[i]];
						ans.append(a[i]);
						break;
					}
				}else if(dp[rem-f[a[i]]] == keta-1) {
					keta--;
					rem -= f[a[i]];
					ans.append(a[i]);
					break;
				}
			}
		}

		System.out.println(ans.toString());

		sc.close();
	}



}
