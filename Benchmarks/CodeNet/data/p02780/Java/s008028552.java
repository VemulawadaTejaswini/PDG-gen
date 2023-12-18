import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        double[] arr = new double[n];
        double[] accSum = new double[n+1];
        double ans = 0;

        for (int i=0; i<n; i++){
            int tmp = sc.nextInt();
            if (tmp%2==0) {
                arr[i] = tmp/2 + 0.5;
            }else {
                arr[i] = tmp/2 + 1;
            }
        }

        accSum[1] = arr[0];
        for (int i=2; i<n+1; i++){
            accSum[i] = accSum[i-1]+arr[i-1];
        }

        for (int i=0; i<n-k+1; i++){
            double tmp = accSum[i+k] - accSum[i];
            ans = Math.max(ans, tmp);
        }

        System.out.println(ans);


    }
}
