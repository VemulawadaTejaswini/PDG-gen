import java.util.Scanner;
import java.util.*;
public class Main {
	
	
	
	public static int Frog2(int n,int k, int h[]) {
		int dp[] = new int[n];
		dp[0] = 0;
		dp[1] = Math.abs(h[1]-h[0]);
		
		for(int i=2;i<n;i++) {
			int min = Integer.MAX_VALUE;
			if(i-k>=0) {
				for(int j=i-1;j>=i-k;j--) {
					int minCount = Math.abs(h[i]-h[j])+dp[j];
					if(minCount < min) {
						min = minCount;
					}	
				}
			}else {
				for(int j=i-1;j>=0;j--) {
					int minCount = Math.abs(h[i]-h[j])+dp[j];
					if(minCount < min) {
						min = minCount;
					}	
				}
			}
			
			dp[i] = min;
		}
		
		return dp[n-1];
	}
    
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int h[] = new int[n];
        for(int i=0;i<n;i++) {
        	h[i] = s.nextInt();
        }
        System.out.println(Frog2(n,k,h));
        
    }
}