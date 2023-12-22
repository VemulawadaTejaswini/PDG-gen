import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n + 1];
        int res = 0;
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
            a[i] += a[i - 1];
            if(a[i] <= k)
                res = i;
        }
        long curr = 0;
        for(int i = 1; i <= m; i++){
            curr += sc.nextInt();
            if(k < curr)
                break;
            k -= curr;
            int idx = Arrays.binarySearch(a, curr);
            if(idx < 0)
                idx = -(idx + 1);
            res = Math.max(res, i + idx);
        }
        System.out.println(res);
    }
}