import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    static int N = 100000;
    static int NIL = -1;
    int root = NIL;
    int[] key = new int[N];
    int[] left = new int[N];
    int[] right = new int[N];
    int[] p = new int[N];
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < N; i++) {
            key[i] = NIL;
            left[i] = NIL;
            right[i] = NIL;
            p[i] = NIL;
        }
        int n = input.nextInt();
        
        int z = 0;
        while (n-- > 0) {
            String op = input.next();
            if ("insert".equals(op)) {
                key[z] = input.nextInt();
                insertTree(z++);
            } else if("print".equals(op)) {
                System.out.println(inorder(root));
                System.out.println(preorder(root));
            }
        }
    }
    
    private String preorder(int node) {
        StringBuilder sb = new StringBuilder();
        sb.append(' ').append(key[node]);
        if (left[node] != NIL) sb.append(preorder(left[node]));
        if (right[node] != NIL) sb.append(preorder(right[node]));
        return sb.toString();
    }
    private String inorder(int node) {
        StringBuilder sb = new StringBuilder();
        if (left[node] != NIL) sb.append(inorder(left[node]));
        sb.append(' ').append(key[node]);
        if (right[node] != NIL) sb.append(inorder(right[node]));
        return sb.toString();
    }
    
    void insertTree(int z) {
        int x = root;
        int y = NIL;
        while (x != NIL) {
            y = x;
            if (key[z] < key[x]) {
                x = left[x];
            } else {
                x = right[x];
            }
        }
        p[z] = y;
        if (y == NIL) {
            root = z;
        } else {
            if (key[z] < key[y]) {
                left[y] = z;
            } else {
                right[y] = z;
            }
        }
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