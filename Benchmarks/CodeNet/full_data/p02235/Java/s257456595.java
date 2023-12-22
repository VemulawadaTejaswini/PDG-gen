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
        while (n-- > 0) {
            String s1 = input.next();
            String s2 = input.next();
            System.out.println(getLcs(s1, s2));
        }
    }
    
    int getLcs(String s1, String s2) {
        char[] cs1 = s1.toCharArray();
        char[] cs2 = s2.toCharArray();
        int[][] lcs = new int[cs1.length+1][cs2.length+1];
        
        for (int i = 0; i < cs1.length; i++) {
            for (int j = 0; j < cs2.length; j++) {
                if (cs1[i] == cs2[j]) {
                    lcs[i+1][j+1] = Math.max(Math.max(lcs[i][j]+1, lcs[i][j+1]), lcs[i+1][j]);
                } else {
                    lcs[i+1][j+1] = Math.max(Math.max(lcs[i][j], lcs[i][j+1]), lcs[i+1][j]);
                }
            }
        }
        return lcs[cs1.length][cs2.length];
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