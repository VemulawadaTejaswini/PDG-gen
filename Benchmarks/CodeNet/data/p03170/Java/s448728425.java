import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Harry on 4/2/20.
 */
//https://atcoder.jp/contests/dp/tasks/dp_k
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = scanner.nextInt();
        }

        boolean[][] dp = new boolean[K+1][2];
        dp[0][0] = dp[0][1] = false;
        for(int i=1; i<=K; i++){
            for(int p=0; p<2; p++){
                for(int num : A){
                    if(num<=i && !dp[i-num][(p+1)%2]){
                        dp[i][p] = true;
                        break;
                    }
                }
            }
        }
        if(dp[K][0]){
            System.out.print("First");
        }
        else{
            System.out.print("Second");
        }
    }

}
