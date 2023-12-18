import java.util.*;
import java.io.*;
class Pair
{
    int x;
    int y;
    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("\\s");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(s[i]);
        }
        Pair[][] dp = new Pair[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {   
                dp[i][j] = new Pair(-1, -1);
            }
        }
        for(int i = 0; i < n; i++)
        {
            dp[i][i].x = arr[i];
            dp[i][i].y = 0;
            
        }
        for(int i = 0; i < n-1; i++)
        {
            int max = Math.max(arr[i], arr[i+1]);
            int min = Math.min(arr[i], arr[i+1]);
            dp[i][i+1].x = max;
            dp[i][i+1].y = min;
        }
        for(int i = 2; i < n; i++)
        {
            int r = 0;
            int c = i;
            while(c < n)
            {
                if(arr[r] + dp[r+1][c].y > arr[c] + dp[r][c-1].y)
                {
                    dp[r][c] = new Pair(arr[r] + dp[r+1][c].y, dp[r+1][c].x);
                }
                else
                {
                    dp[r][c] = new Pair(arr[c] + dp[r][c-1].y, dp[r][c-1].x);
                }
                r++;
                c++;
            }
        }
        /*for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(dp[i][j].x+","+dp[i][j].y+" ");
            }
            System.out.println();
        }*/
        System.out.println(dp[0][n-1].x - dp[0][n-1].y);
    }
}