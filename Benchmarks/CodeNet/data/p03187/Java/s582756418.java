import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
        int l, n;
        long ans = 0;

        void solve(InputReader in, PrintWriter out) {
            l = in.nextInt(); n = in.nextInt();

            List<Tree> trees = new ArrayList<>(n + 1);
            trees.add(new Tree(0, false));
            for (int i = 0; i < n; i++) {
                if (i == n - 1) {
                    Tree t = new Tree(in.nextInt(), true);
                    trees.add(t);
                    trees.get(i).linkTo(t);
                    trees.get(i + 1).linkTo(trees.get(0));
                } else {
                    Tree t = new Tree(in.nextInt(), false);
                    trees.add(t);
                    trees.get(i).linkTo(t);
                }
            }

            Tree cur = trees.get(0);
            while (cur != null) {
                out.println("Tree " + cur.loc + " is burning.");
                cur = cur.catchFire();
                out.println("Footstep: " + ans);
            }

            out.println(ans);
        }

        class Tree {
            Tree prev, next;
            int pcost, ncost;
            int loc;
            boolean last;

            Tree(int loc, boolean last) {
                this.loc = loc;
                this.last = last;
            }

            void linkTo(Tree next) {
                this.next = next;
                next.prev = this;
                int d = Math.abs(next.loc - this.loc);
                if (this.last) d = l - d;
                this.ncost = d;
                next.pcost = d;
            }

            Tree catchFire() {
                Tree ret;
                if (this.equals(prev) || this.equals(next)) {
                    return null;
                } else if (pcost < ncost) {
                    ans += (long)ncost;
                    ret = next;
                } else {
                    ans += (long)pcost;
                    ret = prev;
                }

                if (this.last) prev.last = true;
                prev.linkTo(next);

                return ret;
            }
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
    }
}