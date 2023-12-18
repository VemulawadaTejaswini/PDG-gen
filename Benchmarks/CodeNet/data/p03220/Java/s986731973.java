import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), t = sc.nextInt(), a = sc.nextInt();
        int h[] = new int[n];
        int ans = 0;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            double tmpMin = Math.abs(a - (t - h[i] * 0.006));
            if (tmpMin < min) {
                min = tmpMin;
                ans = i;
            }
        }
        System.out.println(ans + 1);
    }
}