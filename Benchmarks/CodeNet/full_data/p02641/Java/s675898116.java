import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        if(n == 0){
            System.out.println(x);
            return;
        }else{
            boolean[] forbit = new boolean[202];
            for(int i = 0; i < n; i++){
                forbit[sc.nextInt()+100] = true;
            }
            if(!forbit[x+100]){
                System.out.println(x);
                return;
            }else{
                int left = x-1;
                int right = x+1;
                while(left >= 0 && right < 202){
                    if(!forbit[left+100]){
                        System.out.println(left);
                        return;
                    }else if(!forbit[right+100]){
                        System.out.println(right);
                        return;
                    }
                    left--;
                    right++;
                }
            }
        }
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }
    
    public void close() throws Exception{
        this.reader.close();
        return;
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