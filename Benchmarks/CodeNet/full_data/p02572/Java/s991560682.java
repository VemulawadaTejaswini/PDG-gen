import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(sc.next());
        }
        long sum = 0;
        long mod = 1000000007;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                sum = (sum + ((A[i] % mod) * (A[j] % mod) % mod)) % mod;
            }
        }
        System.out.println(sum);
    }
}
