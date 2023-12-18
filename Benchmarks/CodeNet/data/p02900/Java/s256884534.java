import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        int gcd = (int) getGcd(a, b);
        System.out.println(getPf(gcd) + 1);
    }

    static long getGcd(long a, long b) {
        long tmp;
        long x = 0;
        long y = 0;
        if (x >= y) {
            x = a;
            y = b;
        } else {
            x = b;
            y = a;
        }
        while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
        }
        return y;
    }

    static int getPf (int a) {
        int i = 2;
        int cnt = 0;
        boolean isFirst = true;
        while (a != 1) {
            if (a % i == 0) {
                a /= i;
                if (isFirst) {
                    cnt++;
                    isFirst = false;
                }
            } else {
                i++;
                isFirst = true;
            }
        }
        return cnt;
    }
}