import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int[] arr= new int[N];
        for (int x=0; x<N; x++){
            arr[x]= sc.nextInt();
        }
        int[] dp= new int[N];
        dp[1]= Math.abs(arr[0]-arr[1]);
        for (int x=2; x<N; x++){
            int val= arr[x];
            int last1= arr[x-1];
            int last2= arr[x-2];
            dp[x]= Math.min(dp[x-1] + Math.abs(last1-val), dp[x-2]+ Math.abs(last2-val));
        }
        System.out.println(dp[N-1]);
    }
}
