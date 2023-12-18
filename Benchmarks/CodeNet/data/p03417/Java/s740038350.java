import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        long a = n - 2;
        if (a < 0) {
            a = 1;
        }
        long b = m - 2;
        if (b < 0) {
            b = 1;
        }

        System.out.print(a * b);
    }
}