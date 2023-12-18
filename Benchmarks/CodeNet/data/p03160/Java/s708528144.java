import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String[] list = reader.readLine().split(" ");
        int[] a = new int[N];
        for(int h=0;h<N;h++){
            a[h] =Integer.parseInt(list[h]);
        }
        int[] dp =new int[N];
        dp[0] = 0;
        dp[1] = Math.abs(a[1]-a[0]);
        for(int i=2;i<N;i++){
            dp[i] =Math.min(dp[i-2]+Math.abs(a[i]-a[i-2]),dp[i-1]+Math.abs(a[i]-a[i-1]));
        }
        System.out.println(dp[N-1]);
    }
}

