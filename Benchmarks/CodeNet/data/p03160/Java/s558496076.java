
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	       int k=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	    }
	    int dp[]=new int[n];
	   
	    dp[0]=0;
	    dp[1]=Math.abs(a[1]-a[0]);
	    for(int i=2;i<n;i++){
	         //dp[i]=Integer.MAX_VALUE;
	         dp[i] = Integer.MAX_VALUE;
	      for(int j=0;j<=k;j++){
	          if(i>=j)
	    dp[i]=Math.min(dp[i-j]+Math.abs(a[i]-a[i-j]),dp[i]);
	      }
	    }
	  System.out.println(dp[n-1]);

	}

}
