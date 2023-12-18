import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    int k;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        k = sc.nextInt();
        solve();
    }

    void solve() {
        List<Long> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add((long)i);
        }
        for (int i = 1; i < 15; i++) {
            if (i < 3) {
                for (int k = 1; k < 10; k++) {
                    long digit = pow(10L, i);
                    list.add((k + 1) * digit - 1);
                }
            } else {
                int j = 1;
                for (; j <= i - 2; j++) {
                    for (int k = 0; k < 10; k++) {
                        long digit = pow(10L, i - 1);
                        long temp = (k + 1) * digit - 1;
                        long val = j * pow(10L, i) + temp;
                        if (val < 1000000000000000L) {
                            list.add(val);
                        }
                    }
                }
                for (int k = j; k < 10; k++) {
                    long digit = pow(10L, i);
                    list.add((k + 1) * digit - 1);
                }
            }
        }
        list.add(1000000000000000L);
        for (int i = 0; i < k; i++) {
            System.out.println(list.get(i));
        }

        /*
        double[] snukes = new double[100000001];
        for (int i = 1; i <= 100000000; i++) {
            snukes[i] = snuke(i);
            //System.out.println(i + ": " + snuke(i));
        }
        for (int i = 1; i <= 100000000; i++) {
            boolean flag = true;
            for (int j = i + 1; j <= 100000000; j++) {
                if (snukes[j] < snukes[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i + ": " + snukes[i]);
            }
        }
        */
    }

    long pow(long x, int n) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = ans * x;
            }
            x = x * x;
            n >>= 1;
        }
        return ans;
    }

    int sumDigit(int a) {
        int ret = 0;
        while (a > 0) {
            ret += a % 10;
            a /= 10;
        }
        return ret;
    }

    double snuke(int a) {
        int sum = sumDigit(a);
        return (double)a / sum;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
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

        String nextLine() {
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
