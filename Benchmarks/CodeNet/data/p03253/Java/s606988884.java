import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static long mod=1000000007;
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
            if(map.isEmpty()){map.put(m, 1);}
            long ans=1;
                for(int k:map.keySet()){
                    ans*=comb(n-1+map.get(k),map.get(k))%mod;
                    ans=ans%mod;
                }
            out.println(ans);
        }
    }
    //階乗
static long fact(long a){
    long b=1;
    for (long i = 1; i <= a; i++) {
        b*=i%mod;
        b=b%mod;
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
static long comb (long a, long b) {
    b=min(a-b,b);
    return permu(a,b)/fact(b);
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