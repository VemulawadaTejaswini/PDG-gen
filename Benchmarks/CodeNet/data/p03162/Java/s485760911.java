import java.util.*;
import java.io.*;
import java.lang.*;
// ArrayList<Integer>[] arr=new ArrayList[n];
public class Main_c{	
public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner s = new Scanner(System.in);
         StringBuilder sb=new StringBuilder();
         BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
         int n=s.nextInt();
        int[][] act=new int[n+1][3];
        int[][] dp=new int[n+1][2]; dp[0][0]=5;
        for(int i=1;i<=n;i++){
            act[i][0]=s.nextInt();act[i][1]=s.nextInt();act[i][2]=s.nextInt();
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<3;j++){
                if(j!=dp[i-1][0]&&dp[i-1][1]+act[i][j]>dp[i][1]){
                        dp[i][1]=dp[i-1][1]+act[i][j];
                        dp[i][0]=j;
                }
            }
        }

        System.out.println(dp[n][1]);
    }
}