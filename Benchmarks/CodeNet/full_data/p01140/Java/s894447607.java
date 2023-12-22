import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        while (sc.hasNext()) {
            solve();
        }
    }
    
    private static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        if (n==0&&m==0) return;
        
        int[] h = new int[n+1];
        int[] w = new int[m+1];
        for (int i = 1;i <= n;i++) {
            h[i] = h[i-1]+sc.nextInt();
        }
        for (int i = 1;i <= m;i++) {
            w[i] = w[i-1]+sc.nextInt();
        }
        
        int[] x = new int[1500000+1];
        int[] y = new int[1500000+1];
        
        for (int i = 0;i <= n;i++) {
            for (int j = i+1;j <= n;j++) {
                x[h[j]-h[i]]++;
            }
        }
        for (int i = 0;i <= m;i++) {
            for (int j = i+1;j <= m;j++) {
                y[w[j]-w[i]]++;
            }
        }
        
        long ret = 0;
        for (int i = 1;i <= 1500000;i++) {
            ret += x[i]*y[i];
        }
        
        System.out.println(ret);
    }
}