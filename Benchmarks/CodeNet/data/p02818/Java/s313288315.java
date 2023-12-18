import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        if (a > k) {
            System.out.println(a-k+" "+b);
        } else {
            // a 終わりc
            long c = k-a;
            if (c > b) {
                System.out.println("0 0");
            } else {
                System.out.println("0 " + (c - b));
            }
        }


    }
}
