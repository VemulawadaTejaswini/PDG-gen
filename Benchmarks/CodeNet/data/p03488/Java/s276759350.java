import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        static int MAX = 100000;
        Queue<Character> s = new ArrayDeque<>();
        int sx, sy;
        int gx, gy;
        List<Integer> hSteps = new ArrayList<>();
        List<Integer> vSteps = new ArrayList<>();
        int hMax = 0;
        int vMax = 0;

        void solve(InputReader in, PrintWriter out) {
            for (char c : in.next().toCharArray()) {
                s.add(c);
            }

            sx = 0; sy = 0;
            gx = in.nextInt();
            gy = in.nextInt();

            while (!s.isEmpty()) {
                char head = s.poll();
                if (head == 'F') {
                    sx++;
                } else {
                    break;
                }
            }

            {
                boolean vert = true;
                int step = 0;
                while (!s.isEmpty()) {
                    char head = s.poll();
                    if (head == 'F') step++;
                    if (head == 'T' || (head == 'F' && s.isEmpty())) {
                        if (vert) {
                            vSteps.add(step);
                        } else {
                            hSteps.add(step);
                        }
                        vert = !vert;
                        step = 0;
                    }
                }
            }

            for (int i : hSteps) hMax += i;
            for (int i : vSteps) vMax += i;

            sx += hMax; sy += vMax;
            gx += hMax; gy += vMax;
            boolean[][] dpH = new boolean[hSteps.size() + 1][MAX];
            boolean[][] dpV = new boolean[vSteps.size() + 1][MAX];
            dpH[0][sx] = true;
            dpV[0][sy] = true;

            for (int i = 1; i <= hSteps.size(); ++i) {
                int step = hSteps.get(i - 1);
                for (int j = 0; j <= hMax*2; ++j) {
                    if (dpH[i - 1][j]) {
                        if (step <= j) dpH[i][j - step] = true;
                        if (j + step < MAX) dpH[i][j + step] = true;
                    }
                }
            }

            for (int i = 1; i <= vSteps.size(); ++i) {
                int step = vSteps.get(i - 1);
                for (int j = 0; j <= vMax*2; ++j) {
                    if (dpV[i - 1][j]) {
                        if (step <= j) dpV[i][j - step] = true;
                        if (j + step < MAX) dpV[i][j + step] = true;
                    }
                }
            }

            out.println(dpH[hSteps.size()][gx] && dpV[vSteps.size()][gy] ? "Yes" : "No");
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int size) {
            long[] arr = new long[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}