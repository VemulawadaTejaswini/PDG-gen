import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
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

            final Set<Integer> input = IntStream.rangeClosed(1, n).map(i -> scanner.nextInt()).boxed()
                    .collect(Collectors.toSet());
            System.out.println(input.size());
        }
    }
}
