import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    Scanner sc = new Scanner(System.in);

    void show(final int[] xs) {
        if (xs != null) {
            String out =
                    Arrays.stream(xs)
                            .mapToObj(Integer::toString)
                            .collect(Collectors.joining(" "));
            System.out.println(out);
        }
    }

    void solve() {
        // Input
        int n = sc.nextInt();
        int[] R = new int[n];
        for (int i = 0; i < n; i++) {
            R[i] = sc.nextInt();
        }

        // Solve
        int swapCount = 0;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i; j < n; j++) {
                if (R[j] < R[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = R[i];
            R[i] = R[minIndex];
            R[minIndex] = tmp;
            if (i != minIndex) {
                swapCount++;
            }
        }
        // Output
        show(R);
        System.out.println(swapCount);
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}

