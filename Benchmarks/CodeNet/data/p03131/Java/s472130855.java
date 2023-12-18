import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();
        if (b - a <= 1) {
            System.out.println(k + 1);
        } else {
            long n = a;
            n += (long) (k + 1 - a) / 2 * (b - a);
            n += (long) (k + 1 - a) % 2;
            System.out.println(n);
        }
    }
}
