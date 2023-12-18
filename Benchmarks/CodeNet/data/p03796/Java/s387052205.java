import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    final static int INF = 1000000007;

    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            int N = Integer.parseInt(s);

            int power = 1;

            for (int i = 1; i <= N; i++) {
                power = modmulti(power, i);
            }

            System.out.println(power);
        }
    }

    // aとbを掛けた値をmodする(a * b mod p)
    static int modmulti(int a, int b)
    {
        int res = 0;
        int mod = a % INF;
        while (b > 0)
        {
            if ((b & 1) == 1)
            {
                res += mod;
                if (res > INF)
                {
                    res -= INF;
                }
            }
            mod <<= 1;
            if (mod > INF)
            {
                mod -= INF;
            }
            b >>= 1;
        }
        return res;
    }
}
