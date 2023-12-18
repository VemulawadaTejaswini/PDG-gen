import java.util.*;
import java.io.*;
import java.lang.*;
// ArrayList<Integer>[] arr=new ArrayList[n];
public class Main{	
public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner s = new Scanner(System.in);
         StringBuilder sb=new StringBuilder();
         BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
         int n=s.nextInt(),w=s.nextInt();
        int[][] arr=new int[n+1][2];
        long[][] dp=new long[n+1][w+1]; 
        //dp[i][j] holds given set of i points what is max_value we can get from a 
        //subset of given points satisfying the constrain ∑(x co-ord of points)<=j  (1<=k<=i)
        for(int i=1;i<=n;i++){
            arr[i][0]=s.nextInt(); arr[i][1]=s.nextInt();
        }

       /* for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                if(arr[i][0]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],arr[i][1]+dp[i-1][j-arr[i][0]]);
                }
            }
        }*/

        for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                if(arr[i][0]>i){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],arr[i][1]+dp[i-1][j-arr[i][0]]);
                }
            }
        }
        System.out.println(dp[n][w]);
    }
}
