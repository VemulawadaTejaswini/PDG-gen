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
        int[] S = new int[n];
        for (int i = 0; i < n; i++) S[i] = input.nextInt();
        
        int q = input.nextInt();
        int[] T = new int[q];
        for (int i = 0; i < q; i++) T[i] = input.nextInt();
        
        Arrays.sort(S);
        Arrays.sort(T);
        
        int i = 0, j = 0, count = 0;
        while (j < q && i < n) {
            if (S[i] < T[j]) {
                i++;
            } else if (S[i] == T[j]) {
                count++;
                while (i < n && S[i] == T[j]) i++;
            } else {
                j++;
            }
        }
        
        System.out.println(count);
    }
    
    private void print(Object[] xs) {
        StringBuilder sb = new StringBuilder();
        for (Object x : xs) sb.append(x.toString()).append(' ');
        System.out.println(sb.toString().trim());
    }
    
    private static class Scanner {
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
}