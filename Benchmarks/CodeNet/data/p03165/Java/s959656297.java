import java.util.*;

class Main {

    static final Scanner in = new Scanner(System.in);

    static char s[], t[];
    static int dp[][];
    static int N, M;

    public static void main(String[] args) {

        String temp = in.next();
        s = temp.toCharArray();

        temp = in.next();
        t = temp.toCharArray();

        N = s.length;
        M = t.length;
        dp = new int[N + 1][M + 1];

        for (int i = 0; i <= N; i++)
            Arrays.fill(dp[i], -1);

        

        // ..filling the array with -1
        

        topDownLCS();
        Stack<Character> stack = new Stack<>(); 
        int i = N,j = M;
        while(i >0 && j > 0){
            if(s[i-1] == t[j-1]){
                stack.push(s[i-1]);
                i--;
                j--;
            }
            else{
                if(dp[i-1][j] > dp[i][j-1]){
                    i--;
                }
                else{
                    j--;
                }
            }
        }

        String lcs = "";
        while(!stack.isEmpty()){
            lcs += stack.pop();
        }
        System.out.println(lcs);

    }

    static void topDownLCS(){

        //..filling the 0th column with zeroes
        for (int i = 0; i <= N; i++)
            dp[i][0] = 0;

        //.. filling the 0th row with zeroes    
        for (int j = 0; j <= M; j++)
            dp[0][j] = 0;

        for(int n = 1;n <= N ;n++){

            for(int m = 1;m <= M;m++){

                if(s[n-1] == t[m - 1])
                    dp[n][m] = 1 + dp[n-1][m-1];
                else{
                    int ansA = dp[n-1][m];

                    int ansB = dp[n][m-1];

                    dp[n][m] = Math.max(ansA,ansB);
                }  

            }
        }
    }

    static int LCS(int n, int m) {

        // ..if atleast one of the strings are empty
        if (n == 0 || m == 0)
            return 0;

        if (dp[n][m] != -1)
            return dp[n][m];

        if (s[n - 1] == t[m - 1])
            dp[n][m] = 1 + LCS(n - 1, m - 1);
        else {
            // ..reduces size of string A by one
            int ansA = LCS(n - 1, m);

            // ..reduces size of string B by one
            int ansB = LCS(n, m - 1);

            dp[n][m] = Math.max(ansA, ansB);
        }

        return dp[n][m];
    }

}
