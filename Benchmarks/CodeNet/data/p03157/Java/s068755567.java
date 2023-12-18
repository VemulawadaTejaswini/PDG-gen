import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        char[][] f=new char[h][w];
        for (int i = 0; i < h; i++) {
            f[i]=sc.next().toCharArray();
        }
        UF.init();
        int[] dx={-1,0,1,0};
        int[] dy={0,-1,0,1};
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int p=w*i+j;
                for (int k = 0; k < 4; k++) {
                    int x=j+dx[k];
                    int y=i+dy[k];
                    if(r(h,w,x,y)){
                        if(f[i][j]!=f[y][x]){
                            UF.unite(p,y*w+x);
                        }
                    }
                }
            }
        }
        long[] white=new long[w*h];
        long[] black=new long[w*h];
        long ans=0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int p=i*w+j;
                if(f[i][j]=='.')white[UF.root(p)]++;
                else black[UF.root(p)]++;
            }
        }
        for (int i = 0; i < w*h; i++) {
            ans+=white[i]*black[i];
        }
        out.println(ans);
    }
    static boolean r(int h,int w,int x,int y){
        return 0<=x&&x<w&&0<=y&&y<h;
    }
    static class UF{
        static int size=400*400;
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