import java.util.Scanner;
import java.util.*;
public class Main {
	
	
	
	public static int Frog1(int n, int h[]) {
		int dp[] = new int[n];
		dp[0] = 0;
		dp[1] = Math.abs(h[1]-h[0]);
		
		for(int i=2;i<n;i++) {
			int op1 = Math.abs(h[i] - h[i-1]) + dp[i-1];
			int op2 = Math.abs(h[i] - h[i-2]) + dp[i-2];
			dp[i] = Math.min(op1, op2);
		}
		
		return dp[n-1];
	}
    
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int h[] = new int[n];
        for(int i=0;i<n;i++) {
        	h[i] = s.nextInt();
        }
        System.out.println(Frog1(n,h));
    }
}