import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long quotient = m / 2;
        long count = Math.min(quotient, n);
        n -= count;
        m -= (count * 2);
        if(n == 0) {
            count += m / 4;
        }
        System.out.println(count);
    }
}
