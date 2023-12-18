import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        n = n - 2;
        if (n < 0) {
            n = 1;
        }
        m = m - 2;
        if (m < 0) {
            m = 1;
        }

        System.out.print(n * m);
    }
}
