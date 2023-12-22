import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.*;
import java.io.*;

public class Main {
    static MathContext mc = new MathContext(15);
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        int [] two = new int[n];
        int [] five = new int[n];
        for (int i = 0; i < n; i++) {
            double d = sc.nextDouble();
            BigDecimal b = BigDecimal.valueOf(d);
            b = b.multiply(BigDecimal.valueOf(1000000000), mc);
            long put = b.longValue();
            int t = 0; int f = 0;
            while (put % 2 == 0) {
                t++;
                put /= 2;
            }
            while (put % 5 == 0) {
                f++;
                put /= 5;
            }
            two[i] = Math.min(19, t);
            five[i] = Math.min(19, f);
        }
        Pair [] a = new Pair[n];
        for (int i = 0; i < n; i++) a[i] = new Pair(two[i], five[i]);
        Arrays.sort(a);
        long ans = 0; int cur = n - 1;
        FenwickTree bit = new FenwickTree(50);
        for (int i = 0; i < n; i++) {
            Pair toDo = a[i];
            int t = toDo.a; int f = toDo.b;
            while (cur >= 0 && a[cur].a >= 18 - t) {
                bit.update(a[cur].b + 1, 1);
                cur--;
            }
            ans = (ans + bit.rangeSum(19 - f,49));
        }
        for (int i = 0; i < n; i++) {
            if (2 * two[i] >= 18 && 2 * five[i] >= 18) ans--;
        }
        out.println(ans / 2);
        out.close();
    }

    static class Pair implements Comparable<Pair> {
        int a; int b;
        Pair(int a, int b) {
            this.a = a; this.b = b;
        }

        @Override
        public int compareTo(Pair o) {
            if (a == o.a) return Integer.compare(b, o.b);
            return Integer.compare(a, o.a);
        }
    }

    static class FenwickTree
    {
        int size;
        int [] table;

        FenwickTree(int size)
        {
            table = new int [size];
            this.size = size;
        }

        void init(int [] nums)
        {
            for (int i = 1; i < nums.length; i++)
            {
                update(i, nums[i]);
            }
        }

        void update(int i, int delta)
        {
            while (i < size)
            {
                table[i] += delta;
                i += Integer.lowestOneBit(i);
            }
        }

        int sum(int i)
        {
            int sum = 0;
            while (i > 0)
            {
                sum += table[i];
                i -= Integer.lowestOneBit(i);
            }
            return sum;
        }

        int rangeSum(int i, int j)
        {
            return sum(j) - sum(i - 1);
        }
    }




    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}