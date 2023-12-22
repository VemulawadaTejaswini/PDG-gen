import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static int cnt = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        var hm = new HashMap<Integer, Long>();
        var wm = new HashMap<Integer, Long>();
        var hw = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            hm.put(i, 0L);
        }
        for (int i = 0; i < w; i++) {
            wm.put(i, 0L);
        }
        for (int i = 0; i < m; i++) {
            int hh = Integer.parseInt(sc.next());
            int ww = Integer.parseInt(sc.next());
            hm.merge(hh - 1, 1L, Long::sum);
            wm.merge(ww - 1, 1L, Integer::sum);
            hw[hh - 1][ww - 1] = true;
        }
        long ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                long num = hm.get(i) + wm.get(j);
                if (hw[i][j]) {
                    num--;
                }
                ans = Math.max(ans, num);
            }
        }
        System.out.println(ans);
    }
}