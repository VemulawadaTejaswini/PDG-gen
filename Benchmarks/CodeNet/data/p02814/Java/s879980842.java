import java.util.*;

public class Main {

    private static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long m = sc.nextLong();
        ArrayList<Long> list = new ArrayList<>();
        long gcd = sc.nextLong() / 2;
        long lcm = gcd;
        list.add(gcd);

        for (int i = 1; i < n; i++) {
            long value = sc.nextLong() / 2;
            if (list.contains(value)) {
                continue;
            }
            list.add(value);
            gcd = gcd(gcd, value);
            lcm *= value;
        }

        long ans = m / lcm;

        System.out.println((int)Math.ceil((double) ans / 2));
    }

    private static long gcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}