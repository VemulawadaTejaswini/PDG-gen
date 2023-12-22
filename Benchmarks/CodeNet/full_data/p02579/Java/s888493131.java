import java.util.*;

public class Main {

    static int[][] dir4 = new int[][]{{0, -1}, {1, 0}, {0, 1}, {-1, 0}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int SH = sc.nextInt()-1;
        int SW = sc.nextInt()-1;
        int S = SH*1000 + SW;
        int GH = sc.nextInt()-1;
        int GW = sc.nextInt()-1;
        boolean[][] g = new boolean[H][W];
        for (int i = 0; i < H; i++) {
            char[] s = sc.next().toCharArray();
            for (int j = 0; j < W; j++) {
                if(s[j] == '.') g[i][j] = true;
            }
        }
        DJSet dj = new DJSet(1_000_000);
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if(!g[i][j]) continue;
                int v = i * 1000 +  j;
                if(i < H-1 && g[i+1][j]){
                    dj.union(v, v + i*1000);
                }
                if(j < W-1 && g[i][j+1]){
                    dj.union(v, v+j);
                }
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        int[][] d = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                d[i][j] = Integer.MAX_VALUE;
                if(!g[i][j]) continue;
                int v = i*1000 + j;
                if(!map.containsKey(dj.root(v))){
                    map.put(dj.root(v), Integer.MAX_VALUE);
                }
            }
        }
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(dj.root(S));
        map.put(dj.root(S), 0);
        Set<Integer> uni = new HashSet<Integer>();
        uni.add(dj.root(S));
        d[SH][SW] = 0;
        boolean[][] checked = new boolean[H][W];
        checked[SH][SW] = true;
        while(!q.isEmpty()){
            ArrayDeque<Integer> q2 = new ArrayDeque<>();
            int c = map.get(q.peek());
            q2.add(q.poll());
            while(!q2.isEmpty()){
                int v = q2.poll();
                int h = v/1000, w = v%1000;
                d[h][w] = c;
                for(int[] dir : dir4){
                    int hn = h + dir[0], wn = w + dir[1];
                    if(hn < 0 || H <= hn || wn < 0 || W <= wn) continue;
                    if(checked[hn][wn] || !g[hn][wn]) continue;
                    q2.add(hn*1000 + wn);
                    checked[hn][wn] = true;
                    d[hn][wn] = d[h][w];
                }
                for (int hd = -2; hd <= 2; hd++) {
                    int hn = h + hd;
                    if(hn < 0 || H <= hn) continue;
                    for (int wd = -2; wd <= 2; wd++) {
                        int wn = w + wd;
                        if(wn < 0 || W <= wn) continue;
                        if(!g[hn][wn]) continue;
                        int r = dj.root(hn*1000 + wn);
                        if(uni.contains(r)) continue;
                        uni.add(r);
                        q.add(r);
                        map.put(r, c+1);
                    }
                }
            }
        }

        System.out.println(d[GH][GW] == Integer.MAX_VALUE ? -1 : d[GH][GW]);
        sc.close();

    }

}

class DJSet {
    /**
     * 各要素の親を保持する配列。
     * 自信が根である要素は負の数を持つ。
     * （負の数の場合、絶対値がその集合の要素数）
     */
    public int[] upper;

    /**
     * コンストラクタ。
     * @param n 対象となる要素数
     */
    public DJSet(int n) {
        upper = new int[n];
        Arrays.fill(upper, -1);
    }

    /**
     * 要素xが含まれる集合のrootを求める。
     * rootを求める過程で経路圧縮しrootが親になるようにする。
     * @param x 要素x
     * @return 要素xが含まれる集合のroot
     */
    public int root(int x) {
        return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
    }

    /**
     * 要素xと要素yが同じ集合か判定する。
     * @param x 要素x
     * @param y 要素y
     * @return 要素xと要素yが同じ集合であればtrue、そうでなければfalseを返す。
     */
    public boolean same(int x, int y) {
        return root(x) == root(y);
    }

    /**
     * 要素xと要素yを含むそれぞれの集合を合併する。
     * 要素数の多い集合のrootを残し、少ないほうのrootをその下に合併する。
     * @param x 要素x
     * @param y 要素y
     * @return 要素xと要素yを含むそれぞれの集合を合併できたらtrue、もともと同じ集合で合併しなかったらfalseを返す。
     */
    public boolean union(int x, int y) {
        x = root(x);
        y = root(y);
        if (x != y) {
            if (upper[y] < upper[x]) {
                int t = x;
                x = y;
                y = t;
            }
            upper[x] += upper[y];
            upper[y] = x;
        }
        return x != y;
    }

    /**
     * 集合の数を数える。
     * @return 集合の数
     */
    public int countSet() {
        int c = 0;
        for (int u : upper) {
            if (u < 0)
                c++;
        }
        return c;
    }

    /**
     * 要素ｘが含まれる集合の要素数を数える。
     * @param x 要素ｘ
     * @return 要素ｘが含まれる集合の要素数
     */
    public int countElement(int x) {
        return upper[root(x)] * -1;
    }
}
