import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[]$) {
        Scanner sc = new Scanner(in);
        ArrayList<Point> ans=new ArrayList<>();
        HashMap<Point,Integer> mapH=new HashMap<>();
        HashMap<Point,Integer> mapcx=new HashMap<>();
        HashMap<Point,Integer> mapcy=new HashMap<>();
        int n=sc.nextInt();
        int[] x=new int[n];
        int[] y=new int[n];
        int[] h=new int[n];
        for (int i = 0; i < n; i++) {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            h[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < 101; j++) {
                for (int k = 0; k < 101; k++) {
                    int H=h[i]+abs(x[i]-j)+abs(y[i]-k);
                    int judge=0;
                    for (int l = 0; l < n; l++) {
                        if(H==h[l]+abs(x[l]-j)+abs(y[l]-k))judge++;
                        if(judge==n){
                            out.println(j+" "+k+" "+H);
                            exit(0);
                        }
                    }
                }
            }
        }
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