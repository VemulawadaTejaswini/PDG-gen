import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        long [] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        long total = ((long) n * (n + 1)) / 2;
        long lo = 0; long hi = (long) 1e9 + 6; int ct = 0;
        while (lo < hi) {
            long mid = (lo + hi) / 2;
            if (lo == mid) ct++;
            if (ct == 2) break;
            // count how many (i, j) exist such that their medians are greater than or equal to mid
            long [] b = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                b[i] = b[i - 1] + (a[i - 1] >= mid ? 1 : -1);
            }
            ArrayList<Pair> p = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                p.add(new Pair(b[i], i + 1));
            }
            Collections.sort(p);
            FenwickTree bit = new FenwickTree(n + 3);
            long res = 0;
            for (int i = 0; i < p.size(); i++) {
                Pair next = p.get(i);
                int index = next.index;
                res += bit.sum(index);
                bit.update(index, 1);
            }
            res = ((long) n * (n + 1)) / 2 - res;
            if (res >= (total + 1) / 2) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        long [] b = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            b[i] = b[i - 1] + (a[i - 1] >= hi ? 1 : -1);
        }
        ArrayList<Pair> p = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            p.add(new Pair(b[i], i + 1));
        }
        Collections.sort(p);
        FenwickTree bit = new FenwickTree(n + 3);
        long res = 0;
        for (int i = 0; i < p.size(); i++) {
            Pair next = p.get(i);
            int index = next.index;
            res += bit.sum(index);
            bit.update(index, 1);
        }
        res = ((long) n * (n + 1)) / 2 - res;
        if (res >= (total + 1) / 2) {
            lo = hi;
        }
        out.println(lo);
        out.close();
    }

    static class Pair implements Comparable<Pair> {
        long val; int index;
        Pair(long val, int index) {
            this.val = val; this.index = index;
        }
        public int compareTo(Pair o) {
            if (val == o.val) return -Integer.compare(index, o.index);
            else return -Long.compare(val, o.val);
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