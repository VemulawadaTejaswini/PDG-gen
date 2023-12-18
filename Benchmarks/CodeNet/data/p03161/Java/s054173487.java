
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        process();
    }
    public static void process() throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(in.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int arr[]=new int[n];
        int dp[]=new int[n];
        st=new StringTokenizer(in.readLine()," ");
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(st.nextToken());
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        dp[1]=Math.abs(arr[1]-arr[0]);
        for(int i=2;i<n;i++) {
            int jump=0;
            for (int j = i - 1; j >= 0 && jump < k; jump++, j--){
                dp[i] = Math.min(dp[i], dp[j] + Math.abs(arr[i] - arr[j]));
            }
        }
        System.out.println(dp[n-1]);
    }
}
