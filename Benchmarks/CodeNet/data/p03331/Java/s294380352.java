import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long ret = Long.MAX_VALUE;

        for (int a = 1; a <= N / 2; a++) {
            int b = N - a;

            int atmp = a;
            int btmp = b;
            long sum = 0;

            while (atmp > 0) {
                sum += atmp % 10;
                atmp /= 10;
            }

            while (btmp > 0) {
                sum += btmp % 10;
                btmp /= 10;
            }

            ret = Math.min(ret, sum);
        }

        System.out.println(ret);
    }
}