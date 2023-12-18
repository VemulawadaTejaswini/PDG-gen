import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());

        double d = Math.sqrt(a);
        double e = Math.sqrt(b);
        double f = Math.sqrt(c);
        if (d+e < f) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
