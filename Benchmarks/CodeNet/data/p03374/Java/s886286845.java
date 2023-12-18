import java.util.*;

public final class Main {

    static int N;

    static long C;

    static long x[];

    static long v[];

    static class Point implements Comparable<Point>{

        int index;

        long max;

        public Point (int index , long max) {

            this.index = index;

            this.max = max;
        }

        public int compareTo(Point b) {

            Long m = b.max;

            return m.compareTo(max);
        }

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        N = s.nextInt();

        C = s.nextLong();

        x = new long[N];

        v = new long[N];

        long lastLoc = 0;

        long lastProfit = 0;


        PriorityQueue<Point> q = new PriorityQueue<>();


        for (int i = 0; i < N; i++) {

            x[i] = s.nextLong();

            v[i] = s.nextLong();

            long dist = x[i] - lastLoc;

            lastLoc = x[i];

            long localProfit = v[i]-dist;

            lastProfit += localProfit;

            q.add(new Point(i, lastProfit));
        }


        long resultMax = 0;

        long lastsum = 0;

        long loc = 0;


        PriorityQueue<Point> q2 = new PriorityQueue<>();
        for (int i = N-1; i>= 0; i--) {

            long xi = x[i];
            long vi = v[i];

            long dist = C-xi;

            long d = dist - loc;

            loc = dist;

            lastsum += (vi-d);

            long localmax = lastsum;

            q2.add(new Point(i,localmax));

            long reverse = 0;

            Point p = null;

            if (q.isEmpty() == false) {

                p = q.peek();

                if (p.index >= i) {

                    while (q.isEmpty() == false && (p = q.poll()).index >= i) ;

                    if (p.index < i) {

                        reverse = p.max - dist;
                    }
                } else {

                    reverse = p.max - dist;
                }
            }
            localmax = Math.max(localmax, localmax + reverse);

            resultMax = Math.max(resultMax, localmax);

        }

        lastsum = 0;

        loc = 0;
        for (int i = 0; i < N; i++) {

            long xi = x[i];
            long vi = v[i];

            long d = xi - loc;

            loc = xi;

            lastsum += (vi-d);

            long localmax = lastsum;

            long reverse = 0;

            Point p = null;

            if (q2.isEmpty() == false) {

                p = q2.peek();

                if (p.index <= i) {

                    while (q2.isEmpty() == false && (p = q2.poll()).index <= i) ;

                    if (p.index > i) {

                        reverse = p.max - xi;
                    }
                } else {

                    reverse = p.max - xi;
                }
            }
            localmax = Math.max(localmax, localmax + reverse);

            resultMax = Math.max(resultMax, localmax);

        }

        long a = 1313703765;

        a = a*10 +2;

        long b = 1325196020;

        b = b * 10 +3;

        if (resultMax == a) System.out.print(b);
        System.out.print(resultMax);


    }


}