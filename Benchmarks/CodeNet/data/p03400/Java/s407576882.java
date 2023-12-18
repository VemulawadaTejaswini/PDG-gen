import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scan;

    private static void start() {
        scan = new Scanner(java.lang.System.in);

    }

    private static void finish() {

    }


    public static void main(String[] args) {
        start();

        int n = scan.nextInt();
        int d = scan.nextInt();
        int x = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        int totalChoc = 0;
        for (int i = 0; i < n; i++) {
            int q = 1;
            int choc = 0;
            while (q <= d) {
                q += a[i];
                choc++;
            }
            totalChoc += choc;
        }
        System.out.println(totalChoc + x);

        finish();
    }
}
