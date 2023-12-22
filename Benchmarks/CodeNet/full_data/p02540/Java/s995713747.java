import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
 
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AReachableTowns solver = new AReachableTowns();
        solver.solve(1, in, out);
        out.close();
    }
 
    static class AReachableTowns {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            pair[] a = new pair[N + 1];
            for (int i = 1; i <= N; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                pair p = new pair(x, y);
                a[i] = p;
            }
            for (int i = 1; i <= N; i++) {
                int c = 0;
                for (int j = 1; j <= N; j++) {
                    if ((a[i].x <= a[j].x && a[i].y <= a[j].y) || (a[i].x >= a[j].x && a[i].y >= a[j].y))
                        c++;
 
                }
                out.println(c);
            }
 
        }
 
    }
 
    static class pair {
        int x;
        int y;
 
        pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
 
    }
}