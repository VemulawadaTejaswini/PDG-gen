import java.util.*;

public class Main {

    static class Pair{
        public int x;
        public int y;
        public Pair(int x,int y) {
            this.x=x;
            this.y=y;
        }
        @Override
        public boolean equals(Object obj) {
            if(obj instanceof Pair) {
                Pair other = (Pair) obj;
                return other.x==this.x && other.y==this.y;
            }
            return false;
        }
        @Override
        public int hashCode() {
            return Objects.hash(this.x,this.y);
        }
    }

    static int H;
    static int W;
    static char[][] c;
    static boolean flag;
    static int cnt;
    static int[][] visited;
    static ArrayList<int[]> diff;


    static void dfs1(Pair pair) {
        int h = pair.x;
        int w = pair.y;
        if (c[h][w]=='.' && h==H-1 && w==W-1) {
            flag = true;
            return;
        }
        if (visited[h][w]!=0) return;
        if (c[h][w]=='#') {
            visited[h][w]=2;
            return;
        } else {
            visited[h][w]=1;
        }
        for (int[] tmp : diff) {
            if ((!(0<=h+tmp[0] && h+tmp[0]<H)) || (!(0<=w+tmp[1] && w+tmp[1]<W))) {
                continue;
            }
            Pair add = new Pair(h+tmp[0], w+tmp[1]);
            dfs1(add);
        }
    }

    static void dfs2(Pair pair) {
        int h = pair.x;
        int w = pair.y;
        if (visited[h][w]==3) return;
        if (c[h][w]=='.') {
            return;
        } else { // c[h][w]=='#'
            visited[h][w]=3;
        }
        for (int[] tmp : diff) {
            if ((!(0<=h+tmp[0] && h+tmp[0]<H)) || (!(0<=w+tmp[1] && w+tmp[1]<W))) {
                continue;
            }
            Pair add = new Pair(h+tmp[0], w+tmp[1]);
            dfs2(add);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        c = new char[H][W];
        for (int i=0;i<H;i++) {
            String S = sc.next();
            for (int j=0;j<W;j++) {
                c[i][j] = S.charAt(j);
            }
        }

        diff = new ArrayList<int[]>();
        int[] add_1 = {1, 0};int[] add_2 = {0, 1};int[] add_3 = {-1, 0};int[] add_4 = {0, -1};
        diff.add(add_1);diff.add(add_2);diff.add(add_3);diff.add(add_4);
        flag = false;
        cnt = 0;
        while (true) {
            visited = new int[H][W];
            Pair pair = new Pair(0, 0);
            dfs1(pair);
            if (flag) break;
            for (int i=0;i<H;i++) {
                for (int j=0;j<W;j++) {
                    if (visited[i][j]==2) {
                        // c[i][j] = '.';
                        Pair pai = new Pair(i, j);
                        dfs2(pai);
                    }
                }
            }
            for (int i=0;i<H;i++) {
                for (int j=0;j<W;j++) {
                    if (visited[i][j]==3) {
                        c[i][j] = '.';
                    }
                }
            }
            // System.out.println(Arrays.deepToString(visited));
            // System.out.println(Arrays.deepToString(c));
            cnt++;
        }
        System.out.println(cnt);
    }
}