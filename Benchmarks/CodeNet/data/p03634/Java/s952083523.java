import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
    int N, Q, K;
    int[] x, y;
    ArrayList<Cost>[] list;
    long[] fromK;
    void solve(){
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        list = new ArrayList[N];
        fromK = new long[N];
        for(int i = 0; i < N; i++){
            list[i] = new ArrayList<>();
        }
        for(int i = 0; i < N - 1; i++){
            int a = in.nextInt() - 1, b = in.nextInt() - 1, c = in.nextInt();
            list[a].add(new Cost(b, c));
            list[b].add(new Cost(a, c));
        }
        Q = in.nextInt(); K = in.nextInt() - 1;
        x = new int[Q]; y = new int[Q];
        for(int i =0; i < Q; i++){
            x[i] = in.nextInt() - 1;
            y[i] = in.nextInt() - 1;
        }
        in.close();
        dfs(K, -1, 0);
        for(int i = 0; i < Q; i++){
            System.out.println(fromK[x[i]] + fromK[y[i]]);
        }
    }

    void dfs(int pos, int parent, long cost){
        fromK[pos] = cost;
        for(Cost c : list[pos]){
            if(c.to == parent){
                continue;
            }
            dfs(c.to, pos, cost + c.cost);
        }
    }
    public static void main(String[] args) {
        new Main().solve();
    }
}

class Cost{
    int to;
    int cost;
    Cost(int t, int c){
        to = t; cost = c;
    }
}