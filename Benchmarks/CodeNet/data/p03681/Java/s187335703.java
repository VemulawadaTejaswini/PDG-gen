import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        if (Math.abs(N - M) > 1) {
            System.out.println(0);
            return;
        } else if (N == M) {
            System.out.println(fact(N) * fact(M) % (1000000000 + 7) * 2 % (1000000000 + 7));
        } else {
            System.out.println(fact(N) * fact(M) % (1000000000 + 7));
        }
    }

    static long fact(int n) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i % 1000000000 + 7) % (1000000000 + 7);
        }
        return ans;
    }
}
