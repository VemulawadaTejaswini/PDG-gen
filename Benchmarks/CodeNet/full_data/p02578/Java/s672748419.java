import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long[] A = new long[N];
        long count = 0;

        A[0] = s.nextLong();
        for (int i = 1; i < N; i++) {
            A[i] = s.nextLong();
            if (A[i - 1] > A[i]) {
                count += (A[i - 1] - A[i]);
                A[i] = A[i - 1];
            }
        }

        System.out.println(count);
    }
}