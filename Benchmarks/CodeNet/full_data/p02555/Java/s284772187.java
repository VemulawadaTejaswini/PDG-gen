import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(buffer.readLine());
        long [] dp = new long[sum+1];
        dp[0] = 1;
        int MOD = (int)1e9 + 7;
        for (int currSum = 1; currSum <= sum; currSum++) {
            for (int firstNum = 3; firstNum <= sum; firstNum++) {
                if (currSum >= firstNum)
                    dp[currSum] = (dp[currSum]%MOD+dp[currSum-firstNum]%MOD)%MOD;
            }
        }
        System.out.println(dp[sum]);
    }
}
