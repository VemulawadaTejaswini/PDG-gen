import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int M = sc.nextInt();
        final int[] X = new int[M];
        for (int i = 0; i < M; i++) {
            X[i] = sc.nextInt();
        }

        Arrays.sort(X);

        final int[] dist = new int[M-1];
        for (int i = 0; i < M-1; i++) {
            dist[i] = Math.abs(X[i+1] - X[i]);
        }

        System.out.println(IntStream.of(dist).sorted().limit(Math.max(0, M-N)).sum());
    }
}
