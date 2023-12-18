import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public void solve(BufferedReader stdin, PrintWriter stdout) throws NumberFormatException, IOException {
        Pattern space = Pattern.compile(" ");
        int n = Integer.parseInt(stdin.readLine());

        List<Tuple> paths = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int[] line = space.splitAsStream(stdin.readLine()).mapToInt(Integer::parseInt).toArray();
            Tuple path = new Tuple();
            path.a = line[0] - 1;
            path.b = line[1] - 1;
            paths.add(path);
        }

        int[] used = new int[n];
        int[] parent = new int[n];
        int[] colors = new int[n - 1];
        Deque<Integer> queue = new ArrayDeque<>();
        Arrays.fill(parent, -1);
        queue.addLast(0);
        while (!queue.isEmpty()) {
            int current = queue.removeFirst();
            int color = 1;
            for (int i = 0; i < n - 1; i++) {
                Tuple path = paths.get(i);
                int next = -1;
                if (path.a == current) next = path.b;
                if (path.b == current) next = path.a;
                if (next == -1) continue;
                if (parent[current] == next) continue;

                if (used[current] == color) color++;
                colors[i] = color;
                parent[next] = current;
                used[next] = color;
                queue.add(next);
                color++;
            }
        }

        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            max = Math.max(max, colors[i]);
        }

        stdout.println(max);
        for (int i = 0; i < n - 1; i++) {
            stdout.println(colors[i]);
        }
    }

    private static class Tuple {
        private int a;
        private int b;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out, false);
        new Main().solve(stdin, stdout);
        stdout.flush();
    }
}
