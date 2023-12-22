import java.util.*;

public class Main {

    static long pow(long a,int n) {
        long res=1;
        while (n>0) {
            if ((n-n/2*2)==1) {
                res=res*a;
            }
            a=a*a;
            n>>=1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        long ttt = 0L;
        for (int i=0;i<N+1;i++) {
            A[i] = sc.nextInt();
        }

        if (N < 40) {
            long[] max = new long[N+1];
            for (int i=0;i<N+1;i++) {
                if (i == 0) max[i] = (long)A[i]*pow(2, N-i);
                // else max[i] = Math.max(max[i-1], (long)A[i]*pow(2, N-i));
                else max[i] = max[i-1] + (long)A[i]*pow(2, N-i);
            }
            if (max[N] > pow(2, N)) {
                System.out.println(-1);
                return;
            }

            long ans = 0L;
            long tmp = 0L;
            for (int i=N;i>=0;i--) {
                tmp += A[i];
                if (i == 0) {
                    ans += Math.min(tmp, pow(2, N)/pow(2, N-i));
                    tmp = Math.min(tmp, pow(2, N)/pow(2, N-i));
                } else { // i != 0
                    ans += Math.min(tmp, (pow(2, N)-max[i-1])/pow(2, N-i));
                    tmp = Math.min(tmp, (pow(2, N)-max[i-1])/pow(2, N-i));
                }
                // System.out.println("Math.min(tmp, (pow(2, N)-max[i-1])/pow(2, N-i)): "+(Math.min(tmp, (pow(2, N)-max[i-1])/pow(2, N-i))));
                // System.out.println("i: "+(i));
            }
            System.out.println(ans);
            // System.out.println(Arrays.toString(max));
        } else { // N >= 40
            long[] max = new long[40];
            for (int i=0;i<40;i++) {
                if (i == 0) max[i] = (long)A[i]*pow(2, 39-i);
                else max[i] = max[i-1] + (long)A[i]*pow(2, 39-i);
            }
            if (max[39] > pow(2, 39)) {
                System.out.println(-1);
                return;
            }
            long ans = 0L;
            long tmp = 0L;
            for (int i=N;i>=40;i--) {
                ans += A[i];
                tmp += A[i];
            }
            for (int i=39;i>=0;i--) {
                tmp += A[i];
                if (i == 0) {
                    ans += Math.min(tmp, pow(2, 39)/pow(2, 39-i));
                    tmp = Math.min(tmp, pow(2, 39)/pow(2, 39-i));
                } else { // i != 0
                    ans += Math.min(tmp, (pow(2, 39)-max[i-1])/pow(2, 39-i));
                    tmp = Math.min(tmp, (pow(2, 39)-max[i-1])/pow(2, 39-i));
                }
                // System.out.println("Math.min(tmp, (pow(2, N)-max[i-1])/pow(2, N-i)): "+(Math.min(tmp, (pow(2, N)-max[i-1])/pow(2, N-i))));
                // System.out.println("i: "+(i));
            }
            System.out.println(ans);
            // System.out.println(Arrays.toString(max));

        }
    }
}