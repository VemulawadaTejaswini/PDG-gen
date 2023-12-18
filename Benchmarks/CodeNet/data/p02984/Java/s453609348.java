import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        long osum = 0;
        long esum = 0;
        long tmp;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
            if (i % 2 == 1) {
                osum += a[i];
            } else {
                esum += a[i];
            }
        }
        tmp = esum - osum;
        System.out.print(tmp + " ");
        for (int i = 1; i < n; i++) {
            tmp = 2 * a[i-1] - tmp;
            System.out.print(tmp + " ");
        }
    }
}

