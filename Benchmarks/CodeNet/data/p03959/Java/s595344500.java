import java.util.*;

public class Main {

    static final long mod = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] max = new int[n];
        Arrays.fill(max, Integer.MAX_VALUE);
        int[] d = new int[n];
        Arrays.fill(d, -1);
        d[0] = max[0] = t[0];
        for (int i = 1; i < n; i++) {
            if(t[i-1] < t[i]) d[i] = max[i] = t[i];
            else max[i] = t[i];
        }
        boolean able = true;
        for (int i = n-1; i >= 0; i--) {
            if(i == n-1 || a[i+1] < a[i]){
                if(d[i] != -1 && d[i] != a[i]){
                    able = false;
                    break;
                }
                d[i] = max[i] = a[i];
            }else{
                if(a[i] < max[i]) max[i] = a[i];
            }
        }
        long ans = 1L;
        if(able){
            for (int i = 0; i < n; i++) {
                if(d[i] < 0){
                    ans = (ans * max[i]) % mod;
                }
            }
        }else ans = 0;
        System.out.println(ans);
        sc.close();

    }

}
