import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Atg017B solver = new Atg017B();
        solver.solve(1, in, out);
        out.close();
    }

    static class Atg017B {
        int a;
        int b;
        int c;
        int d;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = in.nextInt();
            Atg017B.Range range = new Atg017B.Range(a, a);
            ArrayList<Atg017B.Range> rangeList = new ArrayList<Atg017B.Range>();
            rangeList.add(range);
            for (int i = 0; i < n - 1; i++) {
                rangeList = step(rangeList);
            }
            for (Atg017B.Range range0 : rangeList) {
                if (range0.distance == 0) {
                    out.println("YES");
                    return;
                }
            }
            out.println("NO");
            return;
        }

        ArrayList<Atg017B.Range> step(ArrayList<Atg017B.Range> rangeList) {
            ArrayList<Atg017B.Range> rangeList2 = new ArrayList<Atg017B.Range>();
            for (Atg017B.Range range : rangeList) {
                Atg017B.Range range1 = new Atg017B.Range(range.l + c, range.r + d);
                Atg017B.Range range2 = new Atg017B.Range(range.l - d, range.r - c);
                range1.calcDist(b);
                range2.calcDist(b);
                rangeList2.add(range1);
                rangeList2.add(range2);
            }
            rangeList2.sort(new Comparator<Atg017B.Range>() {

                public int compare(Atg017B.Range o1, Atg017B.Range o2) {
                    return (int) (o1.distance - o2.distance);
                }
            });
            ArrayList<Atg017B.Range> rangeList3 = new ArrayList<Atg017B.Range>();
            rangeList3.add(rangeList2.get(0));
            if (rangeList2.size() >= 2) {
                rangeList3.add(rangeList2.get(1));
            }
            if (rangeList2.size() >= 3) {
                rangeList3.add(rangeList2.get(2));
            }
            return rangeList3;
        }

        static class Range {
            long l;
            long r;
            long distance;

            Range(long l, long r) {
                this.l = l;
                this.r = r;
            }

            void calcDist(long goal) {
                if (l <= goal && goal <= r) {
                    distance = 0;
                } else if (r < goal) {
                    distance = goal - r;
                } else if (goal < l) {
                    distance = l - goal;
                }
            }

        }

    }
}

