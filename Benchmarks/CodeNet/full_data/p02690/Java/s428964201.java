import java.util.*;

class Main {

    static int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {

        long a = 0;
        long b = 0;
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        for (int i = -100; i < 100; i++) {
            for (int j = -100; j < 100; j++) {
                if ((long) (i * i * i * i * i) - (long) (j * j * j * j * j) == x) {
                    a = i;
                    b = j;
                }
            }
        }

        System.out.println(a + " " + b);
        sc.close();
    }
}
