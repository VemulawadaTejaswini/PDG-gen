import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            array[i] = sc.nextInt();
        }
        
        if (array[0] != 0) {
            System.out.println(-1);
            return;
        }
        
        int ni = 1;
        for (int i = 1; i <= 27; i++) {
            if (i == n) break;
            ni *= 2;
            if (array[i] >= ni) {
                System.out.println(-1);
                return;
            }
        }
        
        // 二分木の頂点数を最大化したい
        // 本当は二倍にしたい
        // でも2倍にするとa[n]がおかしくなる
        
        int[] actually = new int[n+1];
        int tmp = 1;
        actually[0] = 1;
        for (int i = 1; i < n+1; i++) {
            actually[i] = tmp * 2;
            
            tmp = actually[i] - array[i];
        }
        // System.out.println(Arrays.toString(actually));
        
        int[] sum = new int[n+1];
        sum[n] = array[n];
        for (int i = n-1; i >= 0; i--) {
            sum[i] = sum[i+1] + array[i];
            
        }
        // System.out.println(Arrays.toString(sum));
        
        long ans = 0;
        for (int i = 0; i < n+1; i++) {
            ans = ans + Math.min(actually[i], sum[i]);
        }
        System.out.println(ans);
        
    }
}
