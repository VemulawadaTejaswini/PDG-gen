import java.util.*;
import java.io.*;

class Mod{
    static final int MOD = 1000_000_007;
    static final long[] fact = makeFactorialArray(1000000);
    static final long[] factInv = makeInversedArray(fact);

    public static long add(long a, long b){
        long tmp = (a+b)%MOD;
        return tmp>=0 ? tmp : tmp+MOD;
    }
    public static long sub(long a, long b){
        return add(a,-b);
    }
    public static long mult(long a, long b){
        long tmp = (a*b)%MOD;
        return tmp>=0 ? tmp : tmp+MOD;
    }
    public static long power(long a, long x){ //calculate a^x
        if(x<0)return 0;
        if(x==0)return 1;
        if(x%2==0) {
            long half = power(a,x/2);
            return mult(half,half);
        }
        return (a*power(a,x-1)) % MOD;
    }
    public static long inverse(long a){
        return power(a,MOD-2);
    }
    public static long div(long a, long b){
        return mult(a, inverse(b));
    }
    public static long[] makeFactorialArray(int size){
        long[] array = new long[size];
        array[0]=1;
        for(int i=1;i<size;i++){
            array[i]=mult(array[i-1],i);
        }
        return array;
    }
    public static long[] makeInversedArray(long[] original){
        long[] array = new long[original.length];
        for(int i=0;i<original.length;i++){
            array[i] = inverse(original[i]);
        }
        return array;
    }
    public static long combination(int n, int r){
        if(n<0 || r<0 || n<r) return 0;
        return mult(fact[n], mult(factInv[r],factInv[n-r]));
    }
    public static long gcd(long a, long b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public static long lcm(long a, long b){
        return (a/gcd(a,b))*b;
    }

}

public class Main {

    public static void answer(long ans){
        System.out.println(ans);
        System.exit(0);
    }

    public static int baseCode(char b){
        if(b=='A') return 1;
        if(b=='T') return 0;
        if(b=='C') return 2;
        if(b=='G') return 3;
        return 0;
    }
    public static int helixCode(String H){
        int ans = 0;
        for(int n=0; n<H.length(); n++){
            ans <<= 2;
            ans += baseCode(H.charAt(n));
        }
        return ans;
    }
    public static char codeToBase(int c){
        switch (c){
            case 0: return 'T';
            case 1: return 'A';
            case 2: return 'C';
            case 3: return 'G';
            default: return 'X';
        }
    }
    public static String codeToHelix(int h){
        return codeToBase((h&192)>>6)+""+codeToBase((h&48)>>4)+codeToBase((h&12)>>2)+codeToBase(h&3);
    }
    public static boolean canMakeAGC(String S){
        return canMakeAGC(("XXX"+S).substring(S.length()-4, S.length()));
    }
    public static boolean canMakeAGC(int h){
        return  ((h&63)==helixCode("XAGC")) ||
                ((h&252)==helixCode("AGCX")) ||
                ((h&63)==helixCode("XACG")) ||
                ((h&63)==helixCode("XGAC")) ||
                ((h&63)==helixCode("XAGC")) ||
                ((h&252)==helixCode("ACGX")) ||
                ((h&252)==helixCode("GACX")) ||
                ((h&252)==helixCode("AGCX")) ||
                ((h&207)==helixCode("AXGC")) ||
                ((h&243)==helixCode("AGXC")) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<=3) answer(61);
        if(N==4) answer(230);

        long[][] dp = new long[256][N+1];
        //NG list: *AGC *ACG *GAC
        //         A*GC AG*C

        for(int h=0; h<256; h++){
            if(!canMakeAGC(h)){
                dp[h][4]=1;
            }
        }
        for(int n=5; n<=N; n++) {
            for(int h=0; h<256; h++){
                dp[((h&63)<<2)][n] = Mod.add(dp[((h&63)<<2)][n], dp[h][n-1]);
                dp[((h&63)<<2)+1][n] = Mod.add(dp[((h&63)<<2)+1][n], dp[h][n-1]);
                dp[((h&63)<<2)+2][n] = Mod.add(dp[((h&63)<<2)+2][n], dp[h][n-1]);
                dp[((h&63)<<2)+3][n] = Mod.add(dp[((h&63)<<2)+3][n], dp[h][n-1]);
            }
            for(int h=0; h<256; h++){
                if(canMakeAGC(h)) dp[h][n] = 0;
            }
        }

        long ans = 0;
        for(int h=0; h<256; h++) ans = Mod.add(ans, dp[h][N]);
        System.out.println(ans);


    }
}