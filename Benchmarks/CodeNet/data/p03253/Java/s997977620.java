import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static int MAX=510000;
    public static int MOD=1000000007;
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(m==1){
            out.println(1);
        }else{
        HashMap<Integer,Integer> map=new HashMap<>();
        int Stop=(int)(sqrt(m)+1);
        for (int i = 2; i <= Stop; i++) {
            while(m%i==0){
                m/=i;
                map.put(i,map.getOrDefault(i, 0)+1);
            }
        }
        map.put(m, 1);}
        
        long ans=1;
        COMinit();
        for(int k:map.keySet()){
            ans*=comb(n-1+map.get(k),map.get(k))%MOD;
            ans=ans%MOD;
        }
        out.println(ans);
        }
    }
//階乗
static long fact(long a){
    long b=1;
    for (long i = 1; i <= a; i++) {
        b*=i;
    }
    return b;
}
//最大公約数
static int gcd (int a, int b) {
    int temp;
    while((temp = a%b)!=0) {
        a = b;
        b = temp;
    }
    return b;
}
//※最小公倍数はa*b/gcd(a,b)である
//二項係数
//前処理
static final long[] fac=new long[MAX];
static final long[] finv=new long[MAX];
static final long[] inv=new long[MAX];
static void COMinit(){
    fac[0]=fac[1]=1;
    finv[0]=finv[1]=1;
    inv[1]=1;
    for (int i = 2; i < MAX; i++) {
        fac[i]=fac[i-1]*i%MOD;
        inv[i]=MOD-inv[MOD%i]*(MOD/i)%MOD;
        finv[i]=finv[i-1]*inv[i]%MOD;
    }
}
//二項係数計算
static long comb (int a, int b) {
    if(a<b)return 0;
    if(a<0||b<0)return 0;
    return fac[a]*(finv[b]*finv[a-b]%MOD)%MOD;
}
//順列
static long permu(long a,long b){
    long temp=1;
    for (long i =a ; i > a-b; i--) {
        temp*=i;
    }
    return temp;
}
}
