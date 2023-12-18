import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long count = N - 1;
        for (long i = 1; i <= (N / 2) + 1; i++) {
            double value = N / (double) (i);
            if (Math.floor(value) == Math.ceil(value)) {
                count = Math.min(count, i - 1 + (long) Math.floor(value) - 1);
            }
        }

        System.out.println(count);
    }
}