import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(final String[] args) {
        final Task task = new Task();
        task.solve();
    }
}

class Task {

    public void solve() {
        try(final Scanner scanner = new Scanner(System.in);) {
            final int n = scanner.nextInt();
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();

            final int sum = IntStream.rangeClosed(1, n).parallel().filter(i -> {
                int sumEachDigit = 0;
                int j = i;
                while (j > 0) {
                    sumEachDigit += j % 10;
                    j /= 10;
                }
                return (a <= sumEachDigit && sumEachDigit <= b);
            }).sum();
            System.out.println(sum);
        }
    }
}