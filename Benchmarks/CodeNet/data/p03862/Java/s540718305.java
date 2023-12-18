import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long x = scanner.nextLong();

        long[] a = new long[N];

        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextLong();
        }

        long eaten = 0;

        for (int i = 0; i < N - 1; i++) {
            long a_left = a[i];
            long a_right = a[i + 1];
            if (a_left + a_right <= x) {
                // ok
            } else {
                // 食べないといけない
                long diff = (a_left + a_right) - x;
                if (diff > a_right) {
                    long leftEat = diff - a_right;
                    a[i] = a[i] - leftEat;
                    a[i + 1] = 0;
                } else {
                    a[i + 1] = a[i + 1] - diff;
                }
                eaten += diff;
            }
        }

        System.out.print(eaten);
    }
}
