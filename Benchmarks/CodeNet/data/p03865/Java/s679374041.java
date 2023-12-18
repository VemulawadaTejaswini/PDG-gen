import java.io.*;
import java.util.*;

public class Main {
    private FastScanner in;
    private PrintWriter out;

    private void solve() throws IOException {
        TreeMap<Integer, Character> map = new TreeMap<>();
        char[] s = in.next().toCharArray();
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < s.length; i++) {
            map.put(i, s[i]);
            if (i != 0 && i != s.length - 1) {
                q.add(i);
            }
        }
        boolean first = false;
        while (!q.isEmpty()) {
            int pos = q.poll();
            Character cur = map.get(pos);
            if (cur != null) {
                Map.Entry<Integer, Character> lower = map.lowerEntry(pos);
                Map.Entry<Integer, Character> upper = map.higherEntry(pos);

                if (lower.getValue() != upper.getValue()) {
                    first = !first;
                    map.remove(pos);
                    if (lower.getKey() != 0) {
                        q.add(lower.getKey());
                    }
                    if (upper.getKey() != s.length - 1) {
                        q.add(upper.getKey());
                    }
                }
            }
        }
        out.println(first ? "First" : "Second");
    }

    private void run() throws IOException {
        in = new FastScanner();
        out = new PrintWriter(System.out, false);
        solve();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        Integer stackSize = null;
//        Integer stackSize = 1 << 27; // 128mb

        if (stackSize != null) {
            new Thread(null, () -> {
                try {
                    new Main().run();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }, "", stackSize).start();
        } else {
            new Main().run();
        }
    }
}

class FastScanner {
    private final BufferedReader br;
    private StringTokenizer st;
    private String last;

    public FastScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public FastScanner(String path) throws IOException {
        br = new BufferedReader(new FileReader(path));
    }

    public FastScanner(String path, String decoder) throws IOException {
        br = new BufferedReader(new InputStreamReader(new FileInputStream(path), decoder));
    }

    String next() throws IOException {
        while (st == null || !st.hasMoreElements())
            st = new StringTokenizer(br.readLine());
        last = null;
        return st.nextToken();
    }

    String nextLine() throws IOException {
        st = null;
        return (last == null) ? br.readLine() : last;
    }

    boolean hasNext() {
        if (st != null && st.hasMoreElements())
            return true;

        try {
            while (st == null || !st.hasMoreElements()) {
                last = br.readLine();
                st = new StringTokenizer(last);
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    String[] nextStrings(int n) throws IOException {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = next();
        return arr;
    }

    String[] nextLines(int n) throws IOException {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = nextLine();
        return arr;
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    int[] nextInts(int n) throws IOException {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = nextInt();
        return arr;
    }

    Integer[] nextIntegers(int n) throws IOException {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = nextInt();
        return arr;
    }

    int[][] next2Ints(int n, int m) throws IOException {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = nextInt();
        return arr;
    }

    long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    long[] nextLongs(int n) throws IOException {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = nextLong();
        return arr;
    }

    long[][] next2Longs(int n, int m) throws IOException {
        long[][] arr = new long[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = nextLong();
        return arr;
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(next().replace(',', '.'));
    }

    double[] nextDoubles(int size) throws IOException {
        double[] arr = new double[size];
        for (int i = 0; i < size; i++)
            arr[i] = nextDouble();
        return arr;
    }

    boolean nextBool() throws IOException {
        String s = next();
        if (s.equalsIgnoreCase("true") || s.equals("1"))
            return true;

        if (s.equalsIgnoreCase("false") || s.equals("0"))
            return false;

        throw new IOException("Boolean expected, String found!");
    }

    public double[][] next2Doubles(int n, int m) throws IOException {
        double[][] arr = new double[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = nextDoubles(m);
        }
        return arr;
    }
}
