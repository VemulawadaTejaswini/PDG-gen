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
        Integer[] A = new Integer[n];
        for (int i = 0; i < n; i++) A[i] = input.nextInt();
        int q = input.nextInt();
        int[] M = new int[q];
        for (int i = 0; i < q; i++) M[i] = input.nextInt();
        
        Arrays.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return y.compareTo(x);
            }
        });
        
        for (int m : M) {
            if (check(m, A)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        
    }
    
    private boolean check(int x, Integer[] ns) { return check(x, ns, 0, 0);}
    private boolean check(int x, Integer[] ns, int index, int sum) {
        if (x < sum) return false;
        if (x == sum) return true;
        for (int i = index; i < ns.length; i++) {
            if (check(x, ns, i + 1, sum + ns[i])) {
                return true;
            }
        }
        return false;
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