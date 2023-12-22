import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();

        long sum = 0;
        if (A >= K) {
            System.out.println(A);
        } else {
            int localK = K - A;
            if (B >= localK) {
                System.out.println(A);
            } else {
                int tempK = localK - B;
                System.out.println(A - tempK);
            }
        }
    }
}