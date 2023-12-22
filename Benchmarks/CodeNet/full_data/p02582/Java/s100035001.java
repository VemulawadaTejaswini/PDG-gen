import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author:26019
 */
public class Main {


    public static void main(String[] args) throws Exception {
        solve();
    }

    private static void solve() throws Exception {
        //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("C:\\Users\\26019\\Downloads\\out.txt"))));
        FastScanner cin = new FastScanner();
//        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        int max = 0, cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                cnt++;
            } else {
                max = Math.max(cnt, max);
                cnt = 0;
            }
        }
        System.out.println(Math.max(max, cnt));
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\26019\\Downloads\\P1190_9.in"))));
        StringTokenizer st = new StringTokenizer("");

        FastScanner() throws FileNotFoundException {
        }

        public String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public String nextLine() { // 读取带空格的字符串
            String res = null;
            try {
                res = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}

