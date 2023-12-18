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

            final int[] allInput = IntStream.rangeClosed(1, n).map(i -> scanner.nextInt() * -1).sorted().toArray();
            int aliceScore = 0;
            int bobScore = 0;
            for (int i = 0; i < allInput.length; i++) {
                if (i % 2 == 0) {
                    aliceScore += allInput[i];
                } else {
                    bobScore += allInput[i];
                }
            }
            System.out.println(bobScore - aliceScore);
        }
    }
}