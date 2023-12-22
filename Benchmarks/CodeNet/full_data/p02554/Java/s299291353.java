import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main
{
    public static void main(String[] args)
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int T = 1;
            while (T-- > 0)
            {
                solveOne(in, out);
            }
        }

        private void solveOne(Scanner in, PrintWriter out)
        {
            long MOD = 1_000_000_000 + 7;
            long N = in.nextInt();

            if (N == 1 || N == 2)
            {
                out.println(N == 1 ? 0 : 1);
                return;
            }

            long ans = CPUtils.modPower(10L, N, MOD);

            ans -= 2L * CPUtils.modPower(9L, N, MOD);
            ans += CPUtils.modPower(8L, N, MOD);

            ans %= MOD;
            if (ans < 0)
                ans += MOD;

            out.println(ans);
        }

    }

    static class CPUtils
    {
        public static long modPower(long base, long exponent, long mod)
        {
            if (base >= mod)
            {
                base %= mod;
            }
            if (exponent == 0)
            {
                return 1 % mod;
            }
            long result = modPower(base, exponent >> 1, mod);
            result = result * result % mod;
            if ((exponent & 1) != 0)
            {
                result = result * base % mod;
            }
            return result;
        }

    }
}

