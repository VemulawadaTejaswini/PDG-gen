import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int a = i;
            int b = N - 1;

            int sum = 0;
            while (a > 0) {
                sum += a % 10;
                a /= 10;
            }

            while (b > 0) {
                sum += b % 10;
                b /= 10;
            }
            min = Math.min(sum, min);
        }
        System.out.println(min);
    }
}
