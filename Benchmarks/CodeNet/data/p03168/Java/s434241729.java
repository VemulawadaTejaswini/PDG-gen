import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] probs = new double[n];
        for(int i = 0 ; i < n ; i++) {
            probs[i] = scan.nextDouble();
        }

        double[] dp = new double[n+1];
        dp[0] = 1; // probability of 0 heads is one when there is no coin toss - Obvious. 
            // intuition : cumulative probability of current num of heads is = 
            //             probability of current head * probability of head-1 times 
            //             + probability of current tail * probability of head times.
            //Also as soon as one more coin toss gets added to the set - we have to 
            //compute all the cumulative probabilities again as they must have changed as well with this 
            // new member in the set.

        for(int toss = 0 ; toss < n ; toss++){
            for(int heads = toss+1 ; heads >= 0 ; heads--) {
                if(heads > 0 ) {
                    dp[heads] =  dp[heads-1] * probs[toss] +  dp[heads] * (1-probs[toss]);
                } else {
                    dp[heads] = dp[heads]*(1-probs[toss]); // 0 heads so only tails to work.
                }
            }
        }

        // now count the probabilities when heads are more.
        double answer = 0.0;
        for(int i = n ; i > n/2 ; i--) {
            answer += dp[i];
        }
        System.out.println(answer);
    }
}
