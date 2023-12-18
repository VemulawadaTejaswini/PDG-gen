import java.util.Scanner;
import java.util.Arrays;
class Main{
    static int pare[];
    static int root(int v){
        if(pare[v]<0)return v;
        return pare[v]=root(pare[v]);
    }
    static void unite(int u, int v){
        u=root(u);
        v=root(v);
        if(u==v)return;
        if(pare[u]<pare[v]){
            int tmp=u;
            u=v;v=tmp;
        }
        pare[v]+=pare[u];
        pare[u]=v;
    }
    static boolean same(int u, int v){
        return root(u)==root(v);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M =scan.nextInt();
        int p[] = new int[N+1];

        pare = new int[N+1];
        Arrays.fill(pare, -1);
        for(int i=0;i<N;++i)p[i+1]=scan.nextInt();
        while(M-->0){
            int x = scan.nextInt();
            int y = scan.nextInt();
            unite(x,y);
        }
        int cnt = 0;
        for(int i=N;i>=1;--i){
            if(same(i, p[i]))++cnt;
        }
        System.out.println(cnt);

    }
}