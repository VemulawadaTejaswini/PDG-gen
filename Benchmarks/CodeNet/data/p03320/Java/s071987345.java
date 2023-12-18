import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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
        List<Double> check = new ArrayList<>();
        for (int i = 15; i > 3; i--) {
            for (int j = 0; j < 1000; j++) {
                long a = pow(10L, i) - 1 - j * pow(10L, i - 3);
                double snuke = snuke(a);
                boolean flag = true;
                for (int k = 0; k < check.size(); k++) {
                    if (check.get(k) < snuke) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    list.add(a);
                }
                check.add(snuke);
            }
        }
        /*
        for (int i = 0; i < snukes.size(); i++) {
            System.out.println(snukes.get(i));
        }
        */
        //List<Long> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add((long)i);
        }
        for (int i = 1; i < 6; i++) {
            if (i < 3) {
                for (int k = 1; k < 10; k++) {
                    long digit = pow(10L, i);
                    list.add((k + 1) * digit - 1);
                }
            } else{
                int j = 1;
                for (; j < i - 2; j++) {
                    if (j < 10) {
                        for (int k = 0; k < 10; k++) {
                            long digit = pow(10L, i - 1);
                            long temp = (k + 1) * digit - 1;
                            long val = j * pow(10L, i) + temp;
                            if (val < 1000000000000000L && val > list.get(list.size() - 1)) {
                                list.add(val);
                            }
                        }
                    } else {
                        for (int k = 0; k < 100; k++) {
                            long digit = pow(10L, i - 1);
                            long temp = (k + 1) * digit - 1;
                            long val = j * pow(10L, i) + temp;
                            if (val < 1000000000000000L && val > list.get(list.size() - 1)) {
                                list.add(val);
                            }
                        }
                    }
                }
                for (int k = j; k < 10; k++) {
                    long digit = pow(10L, i);
                    long val = (k + 1) * digit - 1;
                    if (val > list.get(list.size() - 1)) {
                        list.add(val);
                    }
                }
            }
        }
        list.add(1000000000000000L);
        Set<Long> set = new HashSet<>();
        set.addAll(list);
        list = new ArrayList<>();
        list.addAll(set);
        Collections.sort(list);
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

    int sumDigit(long a) {
        int ret = 0;
        while (a > 0) {
            ret += a % 10;
            a /= 10;
        }
        return ret;
    }

    double snuke(long a) {
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
