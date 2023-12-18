import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int ary[] = new int[n];
        int srt[] = new int[n];

        for (int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
            srt[i] = ary[i];
        }

        Arrays.sort(srt);
        int a = srt[(n - 1) / 2];
        int b = srt[n / 2];

        for (int i = 0; i < n; i++) {
            System.out.println(ary[i] <= a ? b : a);
        }
    }
}
