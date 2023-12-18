
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        String S;
        int Mod = 1000000007;

        try (Scanner sc = new Scanner(System.in)) {
            S = sc.next();
        }

        long[][] dp = new long[S.length()+1][13];
        dp[0][0] = 1;
        int result = 0;
        char[] arr = S.toCharArray();
        int row = 1;
        for(char c : arr){
            if(c == '?'){
                for(int i = 0; i <13;i++){
                    long temp = dp[row -1][i];
                    for(int k = 0; k <=9;k++){
                        int col = ((i * 10) + k) %13;
                        dp[row][col] += temp;
                        dp[row][col] = dp[row][col]%Mod;
                    }
                }
            }else{
                int k = toInt(c);
                for(int i = 0; i <13;i++){
                    long temp = dp[row -1][i];
                    int col = ((i * 10) + k) %13;
                    dp[row][col] += temp;
                    dp[row][col] = dp[row][col]%Mod;
                }
            }
            row++;
        }
        //System.out.println(Arrays.toString(dp[S.length()]));
        System.out.println(dp[S.length()][5]);

    }

    private static int toInt(char c){
        return c - 0x30;
    }

}
