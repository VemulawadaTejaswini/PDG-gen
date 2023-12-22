import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    //Solution by Sathvik Kuthuru
    public static void main(String[] args) {
        FastReader scan = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        Task solver = new Task();
        int t = 1;
        for(int tt = 1; tt <= t; tt++) solver.solve(tt, scan, out);
        out.close();
    }

    static class Task {
        int n;
        ArrayList<Integer>[] adj;
        int[] a, ans;
        TreeSet<Integer> curr = new TreeSet<>();

        public void solve(int testNumber, FastReader scan, PrintWriter out) {
            n = scan.nextInt();
            a = new int[n];
            ans = new int[n];
            adj = new ArrayList[n];
            for(int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                adj[i] = new ArrayList<>();
            }
            for(int i = 0; i < n - 1; i++) {
                int a = scan.nextInt() - 1, b = scan.nextInt() - 1;
                adj[a].add(b);
                adj[b].add(a);
            }
            curr.add(a[0]);
            go(0, -1);
            for(int i : ans) out.println(i);
        }

        void go(int at, int p) {
            ans[at] = curr.size();
            for(int i : adj[at]) {
                if(i != p) {
                    Integer next = curr.ceiling(a[i]);
                    if(next != null) {
                        curr.remove(next);
                        curr.add(a[i]);
                        go(i, at);
                        curr.remove(a[i]);
                        curr.add(next);
                    }
                    else {
                        curr.add(a[i]);
                        go(i, at);
                        curr.remove(a[i]);
                    }
                }
            }
        }
    }

    static void shuffle(int[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    static void shuffle(long[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            long temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}