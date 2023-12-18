import java.io.*;
import java.util.*;

class Main{
    final static long MOD = 1000000007;
    FastScanner sc = new FastScanner();

    public static void main(String[] args) {
        new Main().solve();
    }

    int n;
    String s;
    // int[] a;
    // Set<String> set;
    // Set<Integer> set;
    int[][] dp;

    void solve(){

        n = sc.nextInt();
        s = sc.next();
        // a = s.toCharArray();
        // a = new int[n];

        // for(int i = 0; i < n; i++){
        //     a[n - i - 1] = Character.getNumericValue(s.charAt(i));
        // }

        // set = new HashSet<String>();
        // set = new HashSet<Integer>();

        dp = new int[3][n];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < n - 2; j++){
                dp[i][j] = -1;
            }
        }

        int ans = 0;

        for(int i = 0; i < n - 2; i++){
            // step(i, "");
            // step(i, 0, 1);
            ans += step(i);
        }

        System.out.println(ans);

        // for(String test : set) System.out.println(test);

    }

    // void step(int d, String t){
    //     for(int i = 0; i < n - 2; i++){
    //         if(d + i + 1 == s.length()){
    //             if(t.length() == 2) set.add(t + s.charAt(d));
    //             return;
    //         }
    //         step(d + i + 1, t + s.charAt(d));
    //     }
    // }

    // void step(int d, int t, int k){
    //     for(int i = 0; i < n - 2; i++){
    //         if(d + i + 1 == s.length()){
    //             if(k == 3) set.add((int)(t + Math.pow(10, k) * a[d]));
    //             return;
    //         }
    //         step(d + i + 1, (int)(t + Math.pow(10, k) * a[d]), k + 1);
    //     }
    // }

    int step(int o){
        if(dp[1][o] != -1) return dp[1][o];
        int tmp = 0;
        for(int i = o + 1; i < n - 1; i++){
            tmp += step(o, i);
            // set.add(s.charAt(o) + dp[1][i]);
        }
        dp[1][o] = tmp;
        return dp[1][o];
    }

    int step(int o, int t){
        if(dp[2][t] != -1) return dp[2][t];
        Set<String> set = new HashSet<String>();
        for(int i = t + 1; i < n; i++){
            set.add("" + s.charAt(i));
        }
        dp[2][t] = set.size();
        return dp[2][t];
    }

    long gcd(long a, long b){ // return aとbの最大公約数
        if(b == 0){
          return a;
        }
        return gcd(b, a % b);
    }

    long pow_mod(long a, long r){ // return a^r (mod MOD)
        long sum = 1;
        while(r > 0){
            if((r & 1) == 1){
                sum *= a;
                sum %= MOD;
            }
            a *= a;
            a %= MOD;
            r >>= 1;
        }
        return sum;
    }

}



class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte(){
        if(ptr < buflen){
            return true;
        }else{
            ptr = 0;
            try{
                buflen = in.read(buffer);
            }catch(IOException e){
                e.printStackTrace();
            }
            if(buflen <= 0){
                return false;
            }
        }
        return true;
    }
    private int readByte(){ if(hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c){ return 33 <= c && c <= 126;}
    public boolean hasNext(){ while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next(){
        if(!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong(){
        if(!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        if(b < '0' || '9' < b){
            throw new NumberFormatException();
        }
        while(true){
            if('0' <= b && b <= '9'){
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt(){
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble(){ return Double.parseDouble(next());}
}
