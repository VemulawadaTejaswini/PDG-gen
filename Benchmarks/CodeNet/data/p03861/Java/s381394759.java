import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        System.out.println(getX(b, x) - getX(a - 1, x));
    }

    static long getX(long a, long x) {
        if (a < 0) {
            return 0;
        } else {
            return a / x + 1;
        }

    }

}