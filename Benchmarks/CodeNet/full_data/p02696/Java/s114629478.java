import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        long a = in.nextLong(), b = in.nextLong(), n = in.nextLong();
        if (b > n)
            System.out.println(a * n / b - a * (n / b));
        else {
            long max = Integer.MIN_VALUE;
            for (long i = b - 1; i <= n; i += b) {
                long y = a * i / b - a * (i / b);
                if (y > max) {
                    max = y;
                }
            }
            System.out.println(max);
        }
    }

}
