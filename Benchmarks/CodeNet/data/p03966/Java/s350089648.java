import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        long ans = 1;
        long numOfT = 0;
        long numOfA = 0;
        for (int i = 0; i < n; i++) {
            long t = sc.nextLong();
            long a = sc.nextLong();

            while (ans % (t + a) != 0 || (ans / (t + a)) * t < numOfT || (ans / (t + a)) * a < numOfA) {
                ans++;
            }

            numOfT = (ans / (t + a)) * t;
            numOfA = (ans / (t + a)) * a;
        }
        System.out.println(ans);
    }
}
