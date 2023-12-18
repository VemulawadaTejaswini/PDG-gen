import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        char[][] grid=new char[h][w];
        for(int i=0;i<h;i++)
        {
            grid[i]=sc.next().toCharArray();
        }
        int[][] dp=new int[h+1][w+1];
        for(int i=0;i<=h;i++)
        {
            dp[i][0]=1;

        }
        for(int i=0;i<=w;i++)
        {
            dp[0][i]=1;

        }
        if(grid[0][0]=='#'){
            dp[1][1]=1;
        }
        for(int i=1;i<=h;i++)
            for(int j=1;j<=w;j++)
            {
                if(i==1&&j==1)continue;
                dp[i][j]=Integer.MAX_VALUE;
                    if((i==1|| grid[i-2][j-1]==grid[i-1][j-1]))
                    dp[i][j]=Math.min(dp[i][j],dp[i-1][j]);
                    else dp[i][j]=Math.min(dp[i][j],dp[i-1][j]+1);

                    if((j==1 || grid[i-1][j-2]==grid[i-1][j-1]))
                        dp[i][j]=Math.min(dp[i][j],dp[i][j-1]);
                    else dp[i][j]=Math.min(dp[i][j],dp[i][j-1]+1);
            }
        System.out.println(dp[h][w]);
    }
}