import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    int n = 0;
    private void solv() {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[][] us = new int[n+1][n+1];
        for (int i = 0; i < n; i++) {
            int u = input.nextInt();
            int k = input.nextInt();
            while (k-- > 0) {
                int v = input.nextInt();
                us[u][v] = 1;
            }
        }
        d = new int[n+1];
        f = new int[n+1];
        int t = 0;
        for (int i = 1; i <= n; i++) {
            t = calc(us, i, t);
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.println(String.format("%d %d %d", i, d[i], f[i]));
        }
    }
    int[] d;
    int[] f;
    int calc(int[][] us, int id, int t ) {
        if (d[id] != 0) return t;
        d[id] = ++t;
        for (int i = 1; i <= n; i++) {
            if (us[id][i] != 0) {
                t = calc(us, i, t);
            }
        }
        f[id] = ++t;
        return t;
    }
    
    void swap(int[] A, int x, int y) {
        int temp = A[x];
        A[x] = A[y];
        
        A[y] = temp;
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