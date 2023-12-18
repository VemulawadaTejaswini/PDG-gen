import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long count = N;
        for (long i = 0; i <= (N / 2) + 1; i++) {
            double value = N / (i + 1);
            if (Math.floor(value) == Math.ceil(value)) {
                count = Math.min(count, i + (long) value);
            }
        }

        System.out.println(count);
    }
}