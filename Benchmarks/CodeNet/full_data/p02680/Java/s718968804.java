import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Set;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FSingleDot solver = new FSingleDot();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSingleDot {
        public static final long INF = 1_000_000_001L;
        private int n;
        private int m;
        private int[] a;
        private int[] b;
        private int[] c;
        private int[] d;
        private int[] e;
        private int[] f;
        private boolean[][] wallAtX;
        private boolean[][] wallAtY;
        private int nbX;
        private int nbY;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
        /*if (testNumber==1) {
            random();
            return;
        }*/
            n = in.nextInt();
            m = in.nextInt();
            a = new int[n];
            b = new int[n];
            c = new int[n];
            d = new int[m];
            e = new int[m];
            f = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
                c[i] = in.nextInt();
            }
            for (int i = 0; i < m; i++) {
                d[i] = in.nextInt();
                e[i] = in.nextInt();
                f[i] = in.nextInt();
            }

            long res = solveMe();
            out.println(res == -1 ? "INF" : res);
        }

        private long solveMe() {
            //get wallX
            //get wallY
            long ans = 0;

            HashMap<Long, Integer> defaultMap = new HashMap<>();
            defaultMap.put(0L, null);
            defaultMap.put(-INF, null);
            defaultMap.put(INF, null);
            HashMap<Long, Integer> mapX = new HashMap<>(defaultMap);
            HashMap<Long, Integer> mapY = new HashMap<>(defaultMap);

            mapX.put(0L, null);
            for (int i = 0; i < n; i++) {
                mapX.put((long) a[i], null);
                mapX.put((long) b[i], null);
                mapY.put((long) c[i], null);
            }
            mapY.put(0L, null);
            for (int i = 0; i < m; i++) {
                mapX.put((long) d[i], null);
                mapY.put((long) e[i], null);
                mapY.put((long) f[i], null);
            }

            nbX = mapX.size();
            Long[] valX = mapX.keySet().toArray(new Long[0]);
            Arrays.sort(valX);
            for (int i = 0; i < nbX; i++) {
                mapX.put(valX[i], i);
            }

            nbY = mapY.size();
            Long[] valY = mapY.keySet().toArray(new Long[0]);
            Arrays.sort(valY);
            for (int i = 0; i < nbY; i++) {
                mapY.put(valY[i], i);
            }

            FSingleDot.MyVertex[][] vertices = new FSingleDot.MyVertex[nbX - 1][nbY - 1];
            for (int i = 0; i < nbX - 1; i++)
                for (int j = 0; j < nbY - 1; j++) {
                    Long val = (i == 0 || j == 0 || i == nbX - 2 || j == nbY - 2) ? null : (valX[i + 1] - valX[i]) * (valY[j + 1] - valY[j]);
                    vertices[i][j] = new FSingleDot.MyVertex(i, j, val);
                }

            wallAtX = new boolean[nbX][nbY - 1];
            wallAtY = new boolean[nbX - 1][nbY];
            for (int i = 0; i < n; i++) {
                int start = mapX.get((long) a[i]);
                int end = mapX.get((long) b[i]);
                int y = mapY.get((long) c[i]);
                for (int j = start; j < end; j++) {
                    wallAtY[j][y] = true;
                }
            }

            for (int i = 0; i < m; i++) {
                int start = mapY.get((long) e[i]);
                int end = mapY.get((long) f[i]);
                int x = mapX.get((long) d[i]);
                for (int j = start; j < end; j++) {
                    wallAtX[x][j] = true;
                }
            }

            boolean[][] visited = new boolean[nbX - 1][nbY - 1];
            ArrayDeque<FSingleDot.MyVertex> list = new ArrayDeque<>();
            list.add(vertices[mapX.get(0L)][mapY.get(0L)]);
            //d(s("nextX", mapX.get((long)0), "nextY", mapY.get((long)0)));
            visited[0][0] = true;
            int[][] moves = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            //d("wallX", stringMe(wallAtX));
            //d("wallY", stringMe(wallAtY));

            while (!list.isEmpty()) {
                FSingleDot.MyVertex cur = list.pop();
                for (int i = 0; i < moves.length; i++) {
                    int nextX = cur.xPos + moves[i][0];
                    int nextY = cur.yPos + moves[i][1];
                    //d(s("nextX", valX[nextX], "nextY", valY[nextY]));
                    if (isInside(nextX, nextY) && !visited[nextX][nextY] && !hasWall(cur, moves[i])) {
                        //d("is ok");
                        FSingleDot.MyVertex nextVertex = vertices[nextX][nextY];
                        visited[nextX][nextY] = true;
                        if (nextVertex.val == null)
                            return -1;
                        ans += nextVertex.val;
                        list.add(nextVertex);
                    }
                }
            }
            return ans;
        }

        private boolean hasWall(FSingleDot.MyVertex cur, int[] move) {
            if (move[0] != 0) {
                return (move[0] == 1 && wallAtX[cur.xPos + 1][cur.yPos]) || (move[0] == -1 && wallAtX[cur.xPos][cur.yPos]);
            } else {
                return (move[1] == 1 && wallAtY[cur.xPos][cur.yPos + 1] || (move[1] == -1 && wallAtY[cur.xPos][cur.yPos]));
            }
        }

        private boolean isInside(int nextX, int nextY) {
            return nextX >= 0 && nextX < nbX - 1 && nextY >= 0 && nextY < nbY - 1;
        }

        public static class MyVertex {
            int xPos;
            int yPos;
            Long val;

            public MyVertex(int xPos, int yPos, Long val) {
                this.xPos = xPos;
                this.yPos = yPos;
                this.val = val;
            }

        }

    }

    static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;
        String context = null;

        public FastReader(InputStream in) {
            this(new InputStreamReader(in));
        }

        public FastReader(InputStreamReader input) {
            br = new BufferedReader(input);
        }

        public String next() {
            if (context != null) {
                System.err.print("[" + context + "] Wait for input ...");
            }
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null)
                        return null;
                    st = new StringTokenizer(s);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Could not read");
                }
            }
            String res = st.nextToken();
            if (context != null) {
                System.err.println("[" + context + "] ... received : " + res);
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

