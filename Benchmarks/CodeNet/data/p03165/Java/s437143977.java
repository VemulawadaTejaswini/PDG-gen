
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException{
        process();
    }
    public static void process() throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        char a[] = in.readLine().toCharArray();
        char b[] = in.readLine().toCharArray();
        String c= new String(a);
        String d= new String(b);
        int x = a.length;
        int y = b.length;
        String l=lcs(a, b, x, y);
        System.out.println(l);
    }
    public static String lcs(char a[],char b[],int x,int y) {
        int dp[][]=new int[x+1][y+1];
        for(int i=0;i<=x;i++) {
            for (int j = 0; j <= y; j++) {
                if (i == 0 || j  == 0)
                    dp[i][j] = 0;
                else if (a[i - 1] == b[j - 1])
                    dp[i][j] =1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        int index=dp[x][y];
        int i=x;
        int j=y;
        char ans[]=new char[index+1];
        while(i>0 && j>0){
            if(a[i-1]==b[j-1]){
                ans[index]=a[i-1];
                i--;
                j--;
                index--;
            }
            else if(dp[i-1][j]>dp[i][j-1])
                i--;
            else
                j--;
        }
        return new String(ans).trim();
    }
}
