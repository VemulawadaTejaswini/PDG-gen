import java.util.*;
import java.math.*;

public class Main {
	public static long mod = 1000000007;
	public static int[] a = new int[1000010];
	
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        String s = cin.next();
        for(int i = 1; i <= n; i++){
        	a[i] = Integer.parseInt(String.valueOf(s.charAt(i-1)));;
        }
        int[][] mp = new int[n+1][n+1];
        for(int i = 1; i < n; i++){
        	for(int j = 1; j <= n+1-i; j++){
        		if(i == 1) mp[i][j] = a[j];
        		else{
        			mp[i][j] = Math.abs(mp[i-1][j]-mp[i-1][j+1]);
        		}
        	}
        }
        
        int ans = Math.abs(mp[n-1][1]-mp[n-1][2]);
        System.out.print(ans);
    }
}