import java.util.*;

  public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] e = new long[n];
        long[] o = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if(0 < i){
                e[i] = e[i-1]; o[i] = o[i-1];
            }
            if(i % 2 == 0) e[i] += a[i];
            else o[i] += a[i];
        }
        long ans = Long.MIN_VALUE;
        if(n % 2 == 0){
            for (int i = 0; i <= n; i+=2) {
                long t = 0L;
                if(0 < i) t += e[i-2];
                t += o[n-1];
                if(0 < i) t -= o[i-1];
                if(ans < t) ans = t;
            }
        }else{
            long[] s2 = new long[n];
            long max2 = Long.MIN_VALUE;
            for (int i = n-1; i >= 0; i-=2) {
                long t = 0L;
                if(i < n-1) t += e[n-1] - e[i];
                t += o[i];
                if(max2 < t) max2 = t;
                s2[i] = max2;
            }
            for (int i = 0; i < n; i+=2) {
                long t = 0L;
                if(0 < i) t += e[i-2];
                t += s2[i] - o[i];
                if(ans < t) ans = t;
            }

        }
        System.out.println(ans);
        sc.close();

    }

}
