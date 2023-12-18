import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a > b) {
                long temp = a;
                a = b;
                b = temp;
            }
            long sol = a - 1;
            long lo = 0;
            long hi = b - 1;
            while (lo < hi - 1) {
                long mi = (lo + hi + 1) / 2;
                long low = 0;
                long high = mi - 1;
                while (low < high - 1) {
                    long mid = (low + high) / 2;
                    if ((mi - mid) * (a + 1 + mid) >
                            (mi - (mid + 1)) * (a + 2 + mid)) {
                        high = mid;
                    } else {
                        low = mid;
                    }
                }
                if ((mi - low) * (a + 1 + low) < a * b) {
                    lo = mi;
                } else {
                    hi = mi;
                }
            }
            System.out.println(sol + lo);
        }
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
