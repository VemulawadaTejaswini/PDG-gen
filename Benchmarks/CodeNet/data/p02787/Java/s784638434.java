import java.util.*;

public class Main {
    static int[] damages;
    static int[] powers;
    static int[] dp;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
		damages = new int[n];
		powers = new int[n];
		for (int i = 0; i < n; i++) {
		    damages[i] = sc.nextInt();
		    powers[i] = sc.nextInt();
		}
		dp = new int[h + 1];
		System.out.println(dfw(h));
   }
   
   static int dfw(int helth) {
       if (helth <= 0) {
           return 0;
       }
       if (dp[helth] == 0) {
           dp[helth] = Integer.MAX_VALUE;
           for (int i = 0; i < damages.length; i++) {
               dp[helth] = Math.min(dp[helth], dfw(helth - damages[i]) + powers[i]);
           }
       }
       return dp[helth];
   }

}
