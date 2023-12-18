import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static class Reader {
        private BufferedReader br;
        private StringTokenizer token;

        protected Reader(InputStream obj) {
            br = new BufferedReader(new InputStreamReader(obj));
            token = null;
        }
        protected String next() {
            while (token == null || !token.hasMoreElements()) {
                try {
                    token = new StringTokenizer(br.readLine());
                } catch (IOException e) {e.printStackTrace();}
            }
            return token.nextToken();
        }
        protected int[] nextIntArr(int n) {
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }
        protected int nextInt() {return Integer.parseInt(next());}
    }
    static int[][] arr;
    static String[] c;
    static int n, k;
    private static int check (String s1, String s2) {
        int l_ans = 0, g_ans = Integer.MIN_VALUE;
        for (int i=0; i<k; i++) {
            for (int j=0; j<k; j++) {
                for (int e = 0; e<n; e++) {
                    int x = arr[e][0]+j, y = arr[e][1]+i;
                    if (x>=k && y>=k && c[e].equals(s1)) l_ans++;
                    else if (x<k && y<k && c[e].equals(s1)) l_ans++;
                    else if (x>=k && y<k && c[e].equals(s2)) l_ans++;
                    else if (x<k && y>=k && c[e].equals(s2)) l_ans++;
                }
                if (l_ans>g_ans) g_ans = l_ans;
                l_ans = 0;
            }
        }
        return g_ans;
    }
    public static void main(String[] args) throws IOException {
        Reader in = new Reader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = in.nextInt(); k = in.nextInt();
        arr = new int[n][2];
        c = new String[n];
        for (int i=0; i<n; i++) {
            arr[i][0] = in.nextInt()%(2*k); arr[i][1] = in.nextInt()%(2*k); c[i] = in.next();
        }
        int b = check ("B", "W"), w = check ("W", "B");
        out.printf("%d\n", Math.max(b, w));
        out.close();
    }
}