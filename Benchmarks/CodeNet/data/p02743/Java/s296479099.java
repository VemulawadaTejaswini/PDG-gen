import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int a = Integer.parseInt(sc.next());
        final int b = Integer.parseInt(sc.next());
        final int c = Integer.parseInt(sc.next());
        sc.close();

        if (c - a - b > 0 && (c - a - b) * (c - a - b) > 4 * a * b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}