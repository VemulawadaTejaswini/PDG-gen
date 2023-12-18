// 20/02/04 11:33

import java.io.*;
import java.util.*;

class Main{
    final static long MOD = 1000000007;
    FastScanner sc = new FastScanner();

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve(){

        long n = sc.nextInt();
        int[] m = {0, 3, 5, 7};
        int co = 0;

        for(int a = 0; a < 4 ; a++){
            for(int b = Math.min(1, a); b < 4 ; b++){
                for(int c = Math.min(1, b); c < 4 ; c++){
                    for(int d = Math.min(1, c); d < 4 ; d++){
                        for(int e = Math.min(1, d); e < 4 ; e++){
                            for(int f = Math.min(1, e); f < 4 ; f++){
                                for(int g = Math.min(1, f); g < 4 ; g++){
                                    for(int h = Math.min(1, g); h < 4 ; h++){
                                        for(int i = Math.min(1, h); i < 4 ; i++){
                                            for(int j = Math.min(1, i); j < 4 ; j++){
                                                long x = m[a] * (long)Math.pow(10, 9) + m[b] * (long)Math.pow(10, 8) + m[c] * (long)Math.pow(10, 7) + m[d] * (long)Math.pow(10, 6) + m[e] * (long)Math.pow(10, 5) + m[f] * (long)Math.pow(10, 4) + m[g] * (long)Math.pow(10, 3) + m[h] * (long)Math.pow(10, 2) + m[i] * (long)Math.pow(10, 1) + m[j];
                                                if(!String.valueOf(x).contains("3") || !String.valueOf(x).contains("5") || !String.valueOf(x).contains("7")) continue;
                                                if(x <= n){
                                                    co++;
                                                }
                                                else break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(co);

    }

    long mod_pow(long a, long r){ // return a^r (mod MOD)
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

    long mod_inv(long a){ // return aの逆元 (mod MOD)
        return mod_pow(a, MOD - 2);
    }

    long fact(long n){ // return n!
        if(n == 0){
            return 1;
        }
        return n * fact(n - 1);
    }

    long mod_fact(long n){ // retur n! (mod MOD)
        if(n == 0){
            return 1;
        }
        return n * mod_fact(n - 1) % MOD;
    }

    long gcd(long a, long b){ // return aとbの最大公約数
        if(b == 0){
          return a;
        }
        return gcd(b, a % b);
    }

    boolean is_prime(long a){ // aの素数判定
        if(a <= 1) return false;
        for(int i = 2; i * i <= a; i++){
            if(a % i == 0) return false;
        }
        return true;
    }

    String nextPermutation(String s){ // return sの次の順列
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) list.add(s.charAt(i));

        int pivotPos = -1;
        char pivot = 0;
        for(int i = list.size() - 2; i >= 0; i--){
            if(list.get(i) < list.get(i+1)){
    			pivotPos = i;
    			pivot = list.get(i);
    			break;
    		}
    	}

        if(pivotPos == -1 && pivot == 0) return null;

        int L = pivotPos + 1;
        int R = list.size() - 1;
    	int minPos = -1;
    	char min = Character.MAX_VALUE;
    	for(int i = R; i >= L; i--){
    		if(pivot < list.get(i)){
    			if(list.get(i) < min){
    				min = list.get(i);
    				minPos = i;
    			}
    		}
    	}

    	Collections.swap(list, pivotPos, minPos);
    	Collections.sort(list.subList(L, R + 1));

    	StringBuilder sb = new StringBuilder();
    	for(int i=0; i<list.size(); i++) sb.append(list.get(i));

    	return sb.toString();
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
    private int readByte(){
        if(hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    private static boolean isPrintableChar(int c){
        return 33 <= c && c <= 126;
    }
    public boolean hasNext(){
        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
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
    public double nextDouble(){
        return Double.parseDouble(next());
    }
}



class Pair implements Comparable<Pair>{
    long a, b;
    public Pair(long i, long j){
        a = i;
        b = j;
    }

    @Override
    public int compareTo(Pair p){
        if(this.b < p.b) return -1;
        else if(this.b > p.b) return 1;
        else return 0;
    }
}
