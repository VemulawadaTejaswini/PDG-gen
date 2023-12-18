import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        long[][] array = new long[n][3];
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextLong();
            array[i][1] = sc.nextLong();
            array[i][2] = sc.nextLong();
        }
        
        long best = 0;
        long tmp0 = 0;
        long tmp1 = 0;
        long tmp2 = 0;
        
        Arrays.sort(array, (a, b) -> Long.compare(a[0], b[0]));
        for (int i = 0; i < k; i++) {
            tmp0 += array[i][0];
            tmp1 += array[i][1];
            tmp2 += array[i][2];
        }
        best = Math.max(best, Math.abs(tmp0) + Math.abs(tmp1) + Math.abs(tmp2));
        tmp0 = tmp1 = tmp2 = 0;
        for (int i = n - 1; i > n - 1 - k; i--) {
            tmp0 += array[i][0];
            tmp1 += array[i][1];
            tmp2 += array[i][2];
        }
        best = Math.max(best, Math.abs(tmp0) + Math.abs(tmp1) + Math.abs(tmp2));
        tmp0 = tmp1 = tmp2 = 0;
        
        Arrays.sort(array, (a, b) -> Long.compare(a[1], b[1]));
        for (int i = 0; i < k; i++) {
            tmp0 += array[i][0];
            tmp1 += array[i][1];
            tmp2 += array[i][2];
        }
        best = Math.max(best, Math.abs(tmp0) + Math.abs(tmp1) + Math.abs(tmp2));
        tmp0 = tmp1 = tmp2 = 0;
        for (int i = n - 1; i > n - 1 - k; i--) {
            tmp0 += array[i][0];
            tmp1 += array[i][1];
            tmp2 += array[i][2];
        }
        best = Math.max(best, Math.abs(tmp0) + Math.abs(tmp1) + Math.abs(tmp2));
        tmp0 = tmp1 = tmp2 = 0;
        
        Arrays.sort(array, (a, b) -> Long.compare(a[2], b[2]));
        for (int i = 0; i < k; i++) {
            tmp0 += array[i][0];
            tmp1 += array[i][1];
            tmp2 += array[i][2];
        }
        best = Math.max(best, Math.abs(tmp0) + Math.abs(tmp1) + Math.abs(tmp2));
        tmp0 = tmp1 = tmp2 = 0;
        for (int i = n - 1; i > n - 1 - k; i--) {
            tmp0 += array[i][0];
            tmp1 += array[i][1];
            tmp2 += array[i][2];
        }
        best = Math.max(best, Math.abs(tmp0) + Math.abs(tmp1) + Math.abs(tmp2));
        tmp0 = tmp1 = tmp2 = 0;
        
        
        System.out.println(best);
    }
}
