import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        
        int size = input.nextInt();
        int[] heap = new int[size+1];
        for (int i = 1; i < size+1; i++) {
            heap[i] = input.nextInt();
        }
        for (int i = 1; i < size+1; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("node ").append(i).append(": ");
            sb.append("key = ").append(heap[i]).append(", ");
            if (i/2 > 0) {
                sb.append("parent key = ").append(heap[i/2]).append(", ");
            }
            if (i*2 < size+1) {
                sb.append("left key = ").append(heap[i*2]).append(", ");
            }
            if (i*2+1 < size+1) {
                sb.append("right key = ").append(heap[i*2+1]).append(", ");
            }
            System.out.println(sb.toString());
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