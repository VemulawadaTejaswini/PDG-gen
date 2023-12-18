import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] typeCount = new int[K+1];
        int[][] j = new int[K+1][N];
        for(int i = 0; i < N; i++){
            int c = sc.nextInt();
            int v = sc.nextInt();
            typeCount[c]++;
            j[c][typeCount[c]] = v;
        }
        long[][] sum = new long[K+1][N];
        for(int i = 1; i <= K; i++){
            if(j[i] != null){
                Arrays.sort(j[i]);
                for(int m = N-1; m >= N - typeCount[i]; m--){
                    sum[i][N -m] += sum[i][N -m -1] + j[i][m];
                }
            }
        }

        long[][] dp = new long[K+1][N+1];
        int count = 0;
        for(int a = 1; a <= K; a++){
            count += typeCount[a];
            for(int b = 2; b <= count; b++){
                for(int e = 2; e <= Math.min(typeCount[a], b); e++){
                    if(b - e == 0 || dp[a-1][b - e] != 0) dp[a][b] = Math.max(dp[a-1][b], dp[a-1][b - e] + sum[a][e]);
                    else dp[a][b] = Math.max(dp[a-1][b], dp[a][b]);
                }
            }
        }

        for(int i = 1; i <= N; i++){
            if(dp[K][i] == 0)System.out.println(-1);
            else System.out.println(dp[K][i]);
        }
        sc.close();
    }

}
