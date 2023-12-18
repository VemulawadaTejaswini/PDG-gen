import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] p=new int[n];
        for (int i = 0; i < n; i++) {
            p[i]=sc.nextInt();
        }
        int ac=0,bc=0,cc=0;
        for (int i = 0; i < n; i++) {
            if(p[i]<=a)ac++;
            else if(p[i]<=b)bc++;
            else cc++;
        }
        out.println(min(ac,min(bc,cc)));
    }
    //a文字目とb文字目を入れ替え（1-indexed）
    static String swap(String s,int a,int b){
        StringBuilder t=new StringBuilder(s);
        char A=s.charAt(a-1);
        char B=s.charAt(b-1);
        t.setCharAt(a-1,B);
        t.setCharAt(b-1,A);
        return t.toString();
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
    static int gcd (int a,int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
    //※最小公倍数はa*b/gcd(a,b)である
    static class UF{
        static int size=51;
        static int[] par=new int[size];
        //初期化
        static void init(){
            for (int i = 1; i <size ; i++) {
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
        //同じ根をもつか(同じ集合に属するか)判定
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