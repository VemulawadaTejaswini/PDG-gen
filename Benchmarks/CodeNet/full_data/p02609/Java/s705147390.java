import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

class Main{
    static int maxn = 200005;
    static int[] f = new int[maxn];

    static int num(int a){
        int cnt = 0;
        while(a>0){
            if((a&1) > 0) ++cnt;
            a >>= 1;
        }
        return cnt;
    }
    static void pre(){
        f[0] = 0;
        f[1] = f[2] = 1;
        for(int i=3;i<maxn;++i){
            f[i] = 1+f[i%num(i)];
        }
    }
    static BigInteger kpow(BigInteger a,int b){
        BigInteger res = BigInteger.ONE;
        while(b>0){
            if((b&1) > 0) res = res.multiply(a);
            a = a.multiply(a);
            b >>= 1;
        }
        return res;
    }
    public static void main(String[] args){
        pre();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        int cnt = 0;
        for(int i=0;i<n;++i)
            if(s.charAt(i)=='1') ++cnt;
        BigInteger dec = new BigInteger(s,2);
        for(int i=0;i<n;++i){
            int cnt1 = cnt;
            BigInteger d = dec;
            if(s.charAt(i)=='0'){
                ++cnt1;
                d = d.add(kpow(BigInteger.valueOf(2),n-i-1));
            }
            else{
                --cnt1;
                d = d.subtract(kpow(BigInteger.valueOf(2), n-i-1));
            }
            if(d.compareTo(BigInteger.valueOf(maxn))<0){
                int dd = d.intValue();
                System.out.println(f[dd]);
            }
            else{
                int dd = (d.mod(BigInteger.valueOf(cnt1))).intValue();
                System.out.println(1+f[dd]);
            }
        }
    }
}