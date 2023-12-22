import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        
        int[] countr = new int[h];
        int[] countc = new int[w];
        Set<Integer> setr = new HashSet<Integer>();
        Set<Integer> setc = new HashSet<Integer>();
        Set<Long> setp = new HashSet<Long>();
        for (int i = 0; i < m; i++) {
            int row = sc.nextInt()-1;
            int col = sc.nextInt()-1;
            countr[row]++;
            countc[col]++;
            setr.add(row);
            setc.add(col);
            setp.add((long)row * 1000000 + col);
        }
        
        int maxr = 0;
        for (int i = 0; i < h; i++) {
            maxr = Math.max(maxr, countr[i]);
        }
        
        int maxc = 0;
        for (int i = 0; i < w; i++) {
            maxc = Math.max(maxc, countc[i]);
        }
        
        // ans: r行すべてとc列すべてにある爆弾の個数の最大値
        int ans = 0;
        
        for (Integer r : setr) {
            if (countr[r] != maxr) continue;
            for (Integer c : setc) {
                if (countc[c] != maxc) continue;
                int res = countr[r] + countc[c];
                long val = (long)r * 1000000 + c;
                if (setp.contains(val)) res--;
                ans = Math.max(ans, res);
                // System.out.println(res);
            }
        }
        System.out.println(ans);
    }
}
