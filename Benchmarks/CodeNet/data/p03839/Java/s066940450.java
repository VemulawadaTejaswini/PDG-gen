import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[100010];
        long[] b = new long[100010];
        long[] c = new long[100010];
        for (int i = 1;i <= n;i++) {
            a[i] = sc.nextLong();
            b[i] = b[i-1] + a[i];
        }
        
        long sum = 0;
        for (int i = 1;i <= n;i++) {
            sum += a[i]>0?a[i]:0;
            c[i] = sum;
        }
        
        long ret = 0;
        long t, u;
        for (int i = 1;i <= n-k+1;i++) {
            u = Math.max(b[i+k-1]-b[i-1],0);
            t = c[i-1]+u+c[n]-c[i+k-1];
            ret = Math.max(ret,t);
        }
        
        System.out.println(ret);
    }
}
