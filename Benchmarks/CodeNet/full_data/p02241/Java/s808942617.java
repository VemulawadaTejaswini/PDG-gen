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
        int[][] us = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int v = input.nextInt();
                us[i][j] = v == -1 ? Integer.MAX_VALUE : v;
            }
            us[i][i] = 0;
        }
        
        int[] f = new int[n+1];
        f[1] = 1;
        int t = calc(us, f);
        System.out.println(t);
    }
    int calc(int[][] us, int[] f) {
        int a = 0;
        int v = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            if (f[i] == 1) {
                for (int j = 1; j <= n; j++) {
                    if (i != j && f[j] != 1 && us[i][j] < v) {
                        a = j;
                        v = us[i][j];
                    }
                }
            }
        }
        f[a] = 1;
        if (f[0] == 1) return 0;
        return v + calc(us, f);
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