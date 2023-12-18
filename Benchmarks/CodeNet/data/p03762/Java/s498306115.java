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
        long MOD = (long) (Math.pow(10, 9) + 7);

        a[0] = sc.nextLong();
        for(int i = 1; i < n; i++){
            a[i] = sc.nextLong();
            x[i] = a[i] - a[i-1];
            x[i] %= MOD;
        }

        b[0] = sc.nextLong();
        for(int i = 1; i < m; i++){
            b[i] = sc.nextLong();
            y[i] = b[i] - b[i-1];
            y[i] %= MOD;
        }

        long ans = 0;

/*        long x_sum = 0;

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
        }*/

        long a_sum = 0;
        for(int i = 0; i < n; i++){
            a_sum += ( i * 2 - n + 1 ) * a[i];
            a_sum %= 2;
        }

        long b_sum = 0;
        for(int i = 0; i < m; i++){
            b_sum += ( i * 2 - m + 1 ) * b[i];
            b_sum %= 2;
        }

 //       ans = x_sum * y_sum;
        ans = a_sum * b_sum;
        ans %= MOD;
        System.out.println(ans);
    }
}