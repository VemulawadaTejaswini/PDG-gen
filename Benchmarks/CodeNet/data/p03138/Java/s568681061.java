import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long K = Long.parseLong(sc.next());
        long A[] = new long[N];

        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(sc.next());
        }

        long max = 0;
        for (int i = 0; i <= K; i++) {
            long sum = 0;
            for (int j = 0; j < A.length; j++) {
                sum += i ^ A[j];
            }
            if (max < sum) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}
