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

        for (int i = -256; i < 255; i++) {
            for (int j = -256; j < 255; j++) {
                if (i != j && x % (i - j) == 0) {
                    long tmpx = x / ((long) i - (long) j);
                    if ((long) (i * i * i * i) + (long) (i * i * i * j) + (long) (i * i * j * j)
                            + (long) (i * j * j * j) + (long) (j * j * j * j) == tmpx) {
                        a = i;
                        b = j;
                    }
                }
            }
        }

        System.out.println(a + " " + b);
        sc.close();
    }
}
