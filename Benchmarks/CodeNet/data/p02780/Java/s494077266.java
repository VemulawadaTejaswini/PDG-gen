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

        for (int i = 0; i <= n - k ; i++) {
            double sum = 0;
            for (int j = 0; j < k; j++) {
                sum += 1 + (((double)pList[i + j] - 1) * 0.5) ;
            }
            ans = Math.max(ans, sum);
        }

        System.out.println(ans);
    }
}