import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt() - 1;
        int[] x = new int[n];
        for(int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n - k; i++) {
            if(x[i] < 0 && 0 < x[i+k]) {
                ans = Math.min(ans, Math.min(-x[i], x[i + k]) * 2 + Math.max(-x[i], x[i + k]));
            } else {
                ans = Math.min(ans, 0 < x[i] ?  x[i + k] : -x[i]);
            }
        }
        System.out.println(ans);
    }
}