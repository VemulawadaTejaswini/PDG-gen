


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //dp[i] = max(dp[i-1],dp[i-wi]+vi);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();

        long[] weights = new long[N];
        int[] values = new int [N];
        //long[] dp = new long[W+1];
        List<Long> dp = new LinkedList<>();

        for(int i=0;i<N;i++) {
            weights[i] = sc.nextLong();
            values[i] = sc.nextInt();
        }
        for(int i=0;i<=W;i++){
            dp.add(0L);
        }

        for(int i=0;i<N;i++){
            for(int j=W;j>=0;j--){
                if(j>=weights[i]) {
                    dp.set(j, Math.max(dp.get(j), dp.get((int)(j - weights[i])) + (long)values[i]));
                }
                else{
                    //dp[j] = dp[j];
                }
            }
        }

        System.out.println(dp.get(W));

        sc.close();

    }

}
