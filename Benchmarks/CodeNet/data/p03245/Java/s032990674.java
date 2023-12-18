import java.util.*;

public class Main {
    private class Point {
        long x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean isOdd() {
            return (x + y) % 2 == 0;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        Point p[] = new Point[n];

        BitSet bs = new BitSet();
        for (int i = 0; i < n; i++) {
            p[i] = new Point(sc.nextInt(), sc.nextInt());
            if (p[i].isOdd()) {
                bs.set(i);
            }
        }
        sc.close();

        if (bs.cardinality() > 0 && bs.cardinality() < n) {
            System.out.println(-1);
            return;
        }

        int m = 32;
        long l[] = new long[m];
        for (int i = 0; i < m; i++) {
            l[i] = 1L << i;
        }

        if (bs.cardinality() != 0) {
            l[m - 1] = 1;
        }
        Arrays.sort(l);

        System.out.println(m);
        System.out.println(Arrays.toString(l).replaceAll("[^0-9 ]", ""));
        for (int i = 0; i < n; i++) {
            int x[] = new int[m];
            int y[] = new int[m];
            long s = 0;

            if (Math.abs(p[i].x) < Math.abs(p[i].y)) {
                y[m - 1] = Long.signum(p[i].y);
                p[i].y -= y[m - 1] * l[m - 1];
                for (int j = m - 2; j >= 0; j--) {
                    if (Math.abs(p[i].y) >= l[j]) {
                        y[j] = Long.signum(p[i].y);
                        p[i].y -= y[j] * l[j];
                    } else {
                        s += l[j];
                    }
                }

                long a = (s + p[i].x) / 2;
                for (int j = m - 2; j >= 0; j--) {
                    if (y[j] == 0) {
                        if (a >= l[j]) {
                            x[j] = 1;
                            a -= l[j];
                        } else {
                            x[j] = -1;
                        }
                    }
                }
            } else {
                x[m - 1] = Long.signum(p[i].x);
                p[i].x -= x[m - 1] * l[m - 1];
                for (int j = m - 2; j >= 0; j--) {
                    if (Math.abs(p[i].x) >= l[j]) {
                        x[j] = Long.signum(p[i].x);
                        p[i].x -= x[j] * l[j];
                    } else {
                        s += l[j];
                    }
                }

                long a = (s + p[i].y) / 2;
                for (int j = m - 2; j >= 0; j--) {
                    if (x[j] == 0) {
                        if (a >= l[j]) {
                            y[j] = 1;
                            a -= l[j];
                        } else {
                            y[j] = -1;
                        }
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < m; j++) {
                if (x[j] == 1) {
                    sb.append("R");
                } else if (x[j] == -1) {
                    sb.append("L");
                } else if (y[j] == 1) {
                    sb.append("U");
                } else {
                    sb.append("D");
                }
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
    }
}
