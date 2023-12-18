import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long c = in.nextLong();
        long[] x = new long[n+1], v = new long[n+1];
        for(int i = 1; i <= n; i++) {
            x[i] = in.nextLong();
            v[i] = in.nextLong();
        }
        long[] sum = new long[n+1], max = new long[n+1], maxx = new long[n+1];
        sum[0] = max[0] = 0;
        for(int i = 1; i <= n; i++) {
            sum[i] = sum[i-1] + v[i];
            if(max[i - 1] > sum[i] - x[i]) {
                max[i] = max[i-1];
                maxx[i] = maxx[i-1];
            }else {
                max[i] = sum[i] - x[i];
                maxx[i] = x[i];
            }
        }
        long[] sumb = new long[n+1];
        sumb[n] = v[n];
        for(int i = n-1; i > 0; i--) {
            sumb[i] = sumb[i+1] + v[i];
        }
        // System.out.println("sumb:" + Arrays.toString(sumb));
        long ans = max[n];
        for(int i = n; i > 0; i--) {
            long t1 = sumb[i] - (c-x[i])*2 + max[i-1];
            long t2 = max[i-1] - maxx[i-1] + sumb[i] - (c - x[i]);
        
            ans = Math.max(ans, Math.max(t1, t2));
        }
        
        System.out.println(ans);
    }
}