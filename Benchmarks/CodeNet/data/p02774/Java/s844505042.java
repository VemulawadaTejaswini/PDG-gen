import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        long[] A = new long[N];
        ArrayList<Long> mul = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // 一旦普通にやってみる
        for (int i = 0; i < N; i++) {
            for (int j = N - 1 ; i < j ; j--) {
                System.out.println(i + ", " + j);
                mul.add(A[i] * A[j]);
            }
        }
        

        mul.sort(Long::compareTo);

        System.out.println(mul.size());
        System.out.println("-----");
        mul.forEach(System.out::println);

        System.out.println("-----");
        System.out.println(mul.get(K-1));
    }
}
