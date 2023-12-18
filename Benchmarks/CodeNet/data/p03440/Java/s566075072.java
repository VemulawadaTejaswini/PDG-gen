import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main{

    static int[] uf;
    static int root(int v){
        if(uf[v]<0)return v;
        return uf[v]=root(uf[v]);
    }
    static int size(int v){
        return -uf[root(v)];
    }
    static void union(int u,int v){
        u = root(u);
        v = root(v);
        if(u==v)return;
        if(size(u)<size(v)){
            int tmp = u;
            u=v;
            v=tmp;
        }
        uf[u]+=uf[v];
        uf[v]=u;
    }
    static boolean same(int u,int v){
        return root(u)==root(v);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        class Node{
            int a,i;
            Node(int a,int i){
                this.a = a;
                this.i =i;
            }
        }
        List<Node> nlist = new ArrayList<>();
        for(int i=0;i<N;++i){
            int a = scan.nextInt();
            nlist.add(new Node(a,i));
        }
        nlist.sort((x,y) -> x.a-y.a);

        uf = new int[N];
        Arrays.fill(uf,-1);

        while(M-->0){
            int x = scan.nextInt();
            int y = scan.nextInt();
            union(x,y);
        }
        int index=-1;
        long res=0;
        for(int i=0;i<N;++i){
            if(index<0){
                index = i;
            }else{
                if(!same(nlist.get(index).i, nlist.get(i).i)){
                    union(nlist.get(index).i,nlist.get(i).i);
                    res =res +  (long)nlist.get(index).a + (long)nlist.get(i).a;
                    index = -1;
                }
            }
        }
        for(int i=1;i<N;++i){
            if(!same(0,i)){
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println(res);


    }
}