import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long K = scanner.nextLong();
        int[] A = new int[N];

        long g = 0;
        long h = 0;
        long tmp = 0;
        long tmp2 = 0;
        for (int i = 0; i < N; i++) {
            int f = scanner.nextInt();
            A[i] = f;
        }
        for (int j = 0; j < N - 1; j++) {
            for (int i = j; i < N; i++) {
                if(A[j] > A[i]) {
                    g++;
                }
            }
        }
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                if(A[j] > A[i]) {
                    h++;
                }
            }
        }

        g += tmp;
        h += tmp2;

        long ans = ((g % 1000000007) * (K % 1000000007)) % 1000000007;
        ans = (ans + (h % 1000000007) * ((K*(K-1)/2) % 1000000007)) % 1000000007;
//        ans = (ans + (total % 1000000007) * (m % 1000000007)) % 1000000007;

        System.out.println(ans);

    }
}
