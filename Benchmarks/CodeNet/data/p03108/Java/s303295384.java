import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();   
        int N, M;
        {int[] a = r.ii(); N = a[0]; M = a[1];}
        int[][] p = new int[M][];
        for(int i = 0; i < M; i++)
            p[i] = r.ii();
        UnionFind uf = new UnionFind(N);
        
        int[] ans = new int[M];
        ans[M-1] = N*(N-1)/2;        

        for(int i = M-1; i > 0; i--){
            int[] pi = p[i];
            int a = pi[0]-1;
            int b = pi[1]-1;
            if(uf.same(a,b))
                ans[i-1] = ans[i];
            else{
                ans[i-1] = ans[i]-uf.size(a)*uf.size(b);
                uf.unite(a, b);
            }
        }
        
        StringBuilder sb = new StringBuilder(2*M);
        for(int i = 0; i < M; i++){
            sb.append(ans[i]);
            sb.append("\n");
        }
        
        print(sb);
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
    
    static void print(Object o){
        System.out.print(o.toString());
    }
    static void println(Object o){
        System.out.println(o.toString());
    }
    static int Int(String s){
        return Integer.parseInt(s);
    }
    static long Long(String s){
        return Long.parseLong(s);
    }
    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return s().split(" ");
        }
        int i() throws IOException{
            return Int(s());
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }
        long l() throws IOException{
            return Long(s());
        }
        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long.parseLong(ss[j]);            
            return ll;
        }
    }
}