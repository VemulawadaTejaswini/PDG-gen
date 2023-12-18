import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 0; i < 1000000000; i++) {
            N /= K;
            if (N == 0) {
                System.out.println(i + 1);
                return;
            }
        }

    }
}
