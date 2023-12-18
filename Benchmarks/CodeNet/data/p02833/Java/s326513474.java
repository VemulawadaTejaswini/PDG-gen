import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        String nStr = Long.toString(n);
        long result = 0; // nが奇数の時は常に0個
        if(n%2 == 0) {
            // 途中に出てくる10の倍数の数字の、末尾の0の個数の合計
            int len = nStr.length();
            long[] dp = new long[len+1];
            dp[0] = 0;
            // 10の位の数字から見始める
            for(int i=1; i<len; i++) {
                int digit = Integer.parseInt(nStr.substring(len-i-1, len-i));
                result += digit*dp[i-1] + digit * i;
                dp[i] = (dp[i-1]*10) + (9*i);
            }
        }
        System.out.println(result);
    }
}
