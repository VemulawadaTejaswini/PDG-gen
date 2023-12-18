import java.io.*;
import java.util.*;


class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int INF = (int)1e9;
        int N;
        int M;
        N = sc.nextInt();
        M = sc.nextInt();

        int[][] ans = new int[M + 1][(int)Math.pow(2,N)];
        for (int[] hoge : ans) {
            Arrays.fill(hoge, INF);
        }
        for (int[] hoge : ans) {
            hoge[0] = 0;
        }

        int add;
        int p;
        for(int i = 1 ; i < M+1 ; i++){
            int cost = sc.nextInt();
            int num = sc.nextInt();

            add = 0;
            for(int j = 0 ; j < num ; j++){
                p = sc.nextInt();
                add += (int)Math.pow(2, p-1);
            }
            for(int j = 0; j < ans[i].length; j++) {
                if(ans[i-1][j] != INF) {
                    int idx = j | add;
                    ans[i][idx] = Math.min(ans[i][idx], ans[i-1][j] + cost); 
                    ans[i][j] = Math.min(ans[i][idx], ans[i-1][j]); 
                }
            }

        }
        if(ans[M][(int)Math.pow(2,N)-1] == INF) ans[M][(int)Math.pow(2,N)-1] = -1;
        System.out.println(ans[M][(int)Math.pow(2,N)-1]);
    }
}
