import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        long[] b = new long[n];
        for(int i = 0; i < n; i++){
            b[i] = a[i] - (i+1);
        }
        Arrays.sort(b);
        long B = b[n/2];
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += Math.abs(B - b[i]);
        }
        System.out.println(ans);
    }
}
