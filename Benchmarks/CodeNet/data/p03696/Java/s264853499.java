import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String[] s2 = s.split("\\)",-1);
        int len = s2.length;
        int close = 0;
        for(int i = len-1; i >= 0; i--){
            if(i != len-1)close++;
            int index = 0;
            while(true){
                int tmp = s2[i].indexOf("(",index);
                if(tmp != -1){
                    close--;
                    index = tmp+1;
                }else{
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            if(close < 0){
                for(int j = close; j < 0; j++){
                    sb.append(")");
                }
                close = 0;
            }
            s2[i] += sb.toString();
            if(i != len-1) s2[i] += ")";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < close; i++){
            sb.append("(");
        }
        System.out.println(sb.toString()+String.join("",s2));
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
