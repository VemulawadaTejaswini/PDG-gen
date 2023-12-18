import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1]= Math.abs(arr[1]-arr[0]);

        for(int i=2;i<n;i++){
            int temp = Integer.MAX_VALUE;
            int x = Math.max(0, i-k);
            for(int j=x; j<i;j++){

                int y = Math.abs(arr[i]-arr[j]);
                temp = Math.min(temp,(dp[j]+y));
                //System.out.println(temp+" "+arr[i]+" "+y+" "+arr[j]);
            }
            dp[i] = temp;


        }

//        for(int i=0;i<n;i++){
//            System.out.print(dp[i]+" ");
//        }
//        System.out.println();

        System.out.println(dp[n-1]);
    }
}
