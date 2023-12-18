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
        int[] node=new int[n+1];
        //頂点1,2,3,...,n
        //探索済み→node[i]=-1,未探索→node[i]=0
        //0はジャマなのではじめから探索済みにしておく
        node[0]=-1;
        //各頂点iに対し、そことつながっている頂点j,k,...をbridge[i]=j,k....で表す
        ArrayList<Integer>[] bridge=new ArrayList[n+1];
        for (int i = 1; i <=n ; i++) {
            bridge[i]=new ArrayList<Integer>();
        }
        int m=sc.nextInt();
        int[] a=new int[m+1];
        int[] b=new int[m+1];
        for (int i = 1; i <=m ; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for(int i=1;i<=m;i++){
            bridge[a[i]].add(b[i]);
            bridge[b[i]].add(a[i]);
        }
        int ans=0;
        for (int i = 1; i <=m; i++) {
            //i番目の辺を削除
            bridge[a[i]].remove((Integer)b[i]);
            bridge[b[i]].remove((Integer)a[i]);
            //条件を満たすか確認、満たすなら++ans
            if(bfs(node,bridge))++ans;
            //i番目の辺を復元
            bridge[a[i]].add(b[i]);
            bridge[b[i]].add(a[i]);
        }
        out.println(ans);
    }
    //グラフをBFS
    static boolean bfs(int[] node,ArrayList[] x){
        Queue<Integer> q=new ArrayDeque<Integer>();
        //未探索→探索済みの回数をカウント(新たに頂点を探索したら++sum)
        //つまり、sumは「探索することができた頂点の個数」である
        int n=node.length-1;
        //初期化
        for(int i=1;i<=n;i++){
            node[i]=0;
        }
        //もし全体が連結ならば最終的にsum==nとなるはず
        int sum=0;
        //頂点1から探索開始
        q.add(1);
        while(q.size()>0) {
            int tempnode = q.poll();
            //未探索かどうか判定
            if (node[tempnode] == 0) {
                //探索済みにする
                node[tempnode] = -1;
                ++sum;
                //隣接する頂点をQueueに入れる（BFSですね）
                for (Object k : x[tempnode]) {
                    q.add((Integer) k);
                }
            }
        }
        //グラフが非連結になっているかどうか判定（非連結になっていれば題意を満たします）
        return sum!=n;
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