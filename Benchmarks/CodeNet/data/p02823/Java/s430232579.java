import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long diff = Math.abs(a-b);
        if (diff % 2 == 0) {
            System.out.println(diff / 2);
        }
        else {
            if (n - a < b) {
                System.out.println(n-a);
            }
             else {
                System.out.println(b-1);
            }
        }
    }
}