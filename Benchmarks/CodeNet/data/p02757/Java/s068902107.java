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
	   long[] dp = new long[P];
	   long[] dpP = new long[P];
	   char[] c = S.toCharArray();
	   long ans=0;
	   int mod=1;
	   for(int i=1;i<=c.length;i++) {
		   int tmp=c.length-i;
		   dpP[0]++;
		   int t=Character.getNumericValue(c[tmp])%P;	   
		   for(int j=0;j<P;j++) {
			   dp[(j+mod*t)%P]=dp[(j+mod*t)%P]+dpP[j];
		   }
		   
		   ans=ans+dp[0];
		   System.arraycopy(dp,0,dpP,0,dp.length);
		   dp=new long[P];
		   mod=(mod*10)%P;
	   }
	   
       System.out.println(ans); 
       return;
   }

}

