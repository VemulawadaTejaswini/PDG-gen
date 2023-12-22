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
    public static void main(String[] args){
        pre();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        int cnt = 0;
        for(int i=0;i<n;++i){
            if(s.charAt(i)=='1') ++cnt;
        }
        for(int i=0;i<n;++i){
            char[] s1 = s.toCharArray();
            int cnt1 = cnt;
            if(s1[i]=='0'){
                s1[i] = '1';
                ++cnt1;
            }
            else{
                s1[i] = '0';
                --cnt1;
            }
            String ss = String.valueOf(s1);
            BigInteger d = new BigInteger(ss,2);
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