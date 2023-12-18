import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Predicate;
import java.math.BigInteger;
import java.rmi.MarshalException;
import java.time.Instant;
import java.time.Duration;
import java.util.concurrent.*;

public class Main {
    static int height;
    static int width;
    static char[][] grid;
    static int[] dh = new int[] {0, 0, 1, -1};
    static int[] dw = new int[] {1, -1, 0, 0};

    static boolean valid(int h, int w) {
        return h >= 0 && h < height && w >= 0 && w < width && grid[h][w] != '#';
    }
    // return furthest dist, height, width of futhest point
    static int[] BFS(int h, int w) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(h, w));
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int[][] dist = new int[grid.length][grid[0].length];
        visited[h][w] = true;
        dist[h][w] = 0;
        
        int maxdist = 0;
        int maxh = -1;
        int maxw = -1;
        
        while (!q.isEmpty()) {
            Pair cur = q.poll();
            if (dist[cur.x][cur.y] > maxdist) {
                maxdist = dist[cur.x][cur.y];
                maxh = cur.x;
                maxw = cur.y;
            }
            for (int i = 0; i < dh.length; i++) {
                int nexth = cur.x + dh[i];
                int nextw = cur.y + dw[i];
                if (valid(nexth, nextw) && !visited[nexth][nextw]) {
                    q.add(new Pair(nexth, nextw));
                    visited[nexth][nextw] = true;
                    dist[nexth][nextw] = dist[cur.x][cur.y] + 1;
                }
            }
        }
        return new int[] {maxdist, maxh, maxw};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // long startTime = System.nanoTime();
        // int  = sc.next();
        // int  = sc.nextInt();
        /////////////////////////////////////////////////////
        height = sc.nextInt();
        width = sc.nextInt();
        grid = new char[height][width];
        for (int i = 0; i < height; i++) {
            grid[i] = sc.next().toCharArray();
        }
        int[] firstres = BFS(0, 0);
        int[] sndres = BFS(firstres[1], firstres[2]);
        System.out.println(sndres[0]);

        // for (int i = 0; i < h; i++) {
        //     System.out.println(new String(grid[i]));
        // }
        /////////////////////////////////////////////////////
        // long endTime = System.nanoTime();
        // System.out.printf("Executed in: %.2fms\n", ((double)endTime - startTime) / 1000000);
        // sc.close();
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    static boolean isOdd(int n) {
        return n % 2 == 1;
    }
     
    static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

class Pair {
    public int x;
    public int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        // System.out.println("inside equals");
        if (o == this) {
            return true;
        } else if (!(o instanceof Pair)) {
            return false;
        } else {
            Pair p = (Pair)o;
            return this.x == p.x && this.y == p.y;
        }
    }

    @Override
    public int hashCode() {
        // System.out.println("inside hashcode");
        return Arrays.hashCode(new int[]{this.x, this.y});
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}