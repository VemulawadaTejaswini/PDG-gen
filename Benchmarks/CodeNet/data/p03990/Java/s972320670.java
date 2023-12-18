import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            TaskE.Vertex[] vs = new TaskE.Vertex[n];
            for (int i = 0; i < n; ++i) vs[i] = new TaskE.Vertex();
            TaskE.Vertex us = vs[in.nextInt() - 1];
            TaskE.Vertex root = vs[in.nextInt() - 1];
            for (int i = 0; i < n - 1; ++i) {
                TaskE.Vertex a = vs[in.nextInt() - 1];
                TaskE.Vertex b = vs[in.nextInt() - 1];
                a.adjUs.add(b);
                b.adjUs.add(a);
            }
            for (int i = 0; i < n - 1; ++i) {
                TaskE.Vertex a = vs[in.nextInt() - 1];
                TaskE.Vertex b = vs[in.nextInt() - 1];
                a.adjThey.add(b);
                b.adjThey.add(a);
            }
            root.fillWhenThey(0);
            us.fillWhenUs(0);

            int res = 0;
            for (TaskE.Vertex v : vs)
                if (v.whenUs >= 0) {
                    boolean golden = false;
                    for (TaskE.Vertex u : v.adjUs) {
                        golden = true;
                        if (v == u.parentThey) golden = false;
                        if (u == v.parentThey) golden = false;
                        if (u.parentThey != null && v == u.parentThey.parentThey) golden = false;
                        if (v.parentThey != null && u == v.parentThey.parentThey) golden = false;
                        if (u.parentThey != null && u.parentThey == v.parentThey) golden = false;
                        if (golden) break;
                    }
                    if (golden) {
                        out.println(-1);
                        return;
                    } else {
                        res = Math.max(res, 2 * v.whenThey);
                    }
                }
            out.println(res);
        }

        static class Vertex {
            int whenThey = -1;
            int whenUs = -1;
            List<TaskE.Vertex> adjUs = new ArrayList<>(1);
            List<TaskE.Vertex> adjThey = new ArrayList<>(1);
            TaskE.Vertex parentThey;

            public void fillWhenThey(int val) {
                whenThey = val;
                for (TaskE.Vertex v : adjThey)
                    if (v.whenThey < 0) v.fillWhenThey(val + 1);
                    else parentThey = v;
            }

            public void fillWhenUs(int val) {
                if (val >= whenThey) return;
                whenUs = val;
                for (TaskE.Vertex v : adjUs) if (v.whenUs < 0) v.fillWhenUs(val + 1);
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

