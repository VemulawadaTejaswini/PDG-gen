import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            int num = scn.nextInt();
            int arr[] = new int[num];
            for(int i = 0 ; i < num;i++){
                arr[i]= scn.nextInt();
            }
//        int num = 6;
//        int arr[] = {30, 10, 60, 10, 60, 50};
 
        int dp[] = new int[num];
        if(num==0){
            System.out.println(0);
        }else if(num==2) {
            dp[0] = 0;
            dp[1] = Math.abs(arr[1] - arr[0]);
            System.out.println(dp[1]);
        }else if(num==1){
            System.out.println(0);
        }else {
            System.out.println(minCostJump(arr, dp));
        }
 
    }
 
    private static int minCostJump(int[] arr, int[] dp) {
        for (int i = 2; i < arr.length; i++) {
            int curr = arr[i];
            if (Math.abs(curr - arr[i - 1]) <= Math.abs(curr - arr[i - 2])) {
                dp[i] = dp[i - 1] + Math.abs(curr - arr[i - 1]);
            } else {
                dp[i] = dp[i - 2] + Math.abs(curr - arr[i - 2]);
            }
        }
        return dp[dp.length - 1];
    }
}