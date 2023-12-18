import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[][] RL = new int[N+1][N+1];
        int[] D = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            D[R]++;
            RL[R][L]++;
        }
        for (int i = 0; i < Q; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int ans = 0;
            for (int j = p; j <= q; j++) {
                if(D[j]>0){
                    for(int k=0;k<=j;k++){
                        if(RL[j][k]>0&&k>=p){
                            ans+=RL[j][k];
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}