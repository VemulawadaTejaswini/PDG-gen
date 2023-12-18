import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
        }
        int[] fac = new int[n];
        fac[0] = 1;
        for (int i = 1; i < n; i++) {
            fac[i] = fac[i - 1] * i;
        }
        long res = Math.abs(per(p, n, fac) - per(q, n, fac));
        System.out.println(res);
    }

    private static long per(int[] p, int n, int[] fac) {
        long res = 0;
        for(int i=0;i<n;++i)
        {
            int k=0;
            for(int j=i+1; j<n; ++j)
                if(p[j] < p[i])
                {
                    k++;
                }
            res += fac[n-i-1]*k;
        }
        return res;
    }
}