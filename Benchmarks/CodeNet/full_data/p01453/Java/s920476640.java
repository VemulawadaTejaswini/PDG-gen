import java.math.BigDecimal;
import java.util.*;

class Point {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class State {
    public Point p;
    public int cnt;

    State(Point p, int cnt) {
        this.p = p;
        this.cnt = cnt;
    }
}


/**
 * C++???????????????????????????????????????????????????????±????
 */
public class Main {
    public static final BigDecimal EPS = new BigDecimal(1e-10);
    public static final int H = 500;
    public static final int W = 500;
    public static final int[] dy = new int[]{-1, 0, 1, 0};
    public static final int[] dx = new int[]{0, -1, 0, 1};

    int w, h;
    int[][] dis_go, dis_sp;
    BigDecimal cnt_nowall;
    Point st, go;
    List<Point> v;
    Boolean[][] wall;

    public Main() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            w = sc.nextInt();
            h = sc.nextInt();
            v = new ArrayList<Point>();
            wall = new Boolean[h][w];

            for (int i = 0; i < h; i++) {
                String str = sc.next();
                for (int j = 0; j < w; j++) {
                    wall[i][j] = true;
                    if (str.charAt(j) == 's') {
                        st = new Point(j, i);
                        wall[i][j] = false;
                    } else if (str.charAt(j) == 'g') {
                        go = new Point(j, i);
                    } else if (str.charAt(j) == '*') {
                        v.add(new Point(j, i));
                    } else if (str.charAt(j) == '.') {
                        wall[i][j] = false;
                    }
                }
            }
            System.out.println(solve());
        }

        sc.close();
    }

    private void init_dis() {
        Queue<State> q = new LinkedList<State>();

        cnt_nowall = new BigDecimal(0);
        dis_go = new int[h][w];
        dis_sp = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                dis_go[i][j] = dis_sp[i][j] = -1;
                if (!wall[i][j]) {
                    cnt_nowall = cnt_nowall.add(BigDecimal.ONE);
                }
            }
        }

        for (q.offer(new State(go, 0)); !q.isEmpty(); ) {
            State u = q.poll();
            for (int i = 0; i < 4; i++) {
                State u2 = new State(new Point(u.p.x + dx[i], u.p.y + dy[i]), u.cnt + 1);
                if (!wall[u2.p.y][u2.p.x] && (dis_go[u2.p.y][u2.p.x] == -1 || dis_go[u2.p.y][u2.p.x] > u2.cnt)) {
                    dis_go[u2.p.y][u2.p.x] = u2.cnt;
                    q.offer(u2);
                }
            }
        }

        for (Point vi : v) {
            for (q.offer(new State(vi, 0)); !q.isEmpty(); ) {
                State u = q.poll();
                for (int i = 0; i < 4; i++) {
                    State u2 = new State(new Point(u.p.x + dx[i], u.p.y + dy[i]), u.cnt + 1);
                    if (!wall[u2.p.y][u2.p.x] && (dis_sp[u2.p.y][u2.p.x] == -1 || dis_sp[u2.p.y][u2.p.x] > u2.cnt)) {
                        dis_sp[u2.p.y][u2.p.x] = u2.cnt;
                        q.offer(u2);
                    }
                }
            }
        }
    }

    private BigDecimal calc_exp(int base) {
        BigDecimal a = new BigDecimal(1), b = new BigDecimal(0), exp_go = new BigDecimal(0);

        for (int i = 1; i < h - 1; i++) {
            for (int j = 1; j < w - 1; j++) {
                if (!wall[i][j]) {
                    if (dis_go[i][j] == -1 || dis_sp[i][j] != -1 && dis_go[i][j] >= dis_sp[i][j] + base) {
                        a = a.subtract(BigDecimal.ONE.divide(cnt_nowall, 12, BigDecimal.ROUND_HALF_UP));
                        b = b.add(BigDecimal.valueOf(dis_sp[i][j]).divide(cnt_nowall, 12, BigDecimal.ROUND_HALF_UP));
                        //a -= 1.0 / cnt_nowall;
                        //b += (long double)dis_sp[i][j] / cnt_nowall;
                    } else {
                        exp_go = exp_go.add(BigDecimal.valueOf(dis_go[i][j]).divide(cnt_nowall, 12, BigDecimal.ROUND_HALF_UP));
                        //exp_go += (long double)dis_go[i][j] / cnt_nowall;
                    }
                }
            }
        }

        return b.add(exp_go).divide(a, 12, BigDecimal.ROUND_HALF_UP);
        //return (b + exp_go) / a;
    }

    private BigDecimal solve() {
        BigDecimal res = null;

        init_dis();

        if (dis_go[st.y][st.x] != -1) res = BigDecimal.valueOf(dis_go[st.y][st.x]);

        if (dis_sp[st.y][st.x] != -1) {
            int le = 2, ri = dis_go[st.y][st.x] - dis_sp[st.y][st.x] + 1, mid1, mid2;
            BigDecimal res0, res1, res2;
            if (dis_go[st.y][st.x] == -1) ri = (h - 2) * (w - 2);
            while (ri - le >= 4) {
                mid1 = (le * 2 + ri) / 3;
                mid2 = (le + ri * 2) / 3;
                res0 = calc_exp(le).add(BigDecimal.valueOf(dis_sp[st.y][st.x]));
                res1 = calc_exp(mid1).add(BigDecimal.valueOf(dis_sp[st.y][st.x]));
                res2 = calc_exp(mid2).add(BigDecimal.valueOf(dis_sp[st.y][st.x]));
                if (mid2 - mid1 <= 1) break;
                //if(res0 >= res1 - EPS && res1 >= res2 - EPS) le = mid1;
                if (res0.compareTo(res1.subtract(EPS)) == 1 && res1.compareTo(res2.subtract(EPS)) == 1) le = mid1;
                else ri = mid2;
            }
            for (int i = le; i < le + 5; i++) {
                if (dis_go[st.y][st.x] != -1 && dis_go[st.y][st.x] < dis_sp[st.y][st.x] + i) break;
                if (res == null) res = calc_exp(i).add(BigDecimal.valueOf(dis_sp[st.y][st.x]));
                else res = res.min(calc_exp(i).add(BigDecimal.valueOf(dis_sp[st.y][st.x])));
            }
        }

        return res;
    }

    public static void main(String[] args) {
        new Main();
    }
}