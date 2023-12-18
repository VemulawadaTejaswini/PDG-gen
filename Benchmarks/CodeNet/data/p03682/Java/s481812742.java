import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] x = new int[n][2];
        int[][] xpos = new int[n][2];
        int[][] ypos = new int[n][2];
        for(int i=0; i<n; i++){
            x[i][0] = sc.nextInt();
            x[i][1] = sc.nextInt();
            xpos[i][0] = i;
            xpos[i][1] = x[i][0];
            ypos[i][0] = i;
            ypos[i][1] = x[i][1];
        }
        
        Arrays.sort(xpos, (a, b) -> Integer.compare(a[1], b[1]));
        Arrays.sort(ypos, (a, b) -> Integer.compare(a[1], b[1]));

        int[][] xroad = new int[n*2-2][3];
        for(int i=0; i<n-1; i++){
            xroad[i*2][0] = xpos[i][0];
            xroad[i*2][1] = xpos[i+1][0];
            xroad[i*2][2] = xpos[i+1][1] - xpos [i][1];
            xroad[i*2+1][0] = ypos[i][0];
            xroad[i*2+1][1] = ypos[i+1][0];
            xroad[i*2+1][2] = ypos[i+1][1] - ypos [i][1];
        }

        Arrays.sort(xroad, (a, b) -> Integer.compare(a[2], b[2]));

        UnionFindTree uft = new UnionFindTree(n);
        long ans = 0;

        for(int i=0; i<n*2-2; i++){
            int[] thisroad = xroad[i];
            if(!uft.same(thisroad[0], thisroad[1])){
                ans += thisroad[2];
                uft.unite(thisroad[0], thisroad[1]);
            }
        }

        System.out.println(ans);

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