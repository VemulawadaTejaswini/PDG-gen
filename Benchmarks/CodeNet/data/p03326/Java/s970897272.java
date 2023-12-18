import java.util.*;
 
 
public class Main {
 
    private static final long INF = 1_000_000_000_000_000_000L;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] x = new long[N];
        long[] y = new long[N];
        long[] z = new long[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            z[i] = sc.nextLong();
        }
 
        long max = -INF;
        int bit = 1 << 3;
        for (int d = 0; d < bit; d++ ) {
            int a = (d & (1<<2)) != 0 ? 1 : -1;
            int b = (d & (1<<1)) != 0 ? 1 : -1;
            int c = (d & 1) != 0 ? 1 : -1;
            long[] v = new long[N];
            for (int i = 0; i < N; i++) {
                v[i] = a*x[i]+b*y[i]+c*z[i];
            }
            Arrays.sort(v);
            long tmp = 0;
            for (int i = 0; i < M; i++) {
                tmp += v[N-1-i];
            }
            max = Math.max(max, tmp);
        }
 
        System.out.println(max);
    }
}