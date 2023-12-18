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

        List<Set<Integer>> used = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            used.add(new HashSet<>());
        }

        int[][] colors = new int[n][n];
        Deque<Integer> stack = new ArrayDeque<>();
        stack.add(0);
        while (!stack.isEmpty()) {
            int current = stack.removeLast();
            List<Integer> nexts = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                if (a[i] == current) nexts.add(b[i]);
                if (b[i] == current) nexts.add(a[i]);
            }

            for (int next : nexts) {
                if (colors[current][next] != 0) {
                    continue;
                }

                int color = 1;
                while (used.get(current).contains(color) || used.get(next).contains(color)) {
                    color++;
                }

                colors[current][next] = color;
                colors[next][current] = color;
                used.get(current).add(color);
                used.get(next).add(color);
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
