import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main
{
    static long dp[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String str1[]=br.readLine().split(" ");
        String str2[]=br.readLine().split(" ");
        dp=new long[str1.length][str1.length+2];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++)
                dp[i][j]=-1;
        long arr1[]=new long[n];
        long arr2[]=new long[n];
        for(int i=0;i<str1.length;i++) {
            arr1[i] = Long.parseLong(str1[i]);
            arr2[i] = Integer.parseInt(str2[i]);
        }
        System.out.println(calculate(arr1,arr2,0,-1));
    }

    private static long calculate(long[] arr1, long[] arr2, int index, int prev) {
        if(index>=arr1.length)
            return 0;
        if(dp[index][prev+1]!=-1)
            return dp[index][prev+1];
        if(prev==-1 || arr1[index]>arr1[prev])
        {
            return dp[index][prev+1]=Math.max(arr2[index]+calculate(arr1,arr2,index+1,index),calculate(arr1,arr2,index+1,prev));
        }
        else
        {
            return dp[index][prev+1]=calculate(arr1,arr2,index+1,prev);
        }
    }
}