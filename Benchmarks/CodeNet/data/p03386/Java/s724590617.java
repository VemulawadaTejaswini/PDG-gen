import java.math.BigInteger;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        if (b - a + 1 <= 2 * k) {
            for (int i = 0; i <= b - a; i++) {
                System.out.println(a + i);
            }
        } else {
            for (int i = 0; i < k; i++) {
                System.out.println(a + i);
            }
            for (int i = 0; i < k; i++) {
                System.out.println(b - (k - i) + 1);
            }
        }
    }

}