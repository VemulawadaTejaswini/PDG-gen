import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out,false);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        for(int i =0; i < n; i++) {
            char[] str = scanner.next().toCharArray();
            Arrays.sort(str);
            arr[i] = new StringBuilder().append(str).toString();
        }
        Arrays.sort(arr);
        long amt = 0;
        for(int i = 0; i < n; ) {
            int j = i + 1;
            for(; j < n; j++) {
                if (!arr[i].equals(arr[j])) break;
            }
            amt += ((long)(j - i-1)*(j - i))/ 2; 
            i = j;
        }
        out.println(amt);
        out.flush();
    }
    
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        
        public FastScanner() {
            this(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
