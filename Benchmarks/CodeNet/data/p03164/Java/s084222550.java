import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Collection;
import java.util.Scanner;
import java.util.Comparator;
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
                int w = in.nextInt();
                int v = in.nextInt();
                int c = list.size();
                for (int j = 0; j < c; j++)
                {
                    int w_j = list.get(j).w;
                    int v_j = list.get(j).v;
                    if (w + w_j <= W)
                        list.add(new Pair(w + w_j, v_j + v));
                }
                list.add(new Pair(w, v));
                list.sort(Comparator.comparingInt(o -> o.v));

                int w_next = list.get(list.size() - 1).w;
                int v_next = list.get(list.size() - 1).v;
                for (int j = list.size() - 2; j >= 0; j--)
                {
                    int w_previous = list.get(j).w;
                    int v_previous = list.get(j).v;

                    if (w_previous > w_next) list.get(j).w = -1;
                    if (w_previous == w_next && v_previous <= v_next) list.get(j).w = -1;
                    if (w_next > w_previous && v_previous == v_next) list.get(j + 1).w = -1;

                    w_next = w_previous;
                    v_next = v_previous;
                }
                list.removeIf(pair -> pair.w == -1);
            }
            out.print(list.get(list.size() - 1).v);

        }

    }

    static class Pair
    {
        int w;
        int v;

        Pair(int w, int v)
        {
            this.w = w;
            this.v = v;
        }

    }
}

