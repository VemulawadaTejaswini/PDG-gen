import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class Main {
    public void solve(BufferedReader stdin, PrintWriter stdout) throws NumberFormatException, IOException {
        Pattern space = Pattern.compile(" ");
        int n = Integer.parseInt(stdin.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n - 1; i++) {
            int[] line = space.splitAsStream(stdin.readLine()).mapToInt(Integer::parseInt).toArray();
            a[i] = line[0] - 1;
            b[i] = line[1] - 1;
        }

        int[][] colors = new int[n][n];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) stack.addLast(i);
        while (!stack.isEmpty()) {
            int current = stack.removeLast();
            List<Integer> nexts = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                if (a[i] == current) nexts.add(b[i]);
                if (b[i] == current) nexts.add(a[i]);
            }

            Set<Integer> used1  = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (colors[current][i] != 0) {
                    used1.add(colors[current][i]);
                }
            }

            for (int next : nexts) {
                if (colors[current][next] != 0) {
                    continue;
                }

                Set<Integer> used2  = new HashSet<>();
                for (int i = 0; i < n; i++) {
                    if (colors[next][i] != 0) {
                        used1.add(colors[next][i]);
                    }
                }

                int color = 1;
                while (used1.contains(color) || used2.contains(color)) {
                    color++;
                }

                colors[current][next] = color;
                colors[next][current] = color;
                used1.add(color);
                stack.addLast(next);
            }
        }

        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            max = Math.max(max, colors[a[i]][b[i]]);
        }

        stdout.println(max);
        for (int i = 0; i < n - 1; i++) {
            stdout.println(colors[a[i]][b[i]]);
        }
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out, false);
        new Main().solve(stdin, stdout);
        stdout.flush();
    }
}
