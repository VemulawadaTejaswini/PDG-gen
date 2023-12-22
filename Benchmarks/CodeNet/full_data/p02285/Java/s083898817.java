import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    static int N = 500000;
    static int NIL = -1;
    int root = NIL;
    int[] value = new int[N];
    int[] left = new int[N];
    int[] right = new int[N];
    int[] p = new int[N];
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < N; i++) {
            value[i] = NIL;
            left[i] = NIL;
            right[i] = NIL;
            p[i] = NIL;
        }
        int n = input.nextInt();
        
        int z = 0;
        while (n-- > 0) {
            String op = input.next();
            if ("insert".equals(op)) {
                value[z] = input.nextInt();
                insertTree(z++);
            } else if("print".equals(op)) {
                inorder(root);
                System.out.println();
                preorder(root);
                System.out.println();
            } else if("find".equals(op)) {
                System.out.println(findTree(input.nextInt()) ? "yes" : "no");
            } else if("delete".equals(op)) {
                int v = input.nextInt();
                int k = NIL;
                for (int i = 0; i < N; i++) {
                    if (value[i] == v) {
                        k = i;
                        break;
                    }
                }
                deleteTree(k);
            }
        }
    }
    
    private void preorder(int node) {
        System.out.print(new StringBuilder().append(' ').append(value[node]));
        if (left[node] != NIL) preorder(left[node]);
        if (right[node] != NIL) preorder(right[node]);
    }
    private void inorder(int node) {
        if (left[node] != NIL) inorder(left[node]);
        System.out.print(new StringBuilder().append(' ').append(value[node]));
        if (right[node] != NIL) inorder(right[node]);
    }
    
    void insertTree(int z) {
        int x = root;
        int y = NIL;
        while (x != NIL) {
            y = x;
            if (value[z] < value[x]) {
                x = left[x];
            } else {
                x = right[x];
            }
        }
        p[z] = y;
        if (y == NIL) {
            root = z;
        } else {
            if (value[z] < value[y]) {
                left[y] = z;
            } else {
                right[y] = z;
            }
        }
    }
    boolean findTree(int v) {
        int x = root;
        int y = NIL;
        while (x != NIL) {
            y = x;
            if (value[y] == v) return true;
            if (v < value[x]) {
                x = left[x];
            } else {
                x = right[x];
            }
        }
        return false;
    }
    void deleteTree(int z) {
        int y;
        if (left[z] == NIL || right[z] == NIL) {
            y = z;
        } else {
            y = successorTree(z);
        }
        int x;
        if (left[y] != NIL) {
            x = left[y];
        } else {
            x = right[y];
        }
        if (x != NIL) {
            p[x] = p[y];
        }
        if (value[y] == NIL) {
            root = x;
        } else {
            if (y == left[p[y]]) {
                left[p[y]] = x;
            } else {
                right[p[y]] = x;
            }
        }
        if (y != z) value[z] = value[y];
    }
    int successorTree(int x) {
        if (right[x] != NIL) return minimumTree(right[x]);
        int y = p[x];
        while (y != NIL && x == right[y]) {
            x = y;
            y = p[y];
        }
        return y;
    }
    int minimumTree(int x) {
        while (left[x] != NIL) x = left[x];
        return x;
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