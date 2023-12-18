import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        double[] exp = new double[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 1; j <= p[i]; j++) {
                sum += j;
            }
            exp[i] = (double) sum / p[i];
        }
        double ans = 0;
        for (int i = 0; i < n - k + 1; i++) {
            double sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += exp[j];
            }
            ans = Math.max(sum, ans);
        }
        System.out.println(ans);
    }

}
