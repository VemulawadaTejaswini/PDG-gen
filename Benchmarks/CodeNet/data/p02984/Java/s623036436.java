import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
            sum += a[i];
        }

        for (int i = 0; i < n; i++) {
            long tmp = sum;
            for (int j = 1; j < n; j++) {
                if (j % 2 == 1) {
                    tmp -= 2*a[(i + j) % n];
                }
            }
            System.out.print(tmp + " ");
        }
    }
}

