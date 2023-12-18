import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }

        int base = (int) Math.pow(3, N);

        int even = (int) IntStream.of(A).filter(a -> a % 2 == 0).count();
        System.out.println(base - (int) Math.pow(2, even));
    }
}
