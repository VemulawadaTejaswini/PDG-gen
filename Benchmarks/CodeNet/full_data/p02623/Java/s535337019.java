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
        
        int max = 0;
        for (int i = tmpi; i >= 0; i--) {
            long remain = k - tmpl;
            int j = upperBound(sumr, remain);
            j-=2;
            // System.out.println(remain + " " +i +  " "+ j);
            
            max = Math.max(max, i + 1 + j + 1);
            // System.out.println(max);
            
            tmpl -= left[i];
        }
        System.out.println(max);
    }
    
    public static int upperBound(long[] array, long target) {
        // 初めてのtarget超過のindexを返す
        // {1, 3, 3, 7} target: 3 -> 3
        
        int left = 0;
        int right = array.length;
        
        while (left < right) {
            int center = (left + right) / 2;
            if (array[center] <= target) {
                left = center + 1;
            } else {
                right = center;
            }
        }
        
        return left;
    }
}
