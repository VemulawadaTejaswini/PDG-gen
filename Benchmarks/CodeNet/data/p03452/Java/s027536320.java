import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        long[][] x = new long[n][2];
        int[][] d = new int[m][3];

        UnionFindTree uft = new UnionFindTree(n);

        for(int i=0; i<m; i++){
            d[i][0] = sc.nextInt() - 1;
            d[i][1] = sc.nextInt() - 1;
            d[i][2] = sc.nextInt();
            uft.unite(d[i][0], d[i][1]);
        }
        sc.close();


        for(int i=0; i<n; i++){
            x[i][1] = uft.find(i);
            x[i][0] = Long.MAX_VALUE;
        }

        for(int i=0; i<m; i++){
            int l = d[i][0];
            int r = d[i][1];
            if(x[l][1] != x[r][1]) continue;

            if(x[l][0] == Long.MAX_VALUE){
                if(x[r][0] == Long.MAX_VALUE){
                    x[l][0] = 0;
                    x[r][0] = d[i][2];
                }else{
                    x[l][0] = x[r][0] - d[i][2];
                }
            }else{
                if(x[r][0] == Long.MAX_VALUE){
                    x[r][0] = x[l][0] + d[i][2];
                }else{
                    if(x[r][0] - x[l][0] != d[i][2]){
                        System.out.println("No");
                        return;
                    }
                }
            }
        }

        long[] min = new long[n];
        long[] max = new long[n];
        for(int i=0; i<n; i++){
            min[i] = Long.MAX_VALUE;
            max[i] = Long.MIN_VALUE;
        }

        for(int i=0; i<n; i++){
            long pos = x[i][0];
            int par = (int)x[i][1];
            if(pos == Long.MAX_VALUE){
                if(min[par] == Long.MAX_VALUE) min[par] = 0;
                if(max[par] == Long.MIN_VALUE) max[par] = 0;
            }else{
                if(pos < min[par]) min[par] = pos;
                if(pos > max[par]) max[par] = pos;
            }
        }

        for(int i=0; i<n; i++){
            if(min[i] == Long.MAX_VALUE) continue;

            if((long)(max[i]) - (long)(min[i]) > 1000000000){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

    }
}

class UnionFindTree{
    int[] par;
    int[] rank;

    public UnionFindTree(int size){
        par = new int[size];
        rank = new int[size];
        for(int i=0; i<size; i++){
            par[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int x){
        if(par[x] == x){
            return x;
        }else {
            return par[x] = find(par[x]);
        }
    }

    public void unite(int x, int y){
        x = find(x);
        y = find(y);
        if(x == y) return;

        if(rank[x] < rank[y]){
            par[x] = y;
        }else{
            par[y] = x;
            if(rank[x] == rank[y]) rank[x]++;
        }
    }

    public boolean same(int x, int y){
        return find(x) == find(y);
    }
}