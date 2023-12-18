import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner cin = new Scanner(System.in);
        N = cin.nextInt();
        M = cin.nextInt();
        Q = cin.nextInt();
        L = new int[M];
        R = new int[M];
        for (int i = 0;i < M;i ++){
            L[i] = cin.nextInt();
            R[i] = cin.nextInt();
        }
        p = new int[Q];
        q = new int[Q];
        for (int i = 0;i < Q;i ++){
            p[i] = cin.nextInt();
            q[i] = cin.nextInt();
        }

        calc();
    }

    int N, M, Q;
    int[] L, R;
    int[] p, q;
    int[][] table;
    void calc(){
        //table[i][j] : L=i, R=jとなる列車がいくつあるか
        table = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++){
            table[L[i]][R[i]]++;
        }
        for (int i = 0; i < Q; i ++){
            System.out.println(query(p[i], q[i]));
        }
    }
    //区間[l, r]に含まれる列車の数を返す
    int query(int p, int q){
        int ans = 0;
        //L,Rが両方ともp以上q以下であるものを探す
        for (int i = p; i <= q; i++){
            for (int j = p; j <= q; j++){
                ans += table[i][j];
            }
        }
        return ans;
    }

}
