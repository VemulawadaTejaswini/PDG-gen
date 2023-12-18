import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Codechef2
{
    static int dp[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[][]=new int[n][3];
        for(int i=0;i<n;i++)
        {
            String str[]=br.readLine().split(" ");
            int a=Integer.parseInt(str[0]);
            int b=Integer.parseInt(str[1]);
            int c=Integer.parseInt(str[2]);
            int ele[]={a,b,c};
            arr[i]=ele;
        }
        dp=new int[arr.length][4];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++)
                dp[i][j]=-1;
        System.out.println(calculate(arr,0,-1));


    }

    private static int calculate(int[][] arr, int index, int prev) {
        if(index>=arr.length)
            return 0;
        if(dp[index][prev+1]!=-1)
            return dp[index][prev+1];
        if(prev==-1)
            return dp[index][prev+1]= Math.max(arr[index][0]+calculate(arr,index+1,0),Math.max(arr[index][1]+calculate(arr,index+1,1),arr[index][2]+calculate(arr,index+1,2)));
        if(prev==0) {
            return dp[index][prev+1]= Math.max(arr[index][1] + calculate(arr, index + 1, 1), arr[index][2] + calculate(arr, index + 1, 2));
        }
            else if(prev==1)
        {
            return dp[index][prev+1]= Math.max(arr[index][0] + calculate(arr, index + 1, 0), arr[index][2] + calculate(arr, index + 1, 2));
        }
            else
            return dp[index][prev+1]= Math.max(arr[index][1] + calculate(arr, index + 1, 1), arr[index][0] + calculate(arr, index + 1, 0));


    }
}