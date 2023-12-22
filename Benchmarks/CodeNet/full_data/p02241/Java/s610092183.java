import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] us = new int[n+1][n+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int v = input.nextInt();
                us[i+1][j+1] = (v == -1) ? Integer.MAX_VALUE : v;
            }
        }
        int[] p = new int[n+1];
        for (int i = 1; i <= n; i++) {
            p[i] = Integer.MAX_VALUE;
        }
        p[1] = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                p[i] = Math.min(us[i][j], p[i]);
            }
        }
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += p[i];
        }
        System.out.println(sum);
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