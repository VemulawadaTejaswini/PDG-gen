import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

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
            Map<Integer, Integer> map = new HashMap<>(10_000);
            for (int i = 0; i < N; i++)
            {
                int w = in.nextInt();
                int v = in.nextInt();
                Map<Integer, Integer> localMap = new HashMap<>(map.size() + 1);
                localMap.put(w, v);
                for (int key : map.keySet())
                {
                    localMap.put(key + w, v + map.get(key));
                }
                map.putAll(localMap);
            }
            int max = 0;
            for (int key : map.keySet())
            {
                if (key <= W) max = Math.max(max, map.get(key));
            }
            out.print(max);
        }

    }
}

