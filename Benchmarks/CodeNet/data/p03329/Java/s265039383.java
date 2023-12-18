import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();

        int[] c = new int[11];
        c[0] = 1;
        c[1] = (int) Math.pow(6, 1);
        c[2] = (int) Math.pow(9, 1);
        c[3] = (int) Math.pow(6, 2);
        c[4] = (int) Math.pow(9, 2);
        c[5] = (int) Math.pow(6, 3);
        c[6] = (int) Math.pow(9, 3);
        c[7] = (int) Math.pow(6, 4);
        c[8] = (int) Math.pow(9, 4);
        c[9] = (int) Math.pow(6, 5);
        c[10] = (int) Math.pow(9, 5);

        int[] t = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            t[i] = 100000000;
        }
        t[0] = 0;

        for (int i = 0; i < 11; i++) {
            for (int j = c[i]; j <= n; j++) {
                t[j] = Math.min(t[j], t[j - c[i]] + 1);
            }
        }

        System.out.println(t[n]);
    }
}
