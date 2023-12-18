import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

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
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            int W = in.nextInt();
            List<Pair> list = new ArrayList<>();
            for (int i = 0; i < N; i++)
            {
                list.add(new Pair(in.nextInt(), in.nextInt()));
            }
            Map<Key, Long> memo = new HashMap<>();
            out.print(sol(W, 0, list, memo, N));
        }

        private long sol(int W, long w, List<Pair> list, Map<Key, Long> memo, int N)
        {
            if (list.isEmpty()) return 0;
            long maxValue = 0;
            long weight = w;

            if (memo.containsKey(new Key(N - list.size(), W - w)))
                return memo.get(new Key(N - list.size(), W - w));

            for (int i = 0; i < list.size(); i++)
            {
                Pair p = list.remove(i);
                if (w + p.w <= W)
                {
                    List<Pair> l = new ArrayList<>(list);
                    long localValue = p.v + sol(W, w + p.w, l, memo, N);
                    if (localValue > maxValue)
                    {
                        maxValue = localValue;
                        weight = w + p.w;
                    }
                }
                list.add(i, p);
            }
            memo.put(new Key(N - list.size(), W - weight), maxValue);
            return maxValue;
        }

    }

    static class Pair
    {
        long w;
        long v;

        Pair(long w, long v)
        {
            this.w = w;
            this.v = v;
        }

    }

    static class Key
    {
        long n;
        long w;

        Key(long n, long w)
        {
            this.n = n;
            this.w = w;
        }

        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return n == key.n &&
                           w == key.w;
        }

        public int hashCode()
        {
            return Objects.hash(n, w);
        }

    }
}

