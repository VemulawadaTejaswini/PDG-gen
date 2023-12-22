import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long m = 1l;

        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(sc.next());
            if (A[i] == 0) {
                sc.close();
                System.out.println(0);
                return;
            }
        }

        sc.close();
        long max = (long) Math.pow(10d, 18);

        for (int j = 0; j < N; j++) {
            m = m * A[j];
            if (m > max || m < 0l) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println((long) m);
    }
}
