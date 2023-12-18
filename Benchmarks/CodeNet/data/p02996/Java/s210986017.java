import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
            out.flush();
        }
    }

    void solve(InputReader in, PrintWriter out) {
        int N = in.nextInt();
        List<Task> taskList = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            taskList.add(new Task(a, b));
        }
        taskList.sort((x, y) -> Integer.compare(x.B, y.B));

        long currentTime = 0;
        for (Task task : taskList) {
            currentTime += task.A;

            if (currentTime > task.B) {
                out.println("No");
                return;
            }
        }

        out.println("Yes");
    }
}

class Task {
    int A;
    int B;

    Task(int a, int b) {
        A = a;
        B = b;
    }
}

class InputReader implements AutoCloseable {
    private final Scanner sc = new Scanner(System.in);

    String next() {
        return this.sc.next();
    }

    int nextInt() {
        return Integer.parseInt(this.sc.next());
    }

    long nextLong() {
        return Long.parseLong(this.sc.next());
    }

    double nextDouble() {
        return Double.parseDouble(this.sc.next());
    }

    @Override
    public void close() {
        this.sc.close();
    }
}
