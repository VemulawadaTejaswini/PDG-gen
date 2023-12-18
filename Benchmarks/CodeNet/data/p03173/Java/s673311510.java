import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class gfg
{
    static long prefix[];
    static long dp[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        prefix=new long[str.length+1];
        long arr[]=new long[str.length];
        for(int i=0;i<str.length;i++)
            arr[i]=Long.parseLong(str[i]);
        preprocess(arr);
        dp=new long[arr.length+1][arr.length+1];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++)
                dp[i][j]=-1;
//        System.out.println(Arrays.toString(prefix));
        System.out.println(calculate(arr,0,arr.length-1));

    }

    private static void preprocess(long arr[]) {
        for(int i=0;i<arr.length;i++)
        {
            prefix[i+1]=prefix[i]+arr[i];
        }

    }

    private static long calculate(long[] arr, int i, int j) {
        if(i==j)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        long min=Long.MAX_VALUE;
        long sum=prefix[j+1]-prefix[i];
        for(int k=i;k<j;k++)
        {
            long c1=calculate(arr,i,k);
            long c2=calculate(arr,k+1,j);
            min=Math.min(min,sum+c1+c2);
        }
        return dp[i][j]=min;
    }
}