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
        ArrayList<Long> mp = new ArrayList<>();
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
        int mlen = minus.size();
        int plen = plus.size();
        Collections.sort(minus);
        Collections.sort(plus);
        long minusCnt = mlen * plen;
        long zeroCnt = zero*(mlen+plen)+(zero*(zero-1))/2L;
        if(minusCnt >= k){
            long left = -(long)Math.pow(10,18)-1L;
            long right = 0;
            while(right-left > 1){
                long mid = (right+left)/2L;
                int cnt = 0;
                int l = 0,r = 0;
                while(l < mlen && r < plen){
                    if(minus.get(l) * plus.get(r) <= mid){
                        cnt += plen-r;
                        l++;
                    }else{
                        r++;
                    }
                }
                if(cnt < k){
                    left = mid;
                }else{
                    right = mid;
                }
            }
            System.out.println(right);
        }else if(minusCnt < k && minusCnt+zeroCnt >= k){
            System.out.println(0);
        }else{
            long pl = plen;
            long ml = mlen;
            long pp = (ml*(ml-1))/2L + (pl*(pl-1))/2L;
            Collections.reverse(plus);
            long rem = k - (minusCnt+zeroCnt);
            long left = -1;
            long right = (long)Math.pow(10,18)+1L;
            while(right-left > 1){
                long mid = (right+left)/2L;
                int cnt = 0;
                int l = 0,r = mlen-1;
                while(l < mlen && r >= 0){
                    if(l == r){
                        r--;
                        continue;
                    }
                    if(minus.get(l) * minus.get(r) >= mid){
                        cnt += r+1;
                        if(l < r) cnt--;
                        l++;
                    }else{
                        r--;
                    }
                }
                l = 0;
                r = plen-1;
                while(l < plen && r >= 0){
                    if(l == r){
                        r--;
                        continue;
                    }
                    if(plus.get(l) * plus.get(r) >= mid){
                        cnt += r+1;
                        if(l < r) cnt--;
                        l++;
                    }else{
                        r--;
                    }
                }
                if(pp-(cnt/2L) < rem){
                    left = mid;
                }else{
                    right = mid;
                }
            }
            System.out.println(left);
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
