
import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    private void exec(int[] x, int i, int j) {
        ++x[i];
        --x[j];
    }

    private void run() {
        int N = sc.nextInt();
        int[] x = new int[3];
        x[0] = sc.nextInt();
        x[1] = sc.nextInt();
        x[2] = sc.nextInt();

        boolean ans = true;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            if (!ans) {
                continue;
            }

            if (s.equals("AB")) {
                if (x[0] > x[1]) {
                    exec(x, 1, 0);
                    result.add("B");
                } else {
                    exec(x, 0, 1);
                    result.add("A");
                }
            } else if (s.equals("BC")) {
                if (x[1] > x[2]) {
                    exec(x, 2, 1);
                    result.add("C");
                } else {
                    exec(x, 1, 2);
                    result.add("B");
                }
            } else {
                if (x[0] > x[2]) {
                    exec(x, 2, 0);
                    result.add("C");
                } else {
                    exec(x, 0, 2);
                    result.add("A");
                }
            }

            if (x[0] < 0 || x[1] < 0 || x[2] < 0) {
                ans = false;
            }
        }

        if (ans) {
            System.out.println("Yes");
            result.forEach(System.out::println);
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
