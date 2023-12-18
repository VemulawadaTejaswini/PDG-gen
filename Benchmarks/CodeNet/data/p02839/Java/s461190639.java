import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Main {
    public void solve(Stdin stdin, PrintWriter stdout) throws NumberFormatException, IOException {
        int h = stdin.nextInt();
        int w = stdin.nextInt();
        int[][] a = new int[h][w];
        int[][] b = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = stdin.nextInt();
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                b[i][j] = stdin.nextInt();
            }
        }

        Set<Tuple> visited = new HashSet<>();
        Deque<Tuple> stack = new ArrayDeque<>();
        stack.addLast(new Tuple(0, 0, Math.abs(a[0][0] - b[0][0])));
        while (!stack.isEmpty()) {
            Tuple current = stack.removeLast();
            int x = current.x;
            int y = current.y;
            int z = current.z;

            if (x == h - 1 && y == w) stdout.println(z);
            if (x == h && y == w - 1) stdout.println(z);

            if (visited.contains(current)) {
                continue;
            }
            visited.add(current);

            if (x + 1 < h) {
                int d = Math.abs(a[x + 1][y] - b[x + 1][y]);
                stack.addLast(new Tuple(x + 1, y, Math.abs(z + d)));
                stack.addLast(new Tuple(x + 1, y, Math.abs(z - d)));
            }
            if (y + 1 < w) {
                int d = Math.abs(a[x][y + 1] - b[x][y + 1]);
                stack.addLast(new Tuple(x, y + 1, Math.abs(z + d)));
                stack.addLast(new Tuple(x, y + 1, Math.abs(z - d)));
            }
        }
        stdout.println(visited.stream().filter(t -> t.x == h - 1 && t.y == w - 1).mapToInt(t -> t.z).min().getAsInt());
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Stdin stdin = new Stdin();
        PrintWriter stdout = new PrintWriter(System.out, false);
        new Main().solve(stdin, stdout);
        stdout.flush();
    }

    public static class Stdin {
        private Deque<String> queue;
        private BufferedReader stdin;
        private Pattern delimiter;

        public Stdin() {
            queue = new ArrayDeque<>();
            stdin = new BufferedReader(new InputStreamReader(System.in));
            delimiter = Pattern.compile(" ");
        }

        public String next() throws IOException {
            if (queue.isEmpty()) {
                delimiter.splitAsStream(stdin.readLine()).forEach(queue::addLast);
            }
            return queue.removeFirst();
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }
    }

    public static class Tuple {
        private int x;
        private int y;
        private int z;
        public Tuple(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + x;
            result = prime * result + y;
            result = prime * result + z;
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Tuple other = (Tuple) obj;
            if (x != other.x)
                return false;
            if (y != other.y)
                return false;
            if (z != other.z)
                return false;
            return true;
        }
        @Override
        public String toString() {
            return "Tuple [x=" + x + ", y=" + y + ", z=" + z + "]";
        }
    }
}
