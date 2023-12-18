import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Integer.min;
import static java.lang.Math.abs;

public class Main
{
    public static void main(String[] args)
    {
        ABC075B s = new ABC075B();
        s.read();
        s.solve();
    }
}

class ABC075B
{
    int N, K;
    int[] x = new int[200];

    void read()
    {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        K = in.nextInt();

        for (int i = 0; i < N; i++)
            x[i] = in.nextInt();
    }

    void solve()
    {
        int sum = 0;
        for (int i = 0; i < N; i++)
        {
            int m = abs(x[i]);
            int n = abs(x[i] - K);
            sum += 2 * min(m, n);
        }
        System.out.println(sum);
    }
}