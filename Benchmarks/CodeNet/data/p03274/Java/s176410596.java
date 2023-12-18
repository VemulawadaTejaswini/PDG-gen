
import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] x = new int[N];
        for (int i = 0; i < N; i++) x[i] = sc.nextInt();

        long ans = Long.MAX_VALUE;
        for(int i = 0; i+K-1 < N; i++){
            long xl = x[i];
            long xr = x[i+K-1];

            if(xl < 0 && xr <= 0){
                ans = Math.min(ans, xl);
            } else if (xl >= 0 && xr > 0){
                ans = Math.min(ans, xr);
            } else {  // xl <= 0, 0 <= xr
                ans = Math.min(ans, Math.min(-xl, xr) + xr - xl);
            }
        }

        out.println(ans);
    }
}
