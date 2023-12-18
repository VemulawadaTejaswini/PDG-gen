import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static BigInteger dp[][] = new BigInteger[901][901];

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int P = scan.nextInt();

        int even = 0;
        int odd = 0;
        for (int i : IntStream.range(0, N).toArray()) {
            if(scan.nextInt() % 2 ==0 ){
                even++;
            }
            else {
                odd++;
            }
        }
        long evenPartern =(long) Math.pow(2, even);
        long oddPatern = 0;
        for (int i :IntStream.range(0, odd+1).toArray()){
            if(P == 0 && i % 2 == 1) {
                continue;
            }
            if(P == 1 && i % 2 == 0) {
                continue;
            }
            oddPatern += comb(odd, i).intValue();
        }
        System.out.println(evenPartern*oddPatern);
    }

    private static BigInteger comb(int n, int k) {
        if (n < 2 * k) {
            k = n - k;
        }
        if (dp[n][k] != null) {
            return dp[n][k];
        }
        BigInteger m = BigInteger.ONE;
        for (int i : IntStream.range(1, k + 1).toArray()) {
            m = m.multiply(BigInteger.valueOf((n - i + 1)));
        }
        for (int i : IntStream.range(1, k + 1).toArray()) {
            m = m.divide(BigInteger.valueOf(i));
        }
        dp[n][k] = m;
        return m;
    }

}
