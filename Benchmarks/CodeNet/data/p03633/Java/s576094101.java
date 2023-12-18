import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long res = 1L;

        for (int i = 0; i < N; i++) {
            long T = in.nextLong();
            res = lcm(T, res);
        }

        System.out.println(res);
    }

    static long lcm(long A, long B) {
        return A / gcm(A, B) * B;
    }

    static long gcm(long A, long B) {
        if (A > B) {
            long tmp = A;
            A = B;
            B = tmp;
        }

        if (B % A == 0) {
            return A;
        }

        return gcm(A, B % A);
    }
}

