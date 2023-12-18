

import java.util.*;

public class Main {
    static int n;
    static int m;
    static int s;
    static int t;
    static long arigane = (long) 1e15;
    static int[][] grapht;
    static int[][] graphf;
    static long[] tmemo;
    static long[] fmemo;
    static PriorityQueue<Path> paths;
    static long min = Long.MAX_VALUE;
    static List<Long> ret = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt() - 1;
        t = sc.nextInt() - 1;

            grapht = new int[n][n];
            graphf = new int[n][n];
            tmemo = new long[n];


    }

    static class Path {
        int current;
        long score;

        Path(int current, long score) {
            this.current = current;
            this.score = score;
        }
    }

    static class Edge {
        int to;
        int a;
        int b;
    }

}
