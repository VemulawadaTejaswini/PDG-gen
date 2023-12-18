import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sum = new int[n];
        int[] arr = new int[n];
        int ans = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sum[0] = arr[0];
        for(int i = 1; i < n; i++){
            sum[i] = sum[i-1] + arr[i];
            if(sum[i-1] < 0 && sum[i] <= 0){
                ans += -sum[i] + 1;
                sum[i] += -sum[i] + 1;
            }else if(sum[i-1] > 0 && sum[i] >= 0){
                ans += sum[i] + 1;
                sum[i] -= sum[i] + 1;
            }
//            System.out.println(sum[i]);
        }
        System.out.println(ans);
    }
}