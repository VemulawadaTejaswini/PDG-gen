//package AtCoder.C114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);

    static class Point {
        int x; int y;
        int[] quadrantCount = new int[4];
        Point(int x, int y) {
            this.x = x; this.y = y;
            Arrays.fill(quadrantCount, 0);
        }
    }

    static int p2(int base) {
        if (base==0) return 1;
        if (base%2==0) {int temp = p2(base/2); return (temp*temp);}
        return 2*p2(base-1);
    }

    public static void main(String[] args) {
        int n = in.NI();

        List<Point> points = new ArrayList<>();
        for (int i=0;i<n;i++) points.add(new Point(in.NI(), in.NI()));

        List<Point> pointsSotedByXcordinate = new ArrayList<>(points);
        pointsSotedByXcordinate.sort((o1, o2) -> {
            return (o1.x < o2.x)? -1: 1;
        });

        // line sweep algorithm from min X-cordinate to max X-cordinate to find
        // number of points in the t
        TreeSet<Integer> YCordinatesSeenSoFar = new TreeSet<>();
        for (Point point : pointsSotedByXcordinate) {
            int lowery = YCordinatesSeenSoFar.headSet(point.y).size();
            int uppery = YCordinatesSeenSoFar.size() - lowery;
            point.quadrantCount[2] += lowery;
            point.quadrantCount[1] += uppery;
            YCordinatesSeenSoFar.add(point.y);
        }

        YCordinatesSeenSoFar.clear();

        // line sweep algorithm from max X-cordinate to min X-cordinate to find
        // number of points in the two right quadrants.
        for (int i=points.size() - 1; i>=0; i--){
            Point point = pointsSotedByXcordinate.get(i);
            int lowery = YCordinatesSeenSoFar.headSet(point.y).size();
            int uppery = YCordinatesSeenSoFar.size() - lowery;
            point.quadrantCount[3] += lowery;
            point.quadrantCount[0] += uppery;
            YCordinatesSeenSoFar.add(point.y);
        }

        long ans = 0;

        /*for (Point point: points){
            out.println("(" + point.x + " " + ", " + point.y + ")");
        }*/

        // for each point find, how many subsets it contributes to.
        for (Point point: points) {

            ans += p2(n);

            for (int i=0;i<4;i++) {
                ans -= p2(point.quadrantCount[i] + point.quadrantCount[(i+1)%4]);
//                out.printf("%d ", point.quadrantCount[i] + point.quadrantCount[(i+1)%4]);
            }
//            out.println();

            for (int i=0;i<4;i++) {
                ans += p2(point.quadrantCount[i]);
//                out.printf("%d ", point.quadrantCount[i]);
            }
//            out.println();

            ans--;

//            out.println(ans);
        }

        out.println(ans);
        out.close();

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NI() {
            return Integer.parseInt(next());
        }

        public long NL() {
            return Long.parseLong(next());
        }

    }

}
