import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long l = 1;
        for (int i= 1; i <= Math.sqrt(n); i ++) {
            if (n % i == 0)
                l=i;
        }
        System.out.println(l + (n / l) - 2);
    }
}