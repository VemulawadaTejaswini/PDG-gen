import java.util.*;

public class Main {

    static int n;
    static int[][] d;
    static double ans = 0.0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        d = new int[n][2];
        double k = 1.0;
        for (int i = 0; i < n; i++) {
            d[i][0] = sc.nextInt();
            d[i][1] = sc.nextInt();
            k *= (i+1.0);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                ans += distance(d[i], d[j]) * (n-1) * 2 * k / n /(n-1);
            }
        }
        System.out.println(ans / k);
        sc.close();

    }
//    private static void dfs(int i, boolean[] used, double sum) {
//        used[i] = true;
//        boolean end = true;
//        for (int j = 0; j < n; j++) {
//            if(used[j]) continue;
//            end = false;
//            sum += distance(d[i], d[j]);
//            dfs(j, used, sum);
//        }
//        if(end) ans += sum;
//        used[i] = false;
//    }
    private static double distance(int[] d1, int[] d2) {
        return Math.sqrt( (d1[0]-d2[0])*(d1[0]-d2[0]) + (d1[1]-d2[1])*(d1[1]-d2[1]) );
    }

}
