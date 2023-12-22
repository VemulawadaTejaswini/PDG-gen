import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[] a = new int[n];
			int[] b = new int[n];
			int suma = 0;
			int sumb = 0;
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
				suma += a[i];
				sumb += b[i];
			}
			Arrays.sort(a);
			Arrays.sort(b);
			
			int W = 0;
			if(suma-a[n-1]<a[n-1]) W = a[n-1] - (suma-a[n-1]);
			
			if(W==0){
				System.out.println(suma+sumb);
			}else{			
				int[][] dp = new int[n][W+1];
				
				for(int i=0;i<n-1;i++){
					for(int j=0;j<=W;j++){
						if(j<b[i]) dp[i+1][j] = dp[i][j];
						else dp[i+1][j] = Math.max(dp[i][j], dp[i][j-b[i]]+b[i]);
					}
				}
				System.out.println(2*a[n-1] + (sumb-dp[n-1][W]));
			}
		}
	}
}