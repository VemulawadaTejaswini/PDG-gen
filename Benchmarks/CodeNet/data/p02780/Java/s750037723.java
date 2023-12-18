import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] pList = new int[n];
        double[] eList = new double[1000];
        for (int i = 0; i < n; i++) {
            pList[i] = sc.nextInt();
            if (eList[pList[i]] == 0) {
                double sum = 0;
                for (double j = 1; j <= pList[i]; j++) {
                    sum += j / pList[i];
                }
                eList[pList[i]] = sum;
            }
        }

        double ans = 0;

        for (int i = 0; i <= n - k ; i++) {
            double sum = 0;
            for (int j = 0; j < k; j++) {
                sum += eList[pList[i + j]];
            }
            ans = Math.max(ans, sum);
        }

        System.out.println(ans);
    }
}