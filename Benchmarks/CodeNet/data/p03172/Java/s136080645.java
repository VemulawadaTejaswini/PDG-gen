import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main
{
    static int dp[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int m=Integer.parseInt(str[1]);
        String s[]=br.readLine().split(" ");
        int arr[]=new int[s.length];
        for(int i=0;i<s.length;i++)
            arr[i]=Integer.parseInt(s[i]);
        int k=Integer.parseInt(str[1]);
        dp=new int[k+1][arr.length+1];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++)
                dp[i][j]=-1;
        System.out.println(calculate(arr,0,k));
    }

    private static int calculate(int[] arr, int index, int k) {
        if(index==arr.length-1)
        {
            if(k<=arr[index])
                return 1;
            else return 0;
        }
        if(dp[k][index]!=-1)
            return dp[k][index];
        int res=0;
        for(int i=0;i<=arr[index];i++)
        {
            res+=calculate(arr,index+1,k-i);
        }
        return dp[k][index]= res;
    }
}