import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        long ansA, ansB;
        if (a - k >= 0) {
            ansA = a - k;
        } else {
            ansA = 0;
        }
        k -= a;

        if (b - k >= 0) {
            ansB = b - k;
        } else {
            ansB = 0;
        }

        System.out.println(ansA + " " + ansB);
    }
}