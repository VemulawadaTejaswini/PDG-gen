import java.util.*;
import java.lang.*;
 
 //O(100000000)
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int cnt = 0;
        String str = "";

        long N = Long.parseLong(sc.next());

        long[] dp  = new long[(int)N+1];
        for(int i=0;i<N;i++){
            dp[i] = Long.parseLong(sc.next());
        }
        
        long ans = 0;
        Arrays.sort(dp);
        long a = 0;
        long b = 0;
        
        for(int i = dp.length-1; i  >= 1 ; i-- ){
            
            if(dp[i] == dp[i-1]&&dp[i]>a){
                a = dp[i];
            }
            
            if(dp[i] == dp[i-1]&&a!=0&&a!=dp[i]){
                if(dp[i]>b)b = dp[i];
            }
       
        }
        
        if(b==0)System.out.print(a*a);
        
 
        else System.out.print(a*b);
        System.out.println();
    }

}