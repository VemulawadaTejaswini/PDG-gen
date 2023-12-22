import java.util.Scanner;

public class Main{
	static int[] dp=new int[50001];
	static int n, m;
    static int[] c=new int[21];
	static void dp() {
		
    	for(int i=0; i<m; i++) {
    		for(int j=0; j+c[i]<=n; j++) {
    			if(dp[j+c[i]] == 0)  dp[j+c[i]]=dp[j]+1;
                else dp[j+c[i]]=Math.min(dp[j+c[i]], dp[j]+1);
    		}
    	}
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=0; i<m; i++) {
        	c[i]=sc.nextInt();
        }
        dp();
        System.out.println(dp[n]);
        
	}
}
