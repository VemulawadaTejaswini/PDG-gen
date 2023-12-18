import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long costs[][] = new long[N][3];
        for(int i = 0;i < N;i++){
            for(int h = 0;h < 3;h++)
                costs[i][h] = sc.nextLong();
        }

        long dp[][] = new long[N + 1][3];

        for(int i = 0;i < N;i++){
            for(int h = 0;h < 3;h++){
               for(int j = 0;j < 3;j++)
                   if(h != j)
                       dp[i + 1][h] = Math.max(dp[i + 1][h],dp[i][j] + costs[i][h]);
            }
        }

        System.out.println(Math.max(Math.max(dp[N][0],dp[N][1]),dp[N][2]));
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
