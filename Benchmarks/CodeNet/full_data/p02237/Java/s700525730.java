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
        int[][] us = new int[n][n];
        while (n-- > 0) {
            int u = input.nextInt();
            int k = input.nextInt();
            while (k-- > 0) {
                int v = input.nextInt();
                us[u-1][v-1] = 1;
            }
        }
        for (int[] xx : us) {
            StringBuilder sb = new StringBuilder();
            for (int x : xx) {
                sb.append(x).append(' ');
            }
            System.out.println(sb.toString().trim());
        }
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