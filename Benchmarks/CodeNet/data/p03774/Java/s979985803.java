import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private static List<Point> start = new ArrayList<>();
    private static List<Point> end = new ArrayList<>();

    private static class Point {
        int x;
        int y;

        public Point(final int x, final int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }


    public static void main(String[] args) {
        FastReader in = new FastReader();
        solve(in);

    }


    private static void solve(final FastReader in) {
        int n = in.nextInt();
        int m = in.nextInt();
        coordinateBuilder(in, n, start);
        coordinateBuilder(in, m, end);
        for (int i = 0; i < n; i++) {
            int res = 0;
            for (int j = 0; j < m; j++) {
                if (distance(i, j) < distance(i, res)) {
                    res = j;
                }
            }
            System.out.println(res + 1);
        }
    }

    private static int distance(final int i, final int j) {
        return Math.abs(start.get(i).x - end.get(j).x) + Math.abs(start.get(i).y - end.get(j).y);
    }

    private static void coordinateBuilder(final FastReader in, final int range, final List<Point> coordinates) {
        for (int i = 0; i < range; i++) {
            coordinates.add(new Point(in.nextInt(), in.nextInt()));
        }
    }
}
