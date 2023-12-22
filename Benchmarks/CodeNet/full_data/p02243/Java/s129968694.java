import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.test();
    }
    
    int n;
    private void test() {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        long[][] us = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                us[i][j] = Integer.MAX_VALUE;
            }
            int u = input.nextInt();
            int k = input.nextInt();
            for (int j = 0; j < k; j++) {
                int v = input.nextInt();
                int c = input.nextInt();
                us[u][v] = c;
            }
        }
        us[0][0] = 0;
        
        long[] vs = new long[n+1];
        Arrays.fill(vs, Integer.MAX_VALUE);
        vs[0] = 0;
        for (int m = 0; m < n; m++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    vs[j] = Math.min(vs[j], vs[i] + us[i][j]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(String.format("%d %d", i, vs[i]));
        }
    }
}

class Scanner {
    BufferedReader r;
    StreamTokenizer st;
    
    public Scanner(InputStream in) {
        r = new BufferedReader(new InputStreamReader(in));
        st = new StreamTokenizer(r);
    }
    
    public String next() {
        nextToken();
        return st.sval;
    }
    
    public Integer nextInt() {
        nextToken();
        return (int)st.nval;
    }
    
    private int nextToken() {
        int token = st.TT_EOF;
        try {
            token = st.nextToken();
        } catch (IOException e) {
        }
        return token;
    }
}