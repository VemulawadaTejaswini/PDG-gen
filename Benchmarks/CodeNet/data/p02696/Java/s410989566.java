import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();

        long max = 0;
        for (int x = 0;x <= N; x++) {
            long uhen = (A * x) / B;
            long sahen = A * (x / B);

            long result = uhen - sahen;
            if (max < result) {
                max = result;
            }
        }
        System.out.println(max);
    }
}