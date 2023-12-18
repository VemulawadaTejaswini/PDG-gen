import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            double[] x = new double[N];
            String[] u = new String[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextDouble();
                u[i] = in.next();
            }

            double sum = 0;
            for (int i = 0; i < N; i++) {
                if (u[i].equals("JPY")) {
                    sum += x[i];
                } else {
                    sum += x[i] * 380000;
                }
            }

            System.out.println(sum);
        }
    }
}
