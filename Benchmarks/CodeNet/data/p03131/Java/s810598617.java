import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextInt() + 1, a = sc.nextInt(), b = sc.nextInt();
        if (b - a <= 1) {
            System.out.println(k);
            return;
        }
        long n = k / (a + 2), m = k % (a + 2);
        System.out.println(n * b + m);
    }
}