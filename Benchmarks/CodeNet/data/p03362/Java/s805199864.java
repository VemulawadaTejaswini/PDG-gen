import java.util.Scanner;
import java.util.StringJoiner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        int i;
        for (i = 3; count < n && i <= 55_555; i += 2) {
            boolean tmp = true;
            if (i % 5 != 1) {
                tmp = false;
            }
            if (tmp) {
                for (int j = 3; j <= Math.sqrt(i); j += 2) {
                    if (i % j == 0) {
                        tmp = false;
                        break;
                    }
                }
            }
            if (tmp) {
                arr[count] = i;
                count++;
            }
        }
        StringJoiner sj = new StringJoiner(" ");
        for (int prime : arr) {
            sj.add(String.valueOf(prime));
        }
        System.out.println(sj.toString());
    }
}