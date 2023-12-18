import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextLong();
        }

        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                for (int i = 0; i < n; i++) {
                    long hh = h[i] + Math.abs(x[i] - cx) + Math.abs(y[i] - cy);
                    boolean allMatched = true;
                    for (int j = 0; j < n; j++) {
                        if (hh - Math.abs(x[j] - cx) - Math.abs(y[j] - cy) != Math.max(h[j], 0)) {
                            allMatched = false;
                            break;
                        }
                    }
                    if (!allMatched) {
                        continue;
                    }
                    System.out.println(cx + " " + cy + " " + h);
                    return;
                }
            }
        }
    }

}
