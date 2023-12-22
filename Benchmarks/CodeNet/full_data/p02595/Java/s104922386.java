import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int N = sc.nextInt();
        int D = sc.nextInt();
        double[] X = new double[N];
        double[] Y = new double[N];
        double[] X2 = new double[N];
        double[] Y2 = new double[N];
        double[] K = new double[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextDouble();
            Y[i] = sc.nextDouble();
            X2[i] = X[i]*X[i];
            Y2[i] = Y[i]*Y[i];
            K[i] = Math.sqrt(X2[i] + Y2[i]);
            if (K[i] <= D) {
                c = c + 1;
            } else {
                c = c;
            }
        }
        System.out.println(c);
    }
}