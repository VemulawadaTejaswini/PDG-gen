import java.util.*;
public class Main{
    
    static final int MAX = (int)1e9 + 7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
        }
        
        int[] dp = new int[h+1];
        Arrays.fill(dp, MAX);
        dp[0] = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<h; j++){
                int idx = Math.min(h, j+a[i]);
                dp[idx] = Math.min(dp[idx], dp[j]+b[i]);
            }
        }
        
        System.out.println(dp[h]);
    }
}