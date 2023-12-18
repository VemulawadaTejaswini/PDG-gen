import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        if (N <= K) {
            System.out.println(N);
        } else {
            System.err.println(K - 1);
        }

    }
}
