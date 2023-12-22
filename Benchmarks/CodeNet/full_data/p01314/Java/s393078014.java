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
        if (n == 0) return;
        int[] ary = new int[n+1];
        int sum = 0;
        for (int i = 1;i <= n;i++) {
            sum += i;
            ary[i] = sum;
        }
        
        int ret = 0;
        
        for (int i = 1;i <= n;i++) {
            for (int j = i+2;j <= n;j++) {
                if (ary[j]-ary[i]==n) ret++;
            }
        }
        
        System.out.println(ret);
    }
}