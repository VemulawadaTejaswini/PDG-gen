import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Kenji
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AGC027A solver = new AGC027A();
        solver.solve(1, in, out);
        out.close();
    }

    static class AGC027A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int x = in.nextInt();
            int aList[] = new int[N];
            int ans = 0;
            for (int i = 0; i < N; i++) {
                aList[i] = in.nextInt();
            }
            Arrays.sort(aList);
            for (int i = 0; i < N - 1; i++) {
                if (x >= aList[i]) {
                    ans++;
                    x -= aList[i];
                }
            }
            if (x == aList[N - 1]) {
                ans++;
            }
            out.println(ans);
        }

    }
}

