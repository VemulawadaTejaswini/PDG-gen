import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] h1 = reader.readLine().split(" ");
        int N = Integer.parseInt(h1[0]);
        int K = Integer.parseInt(h1[1]);
        String[] list = reader.readLine().split(" ");
        int[] a = new int[N];
        for(int h=0;h<N;h++){
            a[h] =Integer.parseInt(list[h]);
        }
        int[] dp =new int[N];
        dp[0] = 0;
        dp[1] = Math.abs(a[1]-a[0]);
        for(int i=2;i<N;i++){
            int min = Integer.MAX_VALUE;
            for(int a1 = Math.max(0,i-K);a1<i;a1++){
                if(dp[a1]+Math.abs(a[i]-a[a1])<min){
                    min = dp[a1]+Math.abs(a[i]-a[a1]);
                }
            }
            dp[i] =min;
        }
        System.out.println(dp[N-1]);
    }
}

