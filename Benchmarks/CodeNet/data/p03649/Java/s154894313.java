import java.lang.reflect.Array;
import java.util.*;
import java.awt.geom.Point2D;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        long[] a=new long[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextLong();
        }
        long ans=0;
        out.println(calc(a,ans,n));
    }
    static long calc(long[] a,long ans,int n){
        Arrays.sort(a);
        if(a[n-1]<n)return ans;
        ans+=a[n-1]/n;
        a[n-1]=a[n-1]%n;
        for (int i = 0; i <n-1 ; i++) {
            a[i]+=a[n-1];
        }
        return calc(a,ans,n);
    }
    static long power(long x,int n){
        long mod=1000000007;
        long ans=1;
        while (n>0) {
            if((n&1)==1){
                ans=(ans*x)%mod;
            }
            x=(x*x)%mod;
            n>>=1;
        }
        return ans;
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
    static class UF{
        static int size=1000000;
        static int[] par=new int[size];
        //初期化
        static void init(int n){
            for (int i = 0; i <n ; i++) {
                par[i]=i;
            }
        }
        //根をたどる
        static int root(int x){
            if(par[x]==x){
                return x;
            }else{
                return par[x]=root(par[x]);
            }
        }
        //同じ根をもつか判定
        static boolean same(int x,int y){
            return root(x)==root(y);
        }
        //合体
        static void unite(int x,int y){
            x=root(x);
            y=root(y);
            if(x==y)return;
            par[x]=y;
        }
    }
}