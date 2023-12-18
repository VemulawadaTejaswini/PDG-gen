import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int N, M;
        {int[] a = in.ii(); N = a[0]; M = a[1];}
        int[] p = in.ii();
        UnionFind uf = new UnionFind(N+1);
        for(int i = 0; i < M; i++){
            int[] a = in.ii();
            uf.unite(a[0], a[1]);
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(null);
        int[] id = new int[N+1];
        for(int i = 1; i <= N; i++){
            int root = uf.root(i);
            if(id[root] == 0){
                id[root] = list.size();
                ArrayList<Integer> lst = new ArrayList<>();
                lst.add(i);
                list.add(lst);
            } else {
                list.get(id[uf.par[i]]).add(i);
            }
        }
        int ans = 0;
        int K = list.size();
        for(int i = 1; i < K; i++){
            ArrayList<Integer> lst = list.get(i);
            HashSet<Integer> hs = new HashSet<>(lst);
            int k = lst.size();
            for(int j = 0; j < k; j++){
                hs.add(p[lst.get(j)-1]);
            }
            ans += 2*k-hs.size();
        }
        out.println(ans);
        out.flush();
    }
    
    static class UnionFind{
        int[] par, rank, size;
        private final int MAX_N;
        UnionFind(int n){
            MAX_N = n;
            par = new int[n];
            size = new int[n];
            for(int i = 1; i < MAX_N; i++)
                par[i] = i;
            Arrays.fill(size, 1);
            rank = new int[n];
        }

        int root(int x){
            return par[x] == x ? x : (par[x] = root(par[x]));
        }
        
        boolean isRoot(int x){
            return par[x] == x;
        }

        boolean same(int x, int y){
            return root(x) == root(y);
        }

        void unite(int x, int y){
            x = root(x);
            y = root(y);
            if(x == y)
                return;
            if(rank[x] < rank[y]){
                par[x] = y;
                size[y] += size[x];
            }else{
                par[y] = x;
                size[x] += size[y];
                if(rank[x] == rank[y])
                    rank[x]++;
            }
        }

        int size(int x){
            return size[root(x)];
        }
    }

    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s(){
            try{return readLine();}catch(IOException e){return "";}
        }

        String[] ss(){
            return s().split(" ");
        }

        int i(){
            return Integer.parseInt(s());
        }

        int[] ii(){
            String[] ss = ss();
            int[] ii = new int[ss.length];
            for(int j = 0; j < ss.length; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }

        ArrayList<Integer> li(){
            String[] ss = ss();
            ArrayList<Integer> li = new ArrayList<>();
            for(int j = 0; j < ss.length; j++) li.add(Integer.parseInt(ss[j]));
            return li;
        }

        long l(){
            return Long.parseLong(s());
        }

        long[] ll(){
            String[] ss = ss();
            long[] ll = new long[ss.length];
            for(int j = 0; j < ss.length; j++) ll[j] = Long.parseLong(ss[j]);
            return ll;
        }
    }
}
