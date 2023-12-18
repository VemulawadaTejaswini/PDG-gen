import java.util.Scanner;

class Main{
    static int dp(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(arr[0]-arr[1]);
        for(int i=2;i<n;i++){
            dp[i] = Math.min(dp[i-1]+Math.abs(arr[i]-arr[i-1]),dp[i-2]+Math.abs(arr[i]-arr[i-2]));

        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(dp(arr));
        
    }
}