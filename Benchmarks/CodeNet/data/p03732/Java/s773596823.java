import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int W = scanner.nextInt();

        ArrayList<Integer> ws = new ArrayList<>(N);
        ArrayList<Integer> vs = new ArrayList<>(N);

        for(int i=0; i<N; i++){
            ws.add(scanner.nextInt());
            vs.add(scanner.nextInt());
        }

        long[][] dp = new long[N+1][W+1];

        for(int i=1; i<N+1; i++){
            for(int j=0; j<W+1; j++){
                if(0 <= j - ws.get(i-1)){
                    dp[i][j] = Math.max(dp[i-1][j-ws.get(i-1)] + vs.get(i-1), dp[i-1][j]);
                    if(0 < j){
                        dp[i][j] = Math.max(dp[i][j], dp[i][j-1]);
                    }
                }else{
                    if(0 < j) {
                        dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                    }
                }
            }
        }

        System.out.println(dp[N][W]);
    }
}
