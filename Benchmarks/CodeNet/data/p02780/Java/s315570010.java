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
        double[] exp = new double[1001];
        double sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
            exp[i] = sum / i;
        }
        double ans = 0;

        for (int i = 0; i < n - k + 1; i++) {
            double expsum = 0;
            for (int j = i; j < i + k; j++) {
                expsum += exp[p[j]];
            }
            ans = Math.max(expsum, ans);
        }
        System.out.println(ans);
    }

}
