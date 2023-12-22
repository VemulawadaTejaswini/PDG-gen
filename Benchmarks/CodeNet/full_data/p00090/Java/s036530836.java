import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            double[] x = new double[n];
            double[] y = new double[n];
            for (int i = 0; i < n; i++) {
                String[] s = sc.next().split(",");
                x[i] = Double.parseDouble(s[0]);
                y[i] = Double.parseDouble(s[1]);
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (i != j && Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2) <= 4) {
                        count++;
                    }
                }
                max = Math.max(max, count);
            }
            System.out.println(max == 0 ? 0 : max + 1);
        }
    }
}
