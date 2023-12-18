import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long hs[] = new long[N];
        for(int i = 0;i < N;i++)
            hs[i] = sc.nextLong();

        long dp[] = new long[N];
        //for(int i = 0;i < N;i++)
        //    dp[i] = Long.MAX_VALUE;
        dp[0] = 0;
        for(int i = 1;i < N;i++) {
            long min = Long.MAX_VALUE ;
            for(int h = 1;h <= K && i - h >= 0;h++){
                long tmp = dp[i - h] + Math.abs(hs[i] - hs[i - h]);
                if(min > tmp)
                    min = tmp;
            }
            dp[i] = min;
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
