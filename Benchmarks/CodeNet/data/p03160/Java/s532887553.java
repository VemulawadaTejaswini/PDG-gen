import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        for(int i=0;i<n;i++){
            input[i] = sc.nextInt();
        }

        int[] dp = new int[n];

        dp[0] = 0;

        for(int i=1;i<n;i++){
            if(i==1){
                dp[i] = Math.abs(input[i] - input[i-1]);
            }else{
               int a =  dp[i-1] + Math.abs(input[i] - input[i-1]);
               int b =  dp[i-2] + Math.abs(input[i] - input[i-2]);
               if(a>b){
                   dp[i] = b;
               }else{
                   dp[i] = a;
               }
            }
        }

//        for (int i=0;i<n;i++){
//            System.out.println(dp[i]);
//        }

        System.out.println(dp[n-1]);

    }
}
