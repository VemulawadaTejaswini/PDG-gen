import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        
        if(a >= k) {
            System.out.println((a - k) + " " + b);
        } else {
            System.out.println(0 + " " + Math.max(0, (b - (k - a))));
        }
    }
}
