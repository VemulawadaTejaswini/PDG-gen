import java.util.*;
import java.io.*;

public class Main {
    static int h, w, k;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        h = sc.nextInt(); w = sc.nextInt(); k = sc.nextInt();
        int x1 = sc.nextInt() - 1; int y1 = sc.nextInt() - 1; int x2 = sc.nextInt() - 1; int y2 = sc.nextInt() - 1;
        int [][] a = new int[h][w];
        for (int i = 0; i < h; i++) {
            String q = sc.next();
            for (int j = 0; j < w; j++) if (q.charAt(j) == '@') a[i][j] = 1;
        }
        int [] dx = new int[]{1, 0, -1 , 0};
        int [] dy = new int[] {0, 1, 0, -1};
        LinkedList<State> q = new LinkedList<>();
        int ret = Integer.MAX_VALUE; boolean [][] vis = new boolean[h][w];
        vis[x1][y1] = true;
        for (int dir = 0; dir < 4; dir++) {
            int nr = x1 + dx[dir]; int nc = y1 + dy[dir];
            if (inBounds(nr, nc)) {
                q.add(new State(nr, nc, 0, dir, x1, y1));
                vis[x1 + dx[dir]][y1 + dy[dir]] = true;
            }
        }
        while (!q.isEmpty()) {
            State s = q.pollFirst();
            int r = s.r; int c = s.c; int ans = s.ans;
            int dir = s.dir; int lr = s.lr; int lc = s.lc;
            if (r == 0 && c == 3) {
                //System.out.println("HA");
            }
            if (a[r][c] == 1) continue;
            vis[r][c] = true;
            if (r == x2 && c == y2) {
                ans += dist(r, c, lr, lc);
                ret = Math.min(ans, ret);
                continue;
            }
            for (int d = 0; d < 4; d++) {
                int nr = r + dx[d]; int nc = c + dy[d];
                if (d == dir) {
                    if (inBounds(nr, nc) && !vis[nr][nc]) {
                        q.addLast(new State(nr, nc, ans, dir, lr, lc));
                    }
                } else {
                    if (inBounds(nr, nc) && !vis[nr][nc]) {
                        q.addLast(new State(nr, nc, ans + dist(r, c, lr, lc), d, r, c));
                    }
                }
            }
        }
        out.println((ret == Integer.MAX_VALUE) ? -1 : ret);
        out.close();
    }

    static int dist(int r1, int c1, int r2, int c2) {
        int dist = Math.abs(r1 - r2) + Math.abs(c1 - c2);
        if (dist % k == 0) return dist / k;
        else return dist / k + 1;
    }

    static boolean inBounds(int r, int c) { return (r >= 0 && r < h) && (c >= 0 && c < w); }

    static class State {
        int r; int c; int ans;
        int dir; int lr; int lc;
        State(int r, int c, int ans, int dir, int lr, int lc) {
            this.r = r; this.c = c; this.lr = lr; this.lc = lc;
            this.ans = ans; this.dir = dir;
        }
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}