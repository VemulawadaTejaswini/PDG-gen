import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    long gcd(long a, long b) {
        return b > 0 ? gcd(b, a % b) : a;
    }

    long lcm(long x, long y) {
        return x / gcd(x, y) * y;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        long l = 1;
        for (int i = 0; i < N; i++) {
            l = lcm(Math.max(l, a[i]), Math.min(l, a[i]));
        }

        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += (l - 1) % a[i];
        }

        System.out.println(ans);
        return;
    }

}