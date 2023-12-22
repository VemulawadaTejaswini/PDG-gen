import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] A = new long[N];


        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();

            if (A[i] == 0L) {
                System.out.println(0);
                return;
            }
        }

        long res = A[0];
        long max = 1000000000000000000L;

        for (int i = 1; i < N; i++) {
            if(res == 0){
                break;
            }

            if (res * A[i] > max) {
                System.out.println(-1);
                return;
            }
            res *= A[i];
        }

        System.out.println(res);

    }
}
