import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = null;
    static PrintWriter pw = null;


    static {

        sc = new Scanner(System.in);
    }

//    static Scanner sc = new Scanner("5\n" +
//            "5 3\n" +
//            "4 1\n" +
//            "9 1\n" +
//            "2 1\n" +
//            "5 4\n" +
//            "1 1\n" +
//            "8 2\n" +
//            "3 2\n" +
//            "6 1\n" +
//            "12 6\n" +
//            "15 2\n" +
//            "22 1\n" +
//            "4 2\n" +
//            "14 1\n" +
//            "23 1\n" +
//            "19 2\n" +
//            "53 9\n" +
//            "7 1\n" +
//            "19 1\n" +
//            "23 2\n" +
//            "40 2\n" +
//            "54 2\n" +
//            "81 1\n" +
//            "85 2\n" +
//            "94 1\n" +
//            "102 1\n" +
//            "8128376 30\n" +
//            "259694 2\n" +
//            "10267200 2\n" +
//            "591548 2\n" +
//            "5755696 2\n" +
//            "4307513 2\n" +
//            "5863522 2\n" +
//            "10040589 1\n" +
//            "2234412 1\n" +
//            "5086932 1\n" +
//            "14706276 1\n" +
//            "15430629 2\n" +
//            "2150128 2\n" +
//            "14561793 1\n" +
//            "7991506 2\n" +
//            "824138 2\n" +
//            "3450600 2\n" +
//            "6482303 1\n" +
//            "11413148 1\n" +
//            "12215231 2\n" +
//            "7578498 1\n" +
//            "13184008 2\n" +
//            "6684996 1\n" +
//            "11579040 1\n" +
//            "2662824 1\n" +
//            "13334004 2\n" +
//            "5954542 1\n" +
//            "7364389 1\n" +
//            "8028062 1\n" +
//            "11858536 1\n" +
//            "15223536 2");


    static int ni() {
        return sc.nextInt();
    }

    static int[] nia(int l) {
        int[] r = new int[l];
        for (int s = 0; s < l; s++) {
            r[s] = ni();
        }
        return r;
    }


    public static void main(String[] args) {
        boolean multi = false;

        if (multi) {
            int n = ni();
            for (int i = 0; i < n; i++) {
                solve(i + 1);
            }
        } else {
            solve(1);
        }

    }

    private static void solve(int csn) {
        int n = ni();
        int m = ni();
        int [][] data = new int[n][m];
        for (int i = 0 ; i < n ; i++) {
            for (int j  =0  ; j < m ; j++) {
                data[i][j] = ni() - 1;
            }
        }

        boolean[][] contains = new boolean[m][n];
        update(contains, data[0]);

        for (int r = 1 ; r < n ; r++) {
             ArrayList<int[]> edges = new ArrayList<>();
             for (int j = 0 ; j < m ; j++) {
                int s = data[r][j] / m;
                for (int t = 0 ; t < m ; t++) {
                    if(!contains[t][s]) {
                        edges.add(new int[]{j, t});
                    }
                }
             }

             Bipartite bp = new Bipartite(m, m, edges);
             Matching mm = bp.maxMatching();
             int [] prev = Arrays.copyOf(data[r], m);
             for (int s = 0 ; s < m ; s++) {
                 data[r][mm.n(s)] = prev[s];
             }
             update(contains, data[r]);
        }
        for (int [] k : data) {
            for (int i : k) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }


        int [][] nd = new int[n][m];

        for (int s = 0 ; s < n ; s ++) {
            for (int i = 0 ; i < m ; i++) {
                nd[data[s][i] / m][i] = data[s][i];
            }
        }
        for (int [] k : nd) {
            for (int i : k) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }

    }

    private static void update(boolean[][] contains, int[] ints) {
        for (int s = 0 ; s < ints.length ; s++) {
            contains[s][ints[s] / ints.length] = true;
        }
    }


    private static final int[] inn(int n) {
        int[] data = new int[n];
        Arrays.fill(data, -1);
        return data;
    }

    private static final int max(int[] n) {
        int max = 0;
        for (int i : n) {
            max = Math.max(i, max);
        }
        return max;
    }

    private static final class Bipartite {
        private int n;
        private int m;
        int[][] edges_n;
        int[][] edges_m;


        public Bipartite(int n, int m, ArrayList<int[]> edges) {
            this(n, m, edges.toArray(new int[0][0]));
        }

        public Bipartite(int n, int m, int[][] edges) {
            this.n = n;
            this.m = m;
            int[] ec_n = new int[n];
            int[] ec_m = new int[m];
            for (int[] s : edges) {
                ec_n[s[0]]++;
                ec_m[s[1]]++;
            }
            edges_n = new int[n][];
            edges_m = new int[m][];
            for (int s = 0; s < n; s++) {
                edges_n[s] = new int[ec_n[s]];
            }
            for (int s = 0; s < m; s++) {
                edges_m[s] = new int[ec_m[s]];
            }
            for (int[] s : edges) {
                edges_n[s[0]][--ec_n[s[0]]] = s[1];
                edges_m[s[1]][--ec_m[s[1]]] = s[0];
            }
        }


        private Matching maxMatching() {
            Matching matching = new Matching(n, m);
            boolean[] vis_n = new boolean[n];
            boolean[] vis_m = new boolean[m];
            for (int s = 0; s < n; s++) {
                Arrays.fill(vis_m, false);
                Arrays.fill(vis_n, false);
                vis_n[s] = true;
                dfs_n(s, matching, vis_n, vis_m);
            }
            return matching;

        }

        private boolean dfs_n(int s, Matching matching, boolean[] vis_n, boolean[] vis_m) {
            for (int l : edges_n[s]) {
                if (vis_m[l]) continue;
                vis_m[l] = true;
                if (matching.m(l) == -1 || dfs_m(l, matching, vis_n, vis_m)) {
                    matching.update(s, l);
                    return true;
                }
            }
            return false;
        }

        private boolean dfs_m(int s, Matching matching, boolean[] vis_n, boolean[] vis_m) {
            int ms = matching.m(s);
            if (ms != -1) {
                if (vis_n[ms]) return false;
                vis_n[ms] = true;
                return dfs_n(ms, matching, vis_n, vis_m);
            }
            for (int l : edges_m[s]) {
                if (vis_n[l] || matching.n(l) == -1) continue;
                vis_n[l] = true;
                if (dfs_n(l, matching, vis_n, vis_m)) return true;
            }
            return false;
        }

    }

    private static final class Matching {
        private int[] m_n;
        private int[] m_m;
        int size;

        private Matching(int n, int m) {
            m_n = new int[n];
            m_m = new int[m];
            Arrays.fill(m_n, -1);
            Arrays.fill(m_m, -1);
        }

        private int m(int l) {
            return m_m[l];
        }

        private int n(int l) {
            return m_n[l];
        }

        public void update(int s, int l) {
            if (m_n[s] == -1) {
                size++;
            }
            m_n[s] = l;
            m_m[l] = s;
        }
    }
}
