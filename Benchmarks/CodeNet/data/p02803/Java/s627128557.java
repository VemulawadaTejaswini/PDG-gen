import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int h = sc.nextInt();
    static int w = sc.nextInt();
    static char[][] s = new char[h][w];

    public static void main(String[] args){
        for (int i=0; i<h; i++){
            s[i] = sc.next().toCharArray();
        }

        int ans = 0;

        for (int i=0; i<h; i++){
            for (int j=0; j<w; j++){
                if (s[i][j]=='#') continue;
                int tmp = dfs(i, j);
                ans = Math.max(ans, tmp);
            }
        }

        System.out.println(ans);
    }

    public static int dfs(int i, int j){
        int ret = 0;
        int[][] d = new int[h][w];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int a=0; a<h; a++){
            for (int b=0; b<w; b++){
                d[a][b] = Integer.MAX_VALUE;
            }
        }
        d[i][j] = 0;
        Queue<P> queue = new ArrayDeque<>();
        P p = new P(i, j);
        queue.add(p);
        while (!queue.isEmpty()){
            P pp = ((ArrayDeque<P>) queue).pollFirst();
            int first = pp.s;
            int second = pp.t;
            for (int k=0; k<4; k++){
                int ny = first + dy[k];
                int nx = second + dx[k];
                if (ny<0 || h<=ny || nx<0 || w<=nx) continue;
                if (s[ny][nx]=='#') continue;
                if (d[ny][nx]!=Integer.MAX_VALUE) continue;
                d[ny][nx] = d[first][second] + 1;
                P tmpP = new P(ny, nx);
                queue.add(tmpP);
            }
        }
        for (int a=0; a<h; a++){
            for (int b=0; b<w; b++){
                if (d[a][b]==Integer.MAX_VALUE) continue;
                ret = Math.max(ret, d[a][b]);
            }
        }
        return ret;
    }

    public static class P{
        int s;
        int t;

        public P(int s, int t){
            this.s = s;
            this.t = t;
        }
    }
}
