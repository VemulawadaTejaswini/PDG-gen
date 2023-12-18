import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] al = new int[N+1];
        int[] bl = new int[N+1];
        int[] cl = new int[N+1];

        for (int i = 1; i <= N; i++) {
            al[i] = sc.nextInt();
            bl[i] = sc.nextInt();
            cl[i] = sc.nextInt();
        }

        int[] dp = new int[N+1];
        Arrays.fill(dp, 0);
        dp[0] = 0;
        for (int i = 1; i <= N; i++) {
            int max = Math.max(Math.max(al[i], bl[i]), cl[i]);
            dp[i] =  max + dp[i - 1];
            if(i == N)  break;
            if(max == al[i]) {
                al[i+1] = 0;
            }else if(max== bl[i]) {
                bl[i+1] = 0;
            }else if(max == cl[i]) {
                cl[i+1] = 0;
            }
            
        }
        System.out.println(dp[N]);

    }
}
