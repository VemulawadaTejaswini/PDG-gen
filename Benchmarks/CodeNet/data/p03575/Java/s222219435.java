import java.util.*;
//System.out.println("")

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i=0; i<m; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i=0; i<m; i++){
            UF.init();　//初期化
            //一つ辺を除外してつなげてみる。
            for(int j=0; j<m; i++){
                if(i!=j){
                    UF.unite(a[j], b[j]);
                }
            }
            //グラフが非連結なら根は違う。
            //つまり分断されているということなので除外した辺は橋。
            for(int j=2; j<=n; j++){
                //根が同じかを確認して違うならばカウントしてBreak
                if(!UF.same(1,j)){
                    ++ans;
                    break;
                }
            }
    
        }
        System.out.println(ans);
    }
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
//class UnionFindTree{
//     
//    int[] par;
//    int[] rank;
//    
//    //Constractor
//    public UnionFindTree(int size){
//        this.par = new int[size];
//        this.rank = new int[size];
//        
//        for(int i=0; i<size; i++){
//            makeSet(i);
//        }
//    }
//    
//    public void makeSet(int i){
//        par[i] = i;
//        rank[i] = 0;
//    }
//    
//    public void union(int x, int y){
//        int xRoot = find(x);
//        int yRoot = find(y);
//        
//        //xが属する木のほうが大きいとき
//        if(rank[xRoot]>rank[yRoot]){
//            par[yRoot] = xRoot;
//        }else if (rank[xRoot] < rank[yRoot]){
//            par[xRoot] = yRoot;
//        }else if(xRoot != yRoot){
//            par[yRoot] = xRoot;
//            rank[xRoot]++;
//        }
//    }
//    
//    public int find(int i){
//        if(i != par[i]){
//            par[i] = find(par[i]);
//        }
//        return par[i];
//    }
//    
//    public boolean same(int x, int y){
//        return find(x) == find(y);
//    }
//
//}