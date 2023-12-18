import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int cnt = 0;

        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        int[] dp  = new int[N];
        for(int i=0;i<N;i++){
            dp[i] = Integer.parseInt(sc.next());
        }
        for (int i=0;i<N-1;i++){
     //        System.out.println(cnt);
            if( (dp[i+1]-dp[i]) * A < B ) cnt += (dp[i+1]-dp[i]) * A ; 
            else cnt += B;
          //  System.out.println(i);
        } 



        System.out.print(cnt);
        System.out.println();
    }

}