import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long e = sc.nextLong();

        long aBottoleNeck = (n + (a-1))/a;
        long bBottoleNeck = (n + (b-1))/b;
        long cBottoleNeck = (n + (c-1))/c;
        long dBottoleNeck = (n + (d-1))/d;
        long eBottoleNeck = (n + (e-1))/e;

        long maxBottoleNeck = Math.max(aBottoleNeck, Math.max(bBottoleNeck, Math.max(cBottoleNeck, Math.max(dBottoleNeck, eBottoleNeck))));
        System.out.println(maxBottoleNeck + 4);
    }
}