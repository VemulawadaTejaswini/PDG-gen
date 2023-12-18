import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char[] arr1 = in.nextLine().toCharArray();
        char[] arr2 = in.nextLine().toCharArray();
        in.close();
        StringBuilder sb = new StringBuilder();
        int len1 = arr1.length, len2 = arr2.length;
        
        int[][] dp = new int[len1+1][len2+1];
        String[][] res = new String[len1+1][len2+1];
        for(int i = 0; i <= len2; i++){
            res[0][i] = "";
        }
        for(int i = 0; i <= len1; i++){
            res[i][0] = "";
        }
        
        for(int i = 1; i <= len1; i++)
        {
            for(int j = 1; j <= len2; j++)
            {
                if(arr1[i-1] == arr2[j-1])
                {   
                    dp[i][j] = 1 + dp[i-1][j-1];
                    res[i][j] = res[i-1][j-1] + arr1[i-1];
                }
                else{
                    if(dp[i-1][j] > dp[i][j-1]){
                        dp[i][j] = dp[i-1][j];
                        res[i][j] = res[i-1][j];
                    }
                    else{
                        dp[i][j] = dp[i][j-1];
                        res[i][j] = res[i][j-1];
                    }

                }
            }
        }
        // System.out.println(dp[len1][len2]);
        System.out.println(res[len1][len2]);
    }
}