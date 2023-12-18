import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public int findMaxHappiness(int[][]a, int n) {
        int[][]dp = new int[n][3];
        for(int i=0;i<3;++i) {
            dp[0][i]=a[0][i];
        }
        for(int i=1;i<n;++i) {
            for(int j=0;j<3;++j) {
                dp[i][j]=a[i][j]+Math.max(dp[i-1][(j+1)%3],dp[i-1][(j+2)%3]);
            }
        }
        return Math.max(dp[n-1][0],Math.max(dp[n-1][1],dp[n-1][2]));
    }

    public static void main(String[] args) {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        String input = null;
        try {
            input=reader.readLine();
            int n = Integer.parseInt(input);
            int[][] a = new int[n][3];
            for(int i=0;i<n;++i) {
                String[] row = reader.readLine().split(" ");
                for(int j=0;j<3;++j) {
                    a[i][j]=Integer.parseInt(row[j]);
                }
            }
            Main c = new Main();
            System.out.println(c.findMaxHappiness(a,n));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}