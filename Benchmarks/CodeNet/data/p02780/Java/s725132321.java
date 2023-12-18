import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        double[] p = new double[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextDouble();
        }
        double max = 0.0;
        int index = 0;
        for (int i = 0; i < n - k + 1; i++) {
            double sum = 0.0;
            for (int j = i; j < i + k; j++) {
                sum += p[j];
            }
            if(sum > max) {
                index = i;
                max = sum;
            }
        }
        double ans = 0.0;
        for (int i = index; i < index + k; i++) {
            double tmp = (p[i] + 1.0) / 2.0;
            ans += tmp;
        }
        System.out.println(ans);
    }
}