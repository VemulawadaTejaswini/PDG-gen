import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            left[i] = sc.nextInt();
        }
        int[] right = new int[m];
        for (int i = 0; i < m; i++) {
            right[i] = sc.nextInt();
        }
        
        long[] suml = new long[n+1];
        for (int i = 1; i <= n; i++) {
            suml[i] = suml[i-1] + left[i-1];
        }
        long[] sumr = new long[m+1];
        for (int i = 1; i <= m; i++) {
            sumr[i] = sumr[i-1] + right[i-1];
        }
        
        long tmpl = 0;
        int tmpi = -1;
        for (int i = 0; i < n; i++) {
            if (tmpl + left[i] <= k) {
                tmpl += left[i];
            } else {
                break;
            }
            tmpi = i;
        }
        
        long tmpr = 0;
        int tmpj = -1;
        for (int j = 0; j < m; j++) {
            if (tmpl + tmpr + right[j] <= k) {
                tmpr += right[j];
            } else {
                break;
            }
            tmpj = j;
        }
        
        
        int max = tmpi + 1 + tmpj + 1;
        for (int i = tmpi; i >= 0; i--) {
            for (int j = tmpj+1; j < m; j++) {
                if (tmpl + tmpr + right[j] <= k) {
                    tmpr += right[j];
                } else {
                    break;
                }
                tmpj = j;
                max = Math.max(max, i + 1 + j + 1);
            }
        }
        
        System.out.println(max);
    }
}
