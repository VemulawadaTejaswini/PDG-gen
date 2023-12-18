import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static int[] ans;
//	 static int mod = 998244353;
   public static void main(String[] args) {
	          
	   Scanner sc = new Scanner(System.in);
	   int  N = sc.nextInt();
	   int  P = sc.nextInt();
	   String S=sc.next();
	   int[][] dp = new int[N+5][P];
	   char[] c = S.toCharArray();
	   long ans=0;
	   int mod=1;
	   for(int i=1;i<=c.length;i++) {
		   int tmp=c.length-i;
		   dp[i-1][0]++;
		   int t=Character.getNumericValue(c[tmp])%P;	   
		   for(int j=0;j<P;j++) {
			   dp[i][(j+mod*t)%P]=dp[i][(j+mod*t)%P]+dp[i-1][j];
		   }
		   
		   ans=ans+dp[i][0];
		   mod=(mod*10)%P;
	   }
	   
       System.out.println(ans); 
       return;
   }

}
