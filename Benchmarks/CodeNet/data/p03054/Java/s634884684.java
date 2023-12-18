import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        int nh = sc.nextInt()-1;
        int nw = sc.nextInt()-1;
        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();
        boolean flg = true;
        
        int left = 0, right = W;
        if (S[N-1] == 'L') ++left;
        if (S[N-1] == 'R') --right;
        for (int i = N-2; i >= 0; --i) {
            if (T[i] == 'L'){
                right = Math.min(right+1, W);
            }else if (T[i] == 'R'){
                left = Math.max(0, left-1);
            }
            if (S[i] == 'L'){
                left = left + 1;
            }else if(S[i] == 'R'){
                right = right - 1;
            }
            if (left >= right) flg = false;
        }
        if (nw < left || nw >= right) flg = false; 
    
        // up, down
        int up = 0;
        int down = H;
        if (S[N-1] == 'U') ++up;
        if (S[N-1] == 'D') --down;
        for (int i = N-2; i >= 0; --i) {
            if (T[i] == 'U'){
                down = Math.min(down+1, H);
            }else if (T[i] == 'D'){
                up = Math.max(0, up-1);
            }
            if (S[i] == 'U'){
                up = up + 1;
            }
            else if (S[i] == 'D'){
                down = down - 1;
            }
            if (up >= down) flg = false;
        }
        if (nh < up || nh >= down) flg = false;
        pw.println(flg ? "YES" : "NO");
        pw.flush();
    }

    static class GeekInteger {
        public static void save_sort(int[] array) {
            shuffle(array);
            Arrays.sort(array);
        }
 
        public static int[] shuffle(int[] array) {
            int n = array.length;
            Random random = new Random();
            for (int i = 0, j; i < n; i++) {
                j = i + random.nextInt(n - i);
                int randomElement = array[j];
                array[j] = array[i];
                array[i] = randomElement;
            }
            return array;
        }
 
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
