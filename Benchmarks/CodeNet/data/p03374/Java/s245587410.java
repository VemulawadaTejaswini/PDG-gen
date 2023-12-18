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

           return  m.compareTo(max);
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


        long resultMax = Math.max(0, q.peek().max);

        long lastsum = 0;


        for (int b = N-1; b >=0; b--) {

            lastsum += v[b];

            long localmax = lastsum - (C - x[b]);

            long reverse = 0;

            long rminus = 0;

            if (q.isEmpty() == false) {

                Point p = q.peek();

                if (p.index >= b) {

                    while (q.isEmpty() == false && q.peek().index >= b) q.poll();

                    if (q.isEmpty() == false) {

                        reverse = q.peek().max;

                        rminus = Math.min(C-x[b], x[q.peek().index]);

                    }
                } else {

                    reverse = q.peek().max;

                    rminus = Math.min(C-x[b], x[q.peek().index]);
                }
            }

            localmax = localmax + reverse - rminus;
            resultMax = Math.max(localmax, resultMax);
        }

        System.out.print(resultMax);
    }


}