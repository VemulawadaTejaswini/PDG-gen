import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long findMin(int n, int k, int[] a) {
        long[] dp = new long[n+1];
        dp[1]=0;
        dp[2]=Math.abs(a[2]-a[1]);
        for(int i=3;i<n+1;++i) {
            long minVal=Integer.MAX_VALUE;
            for(int j=1;j<=k&&i-j>=1;++j) {
                minVal = Math.min(dp[i-j] + Math.abs(a[i] - a[i-j]), minVal);
            }
            dp[i]=minVal;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        InputStreamReader r=new InputStreamReader(System.in);
        String[] input=null;
        BufferedReader reader = new BufferedReader(r);
        try {
            input = reader.readLine().split(" ");
            int n= Integer.parseInt(input[0]);
            int k= Integer.parseInt(input[1]);
            int[] a= new int[n+1];
            String nums = reader.readLine();
            String [] nums1 = nums.split(" ");
            for(int i=0;i<nums1.length;++i) {
                a[i+1]=Integer.parseInt(nums1[i]);
            }
            System.out.println(findMin(n,k,a));
        } catch(IOException e) {

        }

    }
}