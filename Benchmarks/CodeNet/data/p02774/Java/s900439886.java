import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        long k = sc.nextLong();
        ArrayList<Long> minus = new ArrayList<>();
        long zero = 0;
        ArrayList<Long> plus = new ArrayList<>();
        for(int i = 0; i < n; i++){
            long a = sc.nextLong();
            if(a < 0){
                minus.add(a);
            }else if(a == 0){
                zero++;
            }else{
                plus.add(a);
            }
        }
        long minusCnt = minus.size()*plus.size();
        long zeroCnt = zero*(minus.size()+plus.size())+zero*(zero-1)/2;
        if(minusCnt >= k){
            long left = -(long)Math.pow(10,18);
            long right = 0;
            while(right-left > 1){
                long mid = (right+left)/2;
                int cnt = 0;
                for(long mi : minus){
                    for(long pl : plus){
                        if(mi*pl <= mid){
                            cnt++;
                        }
                    }
                }
                if(cnt <= k){
                    left = mid;
                }else{
                    right = mid;
                }
            }
            System.out.println(left+1);
        }else if(minusCnt < k && minusCnt+zeroCnt >= k){
            System.out.println(0);
        }else{
            long rem = k - (minusCnt+zeroCnt);
            long left = 0;
            long right = (long)Math.pow(10,18);
            while(right-left > 1){
                long mid = (right+left)/2;
                int cnt = 0;
                for(int i = 0; i < minus.size(); i++){
                    for(int j = i+1; j < minus.size(); j++){
                        if(minus.get(i)*minus.get(j) <= mid){
                            cnt++;
                        }
                    }
                }
                for(int i = 0; i < plus.size(); i++){
                    for(int j = i+1; j < plus.size(); j++){
                        if(plus.get(i)*plus.get(j) <= mid){
                            cnt++;
                        }
                    }
                }
                if(cnt < rem){
                    left = mid;
                }else{
                    right = mid;
                }
            }
            System.out.println(left+1);
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
