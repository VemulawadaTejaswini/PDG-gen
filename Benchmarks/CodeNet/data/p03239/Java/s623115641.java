import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), T = sc.nextInt();
        int[] c = new int[n];
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
            t[i] = sc.nextInt();
        }
        int ans = INF;
        boolean exist = false;
        for (int i = 0; i < n; i++) {
            if (t[i] <= T) { 
                exist = true;
                ans = Math.min(ans, c[i]);
            }
        }
        if (exist) System.out.println(ans);
        else System.out.println("TLE");
    }
    public static final int INF = 10000;
}