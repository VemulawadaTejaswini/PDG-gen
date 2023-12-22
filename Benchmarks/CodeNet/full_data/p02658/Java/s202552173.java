import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Long[] a = new Long[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        for (int i = 0; i < n; i++) {
            if (i != 0) {
                a[i] = a[i] * a[i-1];
            }
        }

        if (a[n-1] <= Math.pow(10,18)) {
            System.out.println(a[n - 1]);
        } else {
            System.out.println(-1);
        }
    }
}
