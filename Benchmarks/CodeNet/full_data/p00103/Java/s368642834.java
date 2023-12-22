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
        Yukicoder solver = new Yukicoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class Yukicoder {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int hitCount, outCount;
            int inning = in.nextInt();
            for (int i = 0; i < inning; i++) {
                int score = 0;
                hitCount = 0;
                outCount = 0;
                while (true) {
                    String setUp = in.next();

                    if (setUp.equals("HIT")) {
                        hitCount++;
                    } else if (setUp.equals("OUT")) {
                        outCount++;
                    }

                    if (setUp.equals("HOMERUN")) {
                        score += hitCount + 1;
                        hitCount = 0;
                    }

                    if (hitCount == 4) {
                        score++;
                        hitCount -= 1;
                    }
                    // out
                    if (outCount == 3) {
                        out.println(score);
                        break;
                    }
                }
            }
        }

    }
}


