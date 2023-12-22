import java.util.Scanner;

class Main {
    private static long gcd(long a, long b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }

    private static long lcm(long a, long b) {
        long gcd = gcd(a, b);
        return a * b / gcd;
    }

    private static int calcK(int a, int m) {
        int result = 0;
        int x = 1;
        do {
            result++;
            x = (a * x) % m;
        } while (x != 1);
        return result;
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int a1 = scanner.nextInt();
            int m1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            int m2 = scanner.nextInt();
            int a3 = scanner.nextInt();
            int m3 = scanner.nextInt();

            if (a1 + m1 + a2 + m2 + a3 + m3 == 0) {
                break;
            }

            int k1 = calcK(a1, m1);
            int k2 = calcK(a2, m2);
            int k3 = calcK(a3, m3);

            System.out.println(lcm(lcm(k1, k2), k3));
        }
    }

    public static void main(String... args) {
        solve();
    }
}