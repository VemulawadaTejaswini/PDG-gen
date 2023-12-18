import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastReader scan = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        Task solver = new Task();
        int t = 1;
        while (t --> 0) solver.solve(1, scan, out);
        out.close();
    }

    static class Task {
        static int n, currCompress = 0;
        static long d, a;
        static TreeMap<Long, Integer> monster = new TreeMap<>();
        static HashMap<Long, Integer> compress = new HashMap<>();
        static HashMap<Integer, Long> decompress = new HashMap<>();
        static long[] val;

        public void solve(int testNumber, FastReader scan, PrintWriter out) {
            int n = scan.nextInt();
            long d = scan.nextInt(), a = scan.nextLong();
            long ans = 0;
            val = new long[n];
            for(int i = 0; i < n; i++) {
                monster.put(scan.nextLong(), scan.nextInt());
            }
            for(long i : monster.keySet()) {
                compress.put(i, currCompress);
                decompress.put(currCompress, i);
                currCompress++;
            }
            for(int i = 0; i < n; i++) {
                val[i] += monster.get(decompress.get(i));
                if(i < n - 1) val[i+1] -= monster.get(decompress.get(i));
            }
            long sum = 0;
            for(int i = 0; i < n; i++) {
                sum += val[i];
                if(sum > 0) {
                    long next = monster.floorKey(decompress.get(i) + d*2);
                    long curr = sum / a + Math.min(1, sum%a);
                    ans += curr;
                    int nextCompressed = compress.get(next);
                    sum -= curr * a;
                    if(nextCompressed < n - 1) val[nextCompressed+1] += curr * a;
                }
            }
            out.println(ans);
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