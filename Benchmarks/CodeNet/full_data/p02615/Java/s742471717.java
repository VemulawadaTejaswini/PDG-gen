import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // in
            int N = Integer.parseInt(sc.next());
            Integer[] A = new Integer[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(sc.next());
            }
            Arrays.sort(A, Collections.reverseOrder());
            A[A.length - 1] = 0;

            // calc
            long sum = 0L;
            for (int a : A) {
                sum += a;
            }
            System.out.println(sum);
        }
    }
}