import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ESecondSum solver = new ESecondSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESecondSum {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            CustomAVL s = new CustomAVL();
            CustomAVL t = new CustomAVL();
            s.insertElement(0);
            s.insertElement(0);
            t.insertElement(n + 1);
            t.insertElement(n + 1);
            for (int i = 0; i < n; i++) {
                a.add(in.nextInt());
                map.put(a.get(i), i + 1);
            }
            long ans = 0;
            long count = 0;
            for (int i = n; i > 0; i--) {
                count = 0;
                int temp = map.get(i);
                s.insertElement(temp);
                t.insertElement(temp);
                int r = s.getRank(temp);
//            out.println(temp);
//            out.println(r);
                long xi = s.getKthSmallest(r - 1);
                long wi = s.getKthSmallest(r - 2);
                r = t.getRank(temp);
                long yi = t.getKthSmallest(r + 1);
                long zi = t.getKthSmallest(r + 2);
                if (xi - wi > 0 && yi - temp > 0) count += (xi - wi) * (yi - temp);
                if (temp - xi > 0 && zi - yi > 0) count += (temp - xi) * (zi - yi);
//            out.println(wi + " " + xi);
//            out.println(zi + " " + yi);
                ans += count * i;
            }
            out.println(ans);
        }

    }

    static class CustomAVL {
        node root;

        CustomAVL() {
            this.root = null;
        }

        public int height(node temp) {
            if (temp == null) {
                return 0;
            } else {
                return temp.height;
            }
        }

        public int getBalance(node temp) {
            if (temp == null) {
                return 0;
            } else {
                return height(temp.left) - height(temp.right);
            }
        }

        public int max(int a, int b) {
            return (a > b) ? a : b;
        }

        public node rightrotate(node y) {
            node x = y.left;
            node T2 = x.right;
            y.lsum = y.lsum - x.lsum;
            y.lcount = y.lcount - x.lcount;
            x.rsum = x.rsum + y.rsum;
            x.rcount = x.rcount + y.rcount;
            x.right = y;
            y.left = T2;
            y.height = max(height(y.left), height(y.right)) + 1;
            x.height = max(height(x.left), height(x.right)) + 1;

            return x;

        }

        public node leftrotate(node x) {
            node y = x.right;
            node T2 = y.left;
            y.lsum = y.lsum + x.lsum;
            y.lcount = y.lcount + x.lcount;
            x.rsum = x.rsum - y.rsum;
            x.rcount = x.rcount - y.rcount;
            y.left = x;
            x.right = T2;
            x.height = max(height(x.left), height(x.right)) + 1;
            y.height = max(height(y.left), height(y.right)) + 1;
            return y;
        }

        public node insert(node root, long value) {
            if (root == null) {
                return new node(value);
            }
            if (value <= root.value) {
                root.lcount = root.lcount + 1;
                root.lsum = root.lsum + value;
                root.left = insert(root.left, value);
            } else {
                root.rsum = root.rsum + value;
                root.rcount = root.rcount + 1;
                root.right = insert(root.right, value);

            }
            root.height = 1 + max(height(root.left), height(root.right));
            int balance = getBalance(root);

            //ll
            if (balance > 1 && value <= root.left.value) {
                return rightrotate(root);
            }
            //rr
            if (balance < -1 && value > root.right.value) {
                return leftrotate(root);
            }
            //lr
            if (balance > 1 && value >= root.left.value) {
                root.left = leftrotate(root.left);
                return rightrotate(root);
            }
            //rl
            if (balance < -1 && value < root.right.value) {
                root.right = rightrotate(root.right);
                return leftrotate(root);
            }
            return root;
        }

        public void insertElement(long value) {
            this.root = insert(root, value);
        }

        public long getKthSmallest(int k) {
            node temp = root;

            while (temp != null) {
                if (temp.lcount == k) {
                    return temp.value;
                }
                if (temp.lcount > k) {
                    temp = temp.left;
                    continue;
                }
                if (temp.lcount < k) {
                    k = k - temp.lcount;
                    temp = temp.right;
                }
            }
            return -1;
        }

        public int getRank(long element) {
            node temp = root;
            int rank = 0;
            while (temp != null) {
                if (temp.value == element) {
                    rank += temp.lcount;
                    return rank;
                }
                if (temp.value > element) {
                    temp = temp.left;
                    continue;
                } else {
                    rank += temp.lcount;
                    temp = temp.right;
                    continue;
                }

            }
            return -1;
        }

        class node {
            long value;
            int lcount;
            long lsum;
            long rsum;
            int rcount;
            int height;
            node left;
            node right;

            node(long value) {
                this.value = value;
                this.lcount = 1;
                this.lsum = this.value;
                this.left = null;
                this.right = null;
                this.height = 1;
                this.rsum = this.value;
                this.rcount = 1;
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

