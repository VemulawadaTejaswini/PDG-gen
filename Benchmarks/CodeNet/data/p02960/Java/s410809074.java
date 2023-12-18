import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
              int mod = 1000000000 + 7;
        Scanner scan = new Scanner(System.in);
        String v = scan.next();
        int[] dp = new int[13];
        int[] nx = new int[13];
        
        v = reverseS(v);
        for (int i = 0; i < v.length(); i++) {
            Arrays.fill(nx,0);
            for (int j = 0; j < 13; j++) {
                for (int k = 0; k < 10; k++) {
                    if(k == v.charAt(i)-'0' || v.charAt(i) == '?') {
                             nx[(j * 10 + k) % 13] = (nx[(j * 10 + k) % 13] + dp[j])%mod;

                    }
                }
            }

            for (int j = 0; j < 13; j++) {
                dp[j] = nx[j];
            }
        }
      
              System.out.println(dp[5]);


    }

    private static String reverseS(String v) {
        String rs = "";
        for (int i = v.length()-1; i >=0; i--) {
            rs+=v.charAt(i);
        }
        return rs;
    }
}
