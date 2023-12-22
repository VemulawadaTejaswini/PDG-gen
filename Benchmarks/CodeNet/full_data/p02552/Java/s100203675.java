import java.awt.*;
import java.io.*;

import java.math.BigInteger;
import java.util.*;

public class Main {



    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        
        pw.print(1 - sc.nextInt());


        pw.close();
    }
    static class Point implements Comparable<Point>
    {
        int x ,y ;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (x == o.x) {
                return y - o.y;
            }
            return x - o.x;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    static class Circle implements Comparable<Circle>
    {
        int x , radius ,idx;
        public Circle(int x , int r , int idx)
        {
            this.x = x;
            this.radius = r;
            this.idx = idx;
        }

        public boolean isInside(Point p)
        {
            return (p.x - x)*(p.x - x) + (p.y)*(p.y) <= radius * radius;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "x=" + x +
                    ", radius=" + radius +
                    '}';
        }

        @Override
        public int compareTo(Circle o) {
            return x - o.x;
        }
    }

    private static long gcd(long a, long b) {
        if( b == 0)
            return a;
        return gcd(b  , a%b);
    }

    static long lcm(int a, int b)
    {
        return (a*b)/gcd(a, b);
    }


    private  static int dis(int xa , int ya , int xb , int yb)
    {
        return (xa-xb)*(xa - xb) + (ya- yb)*(ya-yb);
    }


    static class Pair implements Comparable<Pair> {
        int x,y;


        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(Pair o) {
            if (y  == o.y)
                return x - o.x;
            return y - o.y;

        }

        public double dis(Pair a){

            return (a.x - x)*(a.x - x) + (a.y-y)*(a.y-y);
        }

        public String toString() {
            return  x+" "+ y;
        }
        public boolean overlap(Pair a)
        {
            if((this.x >= a.x && this.x <= a.y) || (a.x >= this.x && a.x <= this.y)) return true;
            return false;

        }
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public boolean check() {
            if (!st.hasMoreTokens())
                return false;
            return true;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String nextLine() {
            try {
                return br.readLine();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public double nextDouble() {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() {
            try {
                return br.ready();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}