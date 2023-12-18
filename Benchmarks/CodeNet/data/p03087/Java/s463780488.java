import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        int[] l = new int[Q];
        int[] r = new int[Q];
        for(int i = 0; i < Q; i++){
            l[i] = sc.nextInt()-1;
            r[i] = sc.nextInt()-1;
        }
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            if(S.charAt(i) == 'A')
                a[i] = 1;
            if(S.charAt(i) == 'C')
                a[i] = -1;
        }
        int[] dp = new int[N];
        dp[0] = 0;
        for(int i = 0; i < N-1; i++){
            if(a[i] == 1 && a[i+1] == -1)
                dp[i+1] = dp[i] + 1;
            else
                dp[i+1] = dp[i];
        }
        for(int i = 0; i < Q; i++){
            System.out.println(dp[r[i]] - dp[l[i]]);
        }
    }
}
