import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int n;
    private static float[] x;
    private static String[] u;

    private static final float btc = 380000.0f;

    public static void main(String[] args) {
        init();

        float sum = 0.0f;

        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextFloat();
            u[i] = scanner.next();

            if (u[i].equals("JPY")) {
                sum += x[i];
            } else if (u[i].equals("BTC")) {
                sum += (x[i] * btc);
            }
        }

        System.out.println(sum);
    }

    public static void init() {
        n = scanner.nextInt();
        x = new float[n];
        u = new String[n];
    }
}