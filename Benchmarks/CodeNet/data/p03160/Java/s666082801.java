import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long hs[] = new long[N];
        for(int i = 0;i < N;i++)
            hs[i] = sc.nextLong();

        long dp[] = new long[N];
        dp[0] = 0;
        for(int i = 1;i < N;i++) {
            if (i == 1)
                dp[i] = dp[i - 1] + Math.abs(hs[i] - hs[i - 1]);
            else
                dp[i] = Math.min(dp[i - 1] + Math.abs(hs[i] - hs[i - 1]),dp[i - 2] + Math.abs(hs[i] - hs[i - 2]));
        }

        System.out.println(dp[N - 1]);

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
