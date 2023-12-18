import java.io.*;
import java.util.*;

public class Main {
    class Pair implements Comparable<Pair> {
        int a, b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Pair o) {
            return this.a - o.a;
        }
    }

    List<Integer>[] g;

    void solve() throws IOException {
        int n = readInt();
        int m = readInt();
        g = new List[n];
        int from;
        int to;
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            from = readInt() - 1;
            to = readInt() - 1;
            g[from].add(to);
            g[to].add(from);
        }
        used = new int[n];
        ArrayList<Integer> second_graph[] = new ArrayList[n];
        for (int i =0;i<n;i++){
            second_graph[i]=new ArrayList<>();
            for (int j : g[i]){
                second_graph[i].add(j);
            }
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            from = i;
            for (int t : second_graph[from]) {
                g[t].remove(g[t].indexOf(from));
                g[from].remove(g[from].indexOf(t));
                Arrays.fill(used, -1);
                dfs(from, 0);
                dfs(t, 1);
                int flag=0;
                for (int j : used) {
                    if (j < 0) {
                        flag++;
                    }
                }
                if(flag==0) answer++;
                g[from].add(t);
                g[t].add(from);
            }
        }
        out.print(answer/2);
    }


    int[] used;

    void dfs(int from, int color) {
        used[from] = color;
        for (int i : g[from]) {
            if (used[i] != -1 && used[i] != color) {
                used[i] = -123213;
                return;
            } else {
                if (used[i] == color) continue;
                dfs(i, color);
            }
        }
    }

    class SegmentTree {
        int[] t;

        SegmentTree(int[] a, int n) {
            t = new int[4 * n];
            build(a, 1, 1, n);
        }

        void build(int[] a, int v, int tl, int tr) {
            if (tl == tr) {
                t[v] = a[tl];
                return;
            }

            int tm = (tl + tr) / 2;
            build(a, 2 * v, tl, tm);
            build(a, 2 * v + 1, tm + 1, tr);
            t[v] = Math.min(t[2 * v], t[2 * v + 1]);
        }

        void update(int v, int tl, int tr, int pos, int value) {
            if (tl == tr) {
                t[v] = value;
                return;
            }
            int tm = (tl + tr) / 2;
            if (pos <= tm) {
                update(2 * v, tl, tm, pos, value);
            } else {
                update(2 * v + 1, tm + 1, tr, pos, value);
            }

            t[v] = Math.min(t[2 * v], t[2 * v + 1]);
        }

        int getMin(int v, int tl, int tr, int l, int r) {
            if (l > r) {
                return INF;
            }
            if (tl == l && tr == r) {
                return t[v];
            }

            int tm = (tl + tr) / 2;

            int min1 = getMin(2 * v, tl, tm, l, Math.min(tm, r));
            int min2 = getMin(2 * v + 1, tm + 1, tr, Math.max(l, tm + 1), r);

            return Math.min(min1, min2);
        }
    }

    int checkBit(int mask, int bit) {
        return (mask >> bit) & 1;
    }

    public static void main(String[] args) throws IOException {

        new Main().run();
    }

    boolean isLower(char a) {
        return ((int) a) >= 97 ? true : false;
    }

    int INF = Integer.MAX_VALUE / 10;

    int[][] STEPS = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok;
    Random rnd = new Random();
    static final boolean ONLINE_JUDGE = System.getProperty("ONLINE_JUDGE") != null;

    Main() throws FileNotFoundException {

        try {
            in = new BufferedReader(new FileReader("input.txt"));
            out = new PrintWriter("output.txt");
        } catch (Exception e) {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        }

        tok = new StringTokenizer("");
    }

    long checkBit(long mask, int bit) {
        return (mask >> bit) & 1;
    }

    void run() throws IOException {
        solve();
        out.close();
    }

    char varChar;
    int varInt, varInt1, varInt2;
    long varLong;

    void swapInt(int a, int b) {
        varInt = a;
        a = b;
        b = varInt;
    }

    void swapChar(char a, char b) {
        varChar = a;
        a = b;
        b = varChar;
    }

    void swapLong(long a, long b) {
        varLong = a;
        a = b;
        b = varLong;
    }

    void reverseCharArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) swapChar(arr[i], arr[arr.length - i - 1]);
    }

    int sqrt(double m) {
        varInt1 = 0;
        varInt2 = Integer.MAX_VALUE;
        int i = 1000;
        while (varInt2 >= varInt2) {
            i = (varInt2 + varInt1) / 2;
            if ((long) i * i > m) {
                varInt2 = i - 1;
            } else {
                varInt1 = i + 1;
                varInt = varInt1 - 1;
            }
        }
        return varInt;
    }

    int countPow(int m, int n) {
        varInt = 0;
        while (m % n == 0 && m > 0) {
            varInt++;
            m /= n;
        }
        return varInt;
    }

    long binPow(long a, long b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 1) {
            return a * binPow(a, b - 1);
        } else {
            varLong = binPow(a, b / 2);
            return varLong * varLong;
        }

    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    long pow(long x, long k) {
        varLong = 1;
        for (int i = 0; i < k; ++i) {
            varLong *= x;
        }
        return varLong;
    }

    class Fenwik {
        private long[] t;
        private int length;

        Fenwik(int[] a) {
            this.length = a.length + 100;
            this.t = new long[length];
            for (int i = 0; i < a.length; ++i) {
                this.inc(i, a[i]);
            }
        }

        void inc(int i, int delta) {
            for (; i < this.length; i = i | (i + 1)) {
                this.t[i] += delta;
            }
        }

        long getSum(int r) {
            long sum = 0;

            for (; r >= 0; r = (r & (r + 1)) - 1) {
                sum += this.t[r];
            }

            return sum;
        }

    }

    // ////////////////////////////////////////////////////////////////////

    String delimiter = " ";

    String readLine() throws IOException {
        return in.readLine();
    }

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            String nextLine = readLine();
            if (null == nextLine)
                return null;

            tok = new StringTokenizer(nextLine);
        }

        return tok.nextToken(delimiter);
    }

    int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    int[] readIntArray(int b) {
        int a[] = new int[b];
        for (int i = 0; i < b; i++) {
            try {
                a[i] = readInt();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return a;
    }

    int[] readSortedIntArray(int size) throws IOException {
        Integer[] array = new Integer[size];

        for (int index = 0; index < size; ++index) {
            array[index] = readInt();
        }
        Arrays.sort(array);

        int[] sortedArray = new int[size];
        for (int index = 0; index < size; ++index) {
            sortedArray[index] = array[index];
        }

        return sortedArray;
    }

    int[] sortedIntArray(int size, int[] array) throws IOException {
        for (int index = 0; index < size; ++index) {
            array[index] = readInt();
        }
        Arrays.sort(array);

        int[] sortedArray = new int[size];
        for (int index = 0; index < size; ++index) {
            sortedArray[index] = array[index];
        }

        return sortedArray;
    }

    int minInt(int... values) {
        int min = Integer.MAX_VALUE;
        for (int value : values) {
            min = Math.min(min, value);
        }
        return min;
    }

    int maxInt(int... values) {
        int max = Integer.MIN_VALUE;
        for (int value : values) {
            max = Math.max(max, value);
        }
        return max;
    }

    long minLong(long... values) {
        long min = Long.MAX_VALUE;
        for (long value : values) {
            min = Math.min(min, value);
        }
        return min;
    }

    long maxLong(long... values) {
        long max = Long.MIN_VALUE;
        for (long value : values) {
            max = Math.max(max, value);
        }
        return max;
    }

    boolean checkIndex(int index, int size) {
        return (0 <= index && index < size);
    }

    int abs(int a) {
        return Math.abs(a);
    }
}