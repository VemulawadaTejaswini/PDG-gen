import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();

        int Ws[] = new int[N + 1];
        int Vs[] = new int[N + 1];
        long dp[][] = new long[N + 1][W + 1];
        for(int i = 0;i < N;i++){
            Ws[i] = sc.nextInt();
            Vs[i] = sc.nextInt();
        }

        for(int i = 0;i < N;i++){
            for(int w = 0;w <= W;w++){
                if(w >= Ws[i])
                    dp[i + 1][w] = Math.max(dp[i][w - Ws[i]] + Vs[i],dp[i][w]);
                else
                    dp[i + 1][w] = dp[i][w];
            }
        }

        System.out.println(dp[N][W]);
    }










    public static Integer min(List<Integer> ar){
        int min = 10000;
        int index = 0;
        for(int i = 0; i< ar.size();i++){
            if(min > ar.get(i)){
                min = ar.get(i);
                index = i;
            }
        }
        return min;
    }
}
