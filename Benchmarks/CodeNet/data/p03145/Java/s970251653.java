import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        final Task task = new Task();
        task.solve();
    }
}

class Task {

    public void solve() {
        try(final Scanner scanner = new Scanner(System.in);) {
            final int ab = Integer.parseInt(scanner.next());
            final int bc = Integer.parseInt(scanner.next());

            System.out.println(ab * bc / 2);
        }
    }
}