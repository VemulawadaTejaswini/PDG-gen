
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
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		dp[0]=0;
		for(int i=1; i<=n; i++) {
			for(int j=0; j<m; j++) {
				if(i-f[a[j]]>=0 && dp[i-f[a[j]]]>=0) {
					dp[i] = Math.max(dp[i], dp[i-f[a[j]]]+1) ;
				}
			}
		}
		int keta = dp[n];
		int rem = n;
		StringBuilder sb = new StringBuilder();
		while(rem>0) {
			for(int i=m-1; i>=0; i--) {
				if(rem-f[a[i]]>=0 && keta == dp[rem-f[a[i]]]+1) {
					sb.append(a[i]);
					keta--;
					rem -= f[a[i]];
					break;
				}
			}
		}
		System.out.println(sb);
		sc.close();
	}



}
