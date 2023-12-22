
import java.util.Scanner;

public class Main
{

    static long gcd(long x, long y)
    {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLong()) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = gcd(a, b);
            System.out.print(c);
            System.out.print(" ");
            System.out.println(a / c * b);
        }
    }
}

