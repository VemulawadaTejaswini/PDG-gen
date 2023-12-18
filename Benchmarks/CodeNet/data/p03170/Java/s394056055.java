import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int dp[] = new int[k+1];

        for(int i=1;i<=k;i++){
            int f = 0;
            for(int j=0;j<arr.length;j++){
                if(i-arr[j] >= 0 && dp[i-arr[j]] == 0){
                    f = 1;
                    break;
                }
            }
            if(f == 1) dp[i] = 1;
            else dp[i] = 0;
        }

        if(dp[k] == 1) System.out.println("First");
        else System.out.println("Second");

    }
}