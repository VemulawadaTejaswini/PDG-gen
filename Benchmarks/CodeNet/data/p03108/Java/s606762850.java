import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int[] parent;
    static int[] sizes;
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] str = stdR.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int[] A = new int[M];
        int[] B = new int[M];
        for(int i = 0 ; i < M ; i++) {
            str = stdR.readLine().split(" ");
            A[i] = Integer.parseInt(str[0]) - 1;
            B[i] = Integer.parseInt(str[1]) - 1;
        }
        
        parent = new int[N];
        sizes = new int[N];
        for(int i = 0 ; i < N ; i++) {
            parent[i] = i;
            sizes[i] = 1;
        }
        
        long[] res = new long[M];
        res[res.length - 1] = (long)N * (N - 1) / 2;
        for(int i = res.length - 2 ; i >= 0 ; i--) {
            if(same(A[i + 1],B[i + 1])) {
               res[i] = res[i + 1];
               unit(A[i + 1],B[i + 1]);
            }else {
               res[i] = res[i + 1] - size(A[i + 1]) * size(B[i + 1]);
               unit(A[i + 1],B[i + 1]);
            }
        }
        
        for(int i = 0 ; i < res.length ; i++) {
            System.out.println(res[i]);
        }
    }
    
    public static int root(int x) {
        if(parent[x] == x)return x;
        return parent[x] = root(parent[x]);
    }
    
    public static void unit(int x,int y) {
        int rx = root(x);
        int ry = root(y);
        if (rx == ry)return;
        if(sizes[rx] < sizes[ry]) {
            int tmp = sizes[rx];
            sizes[rx] = sizes[ry];
            sizes[ry] = tmp;
        }
        
        parent[ry] = rx;
        sizes[rx] += sizes[ry];
        sizes[ry] = 0;
    }
    
    public static boolean same(int x,int y) {
        int rx = root(x);
        int ry = root(y);
        return rx == ry;
    }
    
    // データxが含まれる木の大きさを返す
    public static int size(int x) {
      return sizes[root(x)];
    }
}
