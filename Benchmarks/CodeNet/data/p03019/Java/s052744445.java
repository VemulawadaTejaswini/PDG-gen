import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;


    class Exam implements Comparable<Exam> {
        int hisScore;
        int minCost, maxCost;
        long totalAdd;

        @Override
        public String toString() {
            return "Exam{" +
                    "hisScore=" + hisScore +
                    ", minCost=" + minCost +
                    ", maxCost=" + maxCost +
                    ", totalAdd=" + totalAdd +
                    '}';
        }

        public Exam(int hisScore, int minCost, int maxCost, int maxScore) {
            this.hisScore = hisScore;
            this.minCost = minCost;
            this.maxCost = maxCost;
            totalAdd = hisScore * 1L * minCost + (maxScore - hisScore) * 1L * maxCost;
        }

        @Override
        public int compareTo(Exam exam) {
            if (totalAdd != exam.totalAdd) {
                return -Long.compare(totalAdd, exam.totalAdd);
            }
            return -Integer.compare(minCost, exam.minCost);
        }

        long getCost(long needPoints) {
            if (needPoints > totalAdd) {
                throw new AssertionError();
            }
            if (needPoints == 0) {
                return 0;
            }
            if (minCost * 1L * hisScore >= needPoints) {
                return 1 + (needPoints - 1) / minCost;
            }
            needPoints -= hisScore * 1L * minCost;
            if (needPoints == 0) {
                return hisScore;
            }
            return hisScore + 1 + (needPoints - 1) / maxCost;
        }
    }

    void solve() {
        int n = in.nextInt();
        int maxScore = in.nextInt();
        Exam[] a = new Exam[n];
        long sumHisScore = 0;
        for (int i = 0; i < n; i++) {
            a[i] = new Exam(in.nextInt(), in.nextInt(), in.nextInt(), maxScore);
            sumHisScore += a[i].minCost * 1L * a[i].hisScore;
        }
        Arrays.sort(a);
//        System.err.println(Arrays.toString(a));
//        System.err.println("him = " + sumHisScore);
        long[] prefSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefSum[i + 1] = prefSum[i] + a[i].totalAdd;
        }
        long res = Long.MAX_VALUE;
        for (int notFully = 0; notFully < n; notFully++) {
//            System.err.println(notFully +"!");
            int l = -1, r = n;
            while (r - l > 1) {
                int mid = (l + r) >> 1;
                if (prefSum[mid + 1] - (mid < notFully ? 0 : a[notFully].totalAdd) <= sumHisScore) {
                    l = mid;
                } else {
                    r = mid;
                }
            }
            while (r >= 0) {
                if ((prefSum[r] - (r - 1 < notFully ? 0 : a[notFully].totalAdd)) + a[notFully].totalAdd < sumHisScore) {
                    break;
                }
                long needMore = sumHisScore - (prefSum[r] - (r - 1 < notFully ? 0 : a[notFully].totalAdd));
                long alreadyCost = maxScore * 1L * r;
                if (r - 1 < notFully) {

                } else {
                    alreadyCost -= maxScore;
                }
                long cost = alreadyCost + a[notFully].getCost(needMore);
                res = Math.min(res, cost);
                r--;
            }
        }
        out.println(res);
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
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
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}
