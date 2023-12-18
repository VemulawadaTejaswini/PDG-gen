import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tok;

    public void go() throws IOException
    {
        ntok();
        int n = ipar();
        ArrayList<Vector> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            ntok();
            list.add(new Vector(ipar(), ipar()));
        }
        Collections.sort(list);
        ArrayList<Vector> prefix = new ArrayList<>();
        Vector p = new Vector();
        prefix.add(new Vector(p));
        for (int i = 0; i < 2 * n; i++)
        {
            p.add(list.get(i%n));
            prefix.add(new Vector(p));
        }
        // out.println(list);
        // out.println(prefix);
        double best = 0;
        for (int i = 0; i < n; i++)
        {
            for (int e = 0; e <= n; e++)
            {
                Vector res = new Vector(prefix.get(i+e));
                res.subtract(prefix.get(i));
                if (Math.hypot(res.x, res.y) > best)
                {
                    best = Math.hypot(res.x, res.y);
                    // out.println("---- " + i + " " + (i+e));
                }
            }
        }
        out.println(best);

        out.flush();
        in.close();
    }

    private class Vector implements Comparable<Vector>
    {
        long x, y;
        double angle;

        public Vector()
        {
            this(0, 0);
        }

        public Vector(Vector other)
        {
            this(other.x, other.y);
        }

        public Vector(long x, long y)
        {
            this.x = x;
            this.y = y;
            angle = Math.atan2(y, x);
        }

        public void add(Vector v)
        {
            x += v.x;
            y += v.y;
        }

        public void subtract(Vector v)
        {
            x -= v.x;
            y -= v.y;
        }

        public long cross(Vector other)
        {
            return x * other.y - y * other.x;
        }

        public long dot(Vector other)
        {
            return x * other.x + y * other.y;
        }

        public int compareTo(Vector other)
        {
            return Double.compare(angle, other.angle);
        }

        public String toString()
        {
            return String.format("(%d %d)", x, y);
        }
    }

    public void ntok() throws IOException
    {
        tok = new StringTokenizer(in.readLine());
    }

    public int ipar()
    {
        return Integer.parseInt(tok.nextToken());
    }

    public long lpar()
    {
        return Long.parseLong(tok.nextToken());
    }

    public double dpar()
    {
        return Double.parseDouble(tok.nextToken());
    }

    public String spar()
    {
        return tok.nextToken();
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }
}
