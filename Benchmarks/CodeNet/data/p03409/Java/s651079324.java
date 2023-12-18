import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N,M;
    ArrayList<Point> red,blue;

    private class Point {
        int x,y;

        public Point(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }

    private int dfs(int n,int m) {
        if (n == N) {
            return 0;
        }

        Point curRed = red.get(n);

        int ret = 0;
        ret = Math.max(ret,dfs(n + 1,m));
        for(int i = m;i < N;i++) {
            if(curRed.x < blue.get(i).x && curRed.y < blue.get(i).y) {
                ret = Math.max(ret,dfs(n + 1,i + 1) + 1);
            }
        }

        return ret;
    }

    private void solve() {
        N = nextInt();

        red = new ArrayList<>();
        blue = new ArrayList<>();

        for(int i = 0;i < N;i++) {
            int a = nextInt();
            int b = nextInt();

            red.add(new Point(a,b));
        }

        for(int i = 0;i < N;i++) {
            int c = nextInt();
            int d = nextInt();

            blue.add(new Point(c,d));
        }

        Collections.sort(red, new Comparator<Point>() {
            @Override
            public int compare(Point a, Point b) {
                return a.x - b.x;
            }
        });
        Collections.sort(blue, new Comparator<Point>() {
            @Override
            public int compare(Point a, Point b) {
                return a.x - b.x;
            }
        });

        Collections.sort(red, new Comparator<Point>() {
            @Override
            public int compare(Point a, Point b) {
                return a.y - b.y;
            }
        });
        Collections.sort(blue, new Comparator<Point>() {
            @Override
            public int compare(Point a, Point b) {
                return a.y - b.y;
            }
        });

        out.println(dfs(0,0));
    }

    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[2048];
    private int p = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }

    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }

    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}