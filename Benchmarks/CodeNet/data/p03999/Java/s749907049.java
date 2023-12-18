import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        char[] s = sc.next().toCharArray();
        int len = s.length;
        if(len == 1){
            System.out.println(s[0]-'0');
            return;
        }
        long ans = 0;
        for(int i = 0; i < (2 << (len-2)); i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < len-1; j++){
                sb.append(s[j]);
                if((i >> j) % 2 != 0){
                    sb.append('+');
                }
            }
            sb.append(s[len-1]);
            ans += checkFormula(sb.toString().toCharArray());
        }
        System.out.println(ans);
    }
    
    public static long checkFormula(char[] s){
        long ret = 0;
        StringBuilder sb = new StringBuilder();
        for(char c : s){
            if(c == '+'){
                ret += Long.parseLong(sb.toString());
                sb.setLength(0);
            }else{
                sb.append(c);
            }
        }
        ret += Long.parseLong(sb.toString());
        return ret;
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
