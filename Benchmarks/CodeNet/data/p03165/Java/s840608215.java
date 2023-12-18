import java.util.Scanner;

class Main {
    private static String getMax(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];
        for(int i = 1; i <= a.length(); i++) {
            for(int j = 1; j <= b.length(); j++) {
                if(a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        int R = a.length();
        int C = b.length();
        StringBuilder ans = new StringBuilder("");
        while(R > 0 && C > 0) {
            if(dp[R][C] == dp[R - 1][C]) {
                R--;
            } else if(dp[R][C] == dp[R][C - 1]) {
                C--;
            } else {
                ans.insert(0, a.charAt(R - 1));
                R--;
                C--;
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(getMax(a, b));
    }
}
