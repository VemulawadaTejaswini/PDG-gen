
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        int M;
        int[] am;
        int[] bm;
        int[][] cibi;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            M = sc.nextInt();
            am = new int[M];
            bm = new int[M];
            cibi = new int[M][];
            for(int i =0;i < M;i++){
                am[i] = sc.nextInt();
                bm[i] = sc.nextInt();
                cibi[i] = new int[bm[i]];
                int v = 0;
                for(int temp :cibi[i]){
                    cibi[i][v] = sc.nextInt();
                    v++;
                }

            }
        }
        long dp[] = new long[1 << N];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1000000009;
        }
        dp[0] =0;
        //鍵 1→Mまで
        for(int i=1;i<=M;i++){
            //i番目を使って移動する集合
            int set = 0;
            for(int j = 0;j < cibi[i-1].length;j++){
                set = set | (1 << (cibi[i-1][j] -1));
            }
            for(int s = 0;s < (1<<N);s++){
                if(dp[s|set] > dp[s]+am[i-1]){
                    dp[s|set] =dp[s]+am[i-1];
                }
            }

        }
        if(dp[(1 << N)-1] == 1000000009){
            dp[(1 << N)-1] = -1;
        }

        System.out.println(dp[(1 << N)-1]);

    }

}
