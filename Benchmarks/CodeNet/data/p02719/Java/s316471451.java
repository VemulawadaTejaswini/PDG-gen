import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        long a = in.nextLong(), b = in.nextLong();
        if (a % b == 0)
            System.out.println(0);
        else {
            System.out.println(gcd(a, b));
        }
    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
