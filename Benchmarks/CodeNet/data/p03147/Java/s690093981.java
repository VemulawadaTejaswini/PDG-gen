import java.util.*;
import java.lang.*;

public class Main {
    
    static int n;
    static int[] h;

    
    public static void main (String args[]) {
        int ans = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        h = new int[n];
        int[] now = new int[n];
        boolean end = false;
        
        Arrays.fill(now, 0);
        
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        
        while(true) {
            int l = n;
            int r = 0;
            for (int i = 0; i < n; i++) {
                if (now[i] != h[i]) {
                    if (i < l) { l = i; }
                    if (i > r) { r = i; }
                } else {
                    if ((l == 0 && r == 0) || r != 0) {
                        break;
                    }
                }
                if (i == n - 1 && l == n && r == 0) { end = true; }
            }
            if (end) { break; }
            for (int i = l; i <= r; i++) {
                now[i] ++;
            }
            ans ++;
        }


        System.out.println(ans);
    }
    
    

}