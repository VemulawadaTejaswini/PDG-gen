import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main (String[] args) {
      
        Scanner in = new Scanner(System.in);
        TaskC2 taskC2 = new TaskC2();
         taskC2.solve(0,in);
    
    }
}
 
public class TaskC2 {
    public void solve(int testNumber, Scanner in) {
 
            int n = in.nextInt();
            int[] a = new int[n];
 
            for(int i = 0; i < n; i ++){
                a[i] = in.nextInt();
            }
 
            if(n == 1){
                System.out.println(0);
                return;
            }
            if(n == 2){
                System.out.println(Math.abs(a[1] - a[0]));
                return;
            }
 
            int[] dp = new int[n];
            dp[0] = 0;
            dp[1] = Math.abs(a[1] - a[0]);
 
            for(int i = 2; i < n; i++){
                dp[i] = Math.min(Math.abs(a[i]- a[i-1]) + dp[i-1], Math.abs(a[i]- a[i-2])+dp[i-2]);
            }
 
            System.out.println(dp[n-1]);
    }
 
    
 
}