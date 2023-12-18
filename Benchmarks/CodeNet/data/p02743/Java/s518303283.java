import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long x = c - a - b;
        if(x <= 0) {
            System.out.println("No");
            return;
        }
        long y = 4 * a * b;
        String ans = (x * x - y > 0) ? "Yes" : "No";
        System.out.println(ans);
    }
}
