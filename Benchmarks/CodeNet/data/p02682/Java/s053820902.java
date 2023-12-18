import java.util.*;

class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long A, B, C, K;
        long sum = 0;
        A = sc.nextLong();
        B = sc.nextLong();
        C = sc.nextLong();
        K = sc.nextLong();

        if (A >= K) {
            sum = sum + K;
            K = K - A;
        }
        if (B >= K) {

            K = K - B;
        }
        if (C >= K) {
            sum = sum - K;
            K = K - C;
        }

        System.out.println(sum);

    }
}