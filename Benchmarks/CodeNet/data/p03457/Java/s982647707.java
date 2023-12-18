import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] t = new int[N + 1];
            int[] x = new int[N + 1];
            int[] y = new int[N + 1];

            for (int i = 1; i <= N; i++) {
                t[i] = in.nextInt();
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }

            for (int i = 1; i <= N; i++) {
                if (Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1]) > t[i] - t[i - 1]) {
                    System.out.println("No");
                    return;
                }
                int t2 = (t[i] - t[i - 1]) - Math.abs(x[i] - x[i - 1]) - Math.abs(y[i] - y[i - 1]);
                if (t2 % 2 == 1) {
                    System.out.println("No");
                    return;
                }
            }

            System.out.println("Yes");
        }
    }
}
