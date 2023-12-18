import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ky112233
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BPowerSocket solver = new BPowerSocket();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPowerSocket {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int cnt = 0;
            int cur = 1;
            while (cur < b) {
                cur -= 1;
                cur += a;
                cnt++;
            }
            out.println(cnt);
        }

    }
}

