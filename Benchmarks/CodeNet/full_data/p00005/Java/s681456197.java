import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            long a = Long.parseLong(sc.next());
            long b = Long.parseLong(sc.next());

            System.out.printf("%d %d", gcd(a, b), lcm(a, b));
        }
    }

    private static long gcd(long a, long b) {
        long ans;

        do {
            ans = a % b;
            a = b;
            b = ans;
        } while (a % b != 0);

        return ans;
    }

    private static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
}