import java.util.*;
import java.lang.*;

//O(100000000)
public class Main {
  public static void main(String[] args) {

    Scanner sc  = new Scanner(System.in);

    int ans = 1;
    long N = Long.parseLong(sc.next());
    long[] dp  = new long[(int)N];
    
    for (int i=0; i<N; i++) dp[i] = Long.parseLong(sc.next());
    Arrays.sort(dp);
     for (int i=0; i<N-1; i++){
       // System.out.println(dp[i]);
         if(dp[i]==dp[i+1]) ans--;
         else ans++;
     } 
      
      
    System.out.print(ans);
    System.out.println();
  }

}
