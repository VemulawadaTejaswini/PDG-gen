import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int cnt = 0;
        int min = 0;
        for(char c : s.toCharArray()){
            if(c == ')'){
                cnt--;
                min = Math.min(min,cnt);
            }else{
                cnt++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = min; i < 0; i++){
            sb.append("(");
        }
        s = sb.toString()+s;
        cnt = 0;
        for(char c : s.toCharArray()){
            if(c == ')'){
                cnt--;
                
            }else{
                cnt++;
            }
        }
        sb.setLength(0);
        for(int i = 0; i < cnt; i++){
            sb.append(")");
        }
        s += sb.toString();
        System.out.println(s);
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
