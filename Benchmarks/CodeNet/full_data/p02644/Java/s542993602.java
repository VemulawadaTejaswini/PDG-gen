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
        PriorityQueue<State> q = new PriorityQueue<>();
        int [][][] dist = new int[h][w][4];
        int ret = Integer.MAX_VALUE;
        for (int [][] arr: dist) {
            for (int [] arr2: arr) Arrays.fill(arr2, Integer.MAX_VALUE);
        }
        for (int dir = 0; dir < 4; dir++) {
            q.add(new State(x1, y1, 0, dir));
            dist[x1][y1][dir] = 0;
        }
        while (!q.isEmpty()) {
            State s = q.poll();
            int r = s.r; int c = s.c; double ans = s.ans; int dir = s.dir;
            if (a[r][c] == 1) continue;
            if (inBounds(r + dx[dir], c + dy[dir])) {
                int nr = r + dx[dir]; int nc = c + dy[dir];
                if (dist[nr][nc][dir] > Math.ceil(ans + (double) 1 / k)) {
                    dist[nr][nc][dir] = (int) Math.ceil(ans + (double) 1 / k);
                    q.add(new State(nr, nc,ans + (double) 1 / k, dir));
                }
            }
            int nd = (dir + 1) % 4;
            if (dist[r][c][nd] > dist[r][c][dir]) {
                dist[r][c][nd] = dist[r][c][dir];
                q.add(new State(r, c, dist[r][c][dir], nd));
            }
        }
        for (int i = 0; i < 4; i++) ret = Math.min(ret, dist[x2][y2][i]);
        out.println((ret == Integer.MAX_VALUE) ? -1 : ret);
        out.close();
    }


    static boolean inBounds(int r, int c) { return (r >= 0 && r < h) && (c >= 0 && c < w); }

    static class State implements Comparable<State> {
        int r;
        int c;
        double ans;
        int dir;

        State(int r, int c, double ans, int dir) {
            this.r = r;
            this.c = c;
            this.ans = ans;
            this.dir = dir;
        }

        @Override
        public int compareTo(State o) {
            return Double.compare(ans, o.ans);
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