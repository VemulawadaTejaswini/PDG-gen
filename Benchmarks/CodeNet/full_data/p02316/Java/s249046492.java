import java.math.*;
import java.util.*;
  


public class Main {
	
	
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt(),W=scan.nextInt();
        int dp[]=new int[W+1],v[]=new int[N],w[]=new int[N];
        for(int i=0;i<N;i++) {
        	v[i]=scan.nextInt();
        	w[i]=scan.nextInt();
        }
        for(int i=0;i<N;i++) {
        	for(int j=w[i];j<=W;j++) {
        		dp[j]=Math.max(dp[j], dp[j-w[i]]+v[i]);
        	}
        }
        System.out.println(dp[W]);
        
	}
	
	
	
}
