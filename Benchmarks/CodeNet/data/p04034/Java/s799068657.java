import java.util.*;
import java.text.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int[] num;
    public static int[] cur;
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        int m = sc.nextInt();
        num = new int[n+1];
        cur = new int[n+1];
        cur[1] = 1;
        
        for (int i = 1; i <= n; i++) {
            num[i] = 1;
        }
        
        for (int i = 1; i <= m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (cur[x] > 0) {
                if (num[x] == 1) {
                    cur[x] = 0;
                }
                cur[y] = 1;
            }
            num[x]--;
            num[y]++;
        }
        
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (cur[i] > 0) {
                res++;
            }
        }
        
        System.out.println(res);
    }
}
