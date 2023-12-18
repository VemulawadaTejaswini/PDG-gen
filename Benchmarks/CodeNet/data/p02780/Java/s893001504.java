
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        double[] means = new double[N];

        for (int i = 0; i < N; i++) {
            means[i] = (1.0d + sc.nextInt()) / 2;
        }
        double[] s = new double[N + 1];
        for (int i = 0; i < N; i++) {
            s[i + 1] = means[i] + s[i];
        }

        double max = 0;
        for (int i = 0; i + K <= N; i++) {
            double current = s[i + K] - s[i];
            if (max < current) {
                max = current;
            }
        }
        System.out.println(max);
    }
}
