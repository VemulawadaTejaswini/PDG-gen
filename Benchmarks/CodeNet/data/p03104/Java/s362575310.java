import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long x = a ^ b;
        long y = (b - a) % 2 == 1 ? 0 : (a + b) / 2;
        x *= ((b - a + 1) / 2) % 2;
        System.out.println(x ^ y);
    }
}