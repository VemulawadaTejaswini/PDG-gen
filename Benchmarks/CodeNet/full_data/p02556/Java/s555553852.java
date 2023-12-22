import java.io.*;
import java.util.*;

import static java.lang.Integer.*;

public class Main {
    static long mod = (long) 1e9 + 7;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        int n = parseInt(in.readLine());
        Pair1[] p1 = new Pair1[n];
        Pair2[] p2 = new Pair2[n];
        for (int i1 = 0; i1 < n; i1++) {
            st = new StringTokenizer(in.readLine());
            int i = parseInt(st.nextToken());
            int j = parseInt(st.nextToken());
            p1[i1] = new Pair1(i, j);
            p2[i1] = new Pair2(i, j);
        }
        pw.println(solve(p1, p2, n));
        pw.close();

    }

    static int solve(Pair1[] p1, Pair2[] p2, int n) {
        int res = 1;
        Arrays.sort(p1);
        Arrays.sort(p2);

        int x1 = Math.abs((p1[0].first - p2[n - 1].first));
        int y1 = Math.abs((p1[0].second - p2[n - 1].second));
        int x2 = Math.abs((p2[0].first - p1[n - 1].first));
        int y2 = Math.abs((p2[0].second - p1[n - 1].second));
        return Math.max((x1 + y1), (x2 + y2));
    }

    static class Pair1 implements Comparable<Pair1> {
        int first, second;

        Pair1(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair1 p) {
            return Integer.compare(first, p.first);
        }

        @Override
        public String toString() {
            return first + " " + second;
        }
    }

    static class Pair2 implements Comparable<Pair2> {
        int first, second;

        Pair2(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair2 p) {
            return Integer.compare(second, p.second);
        }

        @Override
        public String toString() {
            return first + " " + second;
        }
    }
}