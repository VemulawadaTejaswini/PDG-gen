import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] pList = new int[n];

        for (int i = 0; i < n ; i++) {
            pList[i] = sc.nextInt();
        }

        double ans = 0;

        for (int i = 0; i < k; i++) {
            ans +=  1 + (((double)pList[i] - 1) * 0.5);
        }
        double lastV = ans;

        for (int i = 1; i <= n - k ; i++) {
            double sum = lastV;
            sum -= (1 + (((double)pList[i - 1] - 1) * 0.5));
            sum += (1 + (((double)pList[i + k - 1] - 1) * 0.5));
            ans = Math.max(ans, sum);
            lastV = sum;
        }

        System.out.println(ans);
    }
}