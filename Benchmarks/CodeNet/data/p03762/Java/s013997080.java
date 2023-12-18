import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[n];
        long[] x = new long[n];
        long[] b = new long[m];
        long[] y = new long[m];

        a[0] = sc.nextLong();
        for(int i = 1; i < n; i++){
            a[i] = sc.nextLong();
            x[i] = a[i] - a[i-1]; 
        }

        b[0] = sc.nextLong();
        for(int i = 1; i < m; i++){
            b[i] = sc.nextLong();
            y[i] = b[i] - b[i-1];
        }

        long MOD = (long) Math.pow(10, 9) + 7;

        long ans = 0;

        long x_sum = 0;

        for(int i = 1; i < n; i++){
            long xx = (n - i) * ( i );    
            xx %= MOD;
            x[i] *= xx;
            x[i] %= MOD;
            x_sum += x[i];
            x_sum %= MOD;
        }
        long y_sum = 0;

        for(int i = 1; i < m; i++){
            long yy = (m - i) * ( i );    
            yy %= MOD;
            y[i] *= yy;
            y[i] %= MOD;
            y_sum += y[i];
            y_sum %= MOD;
        }
        ans = x_sum * y_sum;
        ans %= MOD;
        System.out.println(ans);
    }
}