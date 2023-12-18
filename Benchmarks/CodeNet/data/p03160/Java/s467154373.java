import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c[] = new int[n];
        int dp[] = new int[n];
        for(int i=0;i<n;i++) {
            c[i] = sc.nextInt();
        }
        for(int i = n-1 ;i>=0;i--) {
            if(i == n-1) dp[i] = 0;
            else {
                int cn = Integer.MAX_VALUE;
                int cnn = Integer.MAX_VALUE;
                if((i+1) < n) cn = Math.abs((c[i] - c[i+1])) + dp[i+1];
                if((i+2) < n) cnn = Math.abs((c[i] - c[i+2])) + dp[i+2];
                //System.out.println("i "+ i + " cn " + cn + " cnn " + cnn);
                dp[i] = Math.min(cn, cnn);
            }
        }
        //for(int i=0;i<n;i++) System.out.print(dp[i] + " ");
        System.out.println(dp[0]);
    }
}