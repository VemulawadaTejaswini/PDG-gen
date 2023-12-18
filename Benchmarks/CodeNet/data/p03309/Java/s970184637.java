import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt() - (i + 1);
        }
        Arrays.sort(a);
        int b = a[a.length / 2];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.abs(a[i] - b);
        }
        System.out.println(sum);
    }
}
