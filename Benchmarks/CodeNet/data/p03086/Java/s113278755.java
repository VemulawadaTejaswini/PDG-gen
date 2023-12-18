import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        String S = sc.next();
        int[] l = new int[Q];
        int[] r = new int[Q];
        
        int dp[] = new int[N];
        String[] sp = S.split("");
        
        int count = 0;
        for(int i=1; i<N; i++) {
            if(sp[i-1].equals("A") && sp[i].equals("C")) {
                count++;
            }
            dp[i-1] = count;
        }
        dp[N-1] = count;
        int ans = 0;
        
        for(int i=0; i<Q; i++) {
            l[i] = Integer.parseInt(sc.next())-1;
            r[i] = Integer.parseInt(sc.next())-1;
            if(l[i] == 0) {
                ans = dp[r[i]-1];
            }else {
                ans = dp[r[i]-1] - dp[l[i]-1];
            }
            System.out.println(ans);
        }
    }
}