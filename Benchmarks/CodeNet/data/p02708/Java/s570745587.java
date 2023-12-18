import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int K = sc.nextInt();
        long ans = 0;
        long[] sum = new long[N + 1];
        sum[0] = 0;

        for(int i=1; i<=N; i++){
            sum[i] = sum[i - 1] + i;
        }

        for(int i=K; i<=N; i++){
            long min = sum[i - 1];
            long max = sum[N] - sum[N - i];
            ans += max - min + 1;
            ans = ans % 1000000007;
        }
        System.out.println(ans + 1);
    }
}