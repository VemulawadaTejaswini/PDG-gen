
import java.util.Scanner;

class A {
    public static int[] is = {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};

    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int K = sc.nextInt() - 1;
        System.out.println(is[K - 1]);
    }
}
public class Main {
    public static void main(String... args) {
        A.main();
    }
}
