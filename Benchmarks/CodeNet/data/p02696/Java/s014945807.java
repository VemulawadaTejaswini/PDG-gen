import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();
        sc.close();

        long max = 0;
        for (int x = 4; x <= N; x++) {
            long letMax = (long) (A * x / B) - A * (long) (x / B);
            if (letMax >= max) {
                max = letMax;
            }
        }

        System.out.println(max);
    }
}