import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long C = sc.nextLong();
        long[] x = new long[N+1];
        long[] u =new long[N+1];
        for(int i=1;i<=N;i++){
            x[i] = sc.nextLong();
            u[i] = sc.nextLong();
        }
        long[] sum = new long[N+1];
        for(int i=1;i<=N;i++){
            sum[i]=sum[i-1]+u[i];
        }
        long[] clock1 = new long[N+2];
        long[] clock2 = new long[N+2];
        for(int i=1;i<=N;i++){
            clock1[i]=Math.max(clock1[i-1],sum[i]-x[i]);
            clock2[i]=Math.max(clock2[i-1],sum[i]-2*x[i]);
        }
        long[] anti1 = new long[N+2];
        long[] anti2 = new long[N+2];
        for(int i=N;i>=1;i--){
            anti1[i] = Math.max(anti1[i+1],sum[N]-sum[i-1]-(C-x[i]));
            anti2[i] = Math.max(anti2[i+1],sum[N]-sum[i-1]-2*(C-x[i]));
        }
        long ansClock = clock1[N];
        long ansAnti = anti1[1];
        long ansClockFirst = 0;
        for(int i=1;i<=N-1;i++){
            ansClockFirst = Math.max(ansClockFirst,clock2[i]+anti1[i+1]);
        }
        long ansAntiFirst = 0;
        for(int i=N;i>=2;i--){
            ansAntiFirst = Math.max(ansAntiFirst,anti2[i]+clock1[i-1]);
        }
        long ans = Math.max(Math.max(ansClock,ansAnti),Math.max(ansClockFirst,ansAntiFirst));

        System.out.print(ans);
    }
}