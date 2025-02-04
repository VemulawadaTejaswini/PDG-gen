import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        
        // ans: r行すべてとc列すべてにある爆弾の個数の最大値
        int ans = 0;
        
        // countr, countc: 各行各列に存在する爆弾の個数
        // maxr, maxc: countr, countcの最大値
        // setp: 爆弾の存在する点の集合
        int[] countr = new int[h];
        int[] countc = new int[w];
        int maxr = 0;
        int maxc = 0;
        Set<Long> setp = new HashSet<Long>();
        for (int i = 0; i < m; i++) {
            int row = sc.nextInt()-1;
            int col = sc.nextInt()-1;
            countr[row]++;
            countc[col]++;
            maxr = Math.max(maxr, countr[row]);
            maxc = Math.max(maxc, countc[col]);
            setp.add((long)row * 1000000 + col);
        }
        
        // setr, setc: maxr, maxcである行、列の集合
        List<Integer> setr = new ArrayList<Integer>();
        for (int i = 0; i < h; i++) {
            if (maxr == countr[i]) setr.add(i);
        }
        List<Integer> setc = new ArrayList<Integer>();
        for (int i = 0; i < w; i++) {
            if (maxc == countc[i]) setc.add(i);
        }
        
        // maxrかつmaxcの(r, c)について全探索
        // (r, c)がsetpになければ++する
        boolean ok = false;
        for (int i = 0; i < setr.size(); i++) {
            for (int j = 0; j < setc. size(); j++) {
                int r = setr.get(i);
                int c = setc.get(j);
                long p = (long)r * 1000000 + c;
                if (!setp.contains(p)) ok = true;
            }
        }
        
        ans = maxr + maxc - 1;
        if (ok) ans++;
        System.out.println(ans);
    }
}
