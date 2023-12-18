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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task
    {
        static long mod = 1_000_000_000 + 7;

        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            long n = in.nextInt();
            long a = in.nextInt();
            long b = in.nextInt();

            long ans = power(2, n, mod) - 1;
            ans -= C(n, a, mod) % mod;
            ans -= C(n, b, mod) % mod;

            while (ans < 0)
            {
                ans += mod;
            }

            out.print(ans);
        }

        static long power(long a, long n, long m)
        {
            long ret = 1;
            for (; n > 0; n >>= 1, a = a * a % m)
            {
                if (n % 2 == 1)
                {
                    ret = ret * a % m;
                }
            }
            return ret;
        }

        static long C(long N, long K, long mod)
        {
            long x = 1, y = 1;
            for (int i = 1; i <= K; i++)
            {
                x = x * (N - i + 1) % mod;
                y = y * i % mod;
            }
            return x * power(y, mod - 2, mod) % mod;
        }

    }
}

