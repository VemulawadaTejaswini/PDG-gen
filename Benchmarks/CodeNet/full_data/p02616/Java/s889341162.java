import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        long mod = (long)Math.pow(10,9)+7;
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Long> minus = new ArrayList<>();
        ArrayList<Long> plus = new ArrayList<>();
        ArrayList<Long> ab = new ArrayList<>();
        int m = 0;
        int p = 0;
        boolean isZero = false;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            long b = sc.nextLong();
            if(b < 0){
                minus.add(b);
                ab.add(Math.abs(b));
                m++;
            }else if(b > 0){
                plus.add(b);
                ab.add(b);
                p++;
            }else{
                plus.add(b);
                isZero = true;
            }
        }
        if(m == 0){
            long ans = 1;
            Collections.sort(plus,Comparator.reverseOrder());
            for(int i = 0; i < k; i++){
                ans *= plus.get(i);
                ans %= mod;
            }
            System.out.println(ans);
            return;
        }else if(p == 0){
            long ans = 1;
            if(k % 2 == 0){
                Collections.sort(minus);
                for(int i = 0; i < k; i++){
                    ans *= minus.get(i);
                    ans %= mod;
                }
                System.out.println(ans);
            }else if(k % 2 == 1 && isZero){
                System.out.println(0);
            }else{
                Collections.sort(minus,Comparator.reverseOrder());
                for(int i = 0; i < k; i++){
                    ans *= Math.abs(minus.get(i));
                    ans %= mod;
                }
                System.out.println(mod-ans);
                
            }
            return;
        }else if(k == 1){
            Collections.sort(plus,Comparator.reverseOrder());
            System.out.println(plus.get(0));
            return;
        }
        if(p+m < k){
            System.out.println(0);
        }else if(k > p && (k - p) % 2 == 1 && k-p >= m){
            if(isZero){
                System.out.println(0);
            }else{
                Collections.sort(ab);
                long ans = 1;
                for(int i = 0; i < k; i++){
                    ans *= ab.get(i);
                    ans %= mod;
                }
                System.out.println(mod-ans);
            }
        }else{
            Collections.sort(minus);
            Collections.sort(plus,Comparator.reverseOrder());
            int index = 0;
            for(int i = 0; i < minus.size()-1; i += 2){
                if(k-1-i >= plus.size()){
                    continue;
                }
                if(minus.get(i) * minus.get(i+1) <= plus.get(k-1-i) * plus.get(k-2-i)){
                    break;
                }else{
                    index = i+2;
                }
            }
            long ans = 1;
            for(int i = 0; i < index; i++){
                ans *= Math.abs(minus.get(i));
                ans %= mod;
            }
            for(int i = 0; i < k-index; i++){
                ans *= plus.get(i);
                ans %= mod;
            }
            System.out.println(ans);
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
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
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
