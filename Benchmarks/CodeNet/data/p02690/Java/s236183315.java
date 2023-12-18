import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        for (long a=0;a<1000;a++) {
            for (long b=0;b<1000;b++) {
                if (a*a*a*a*a+b*b*b*b*b == x) {
                    System.out.println(a + " " + (-b));
                    return;
                } else if (a*a*a*a*a-b*b*b*b*b == x) {
                    System.out.println(a + " " + b);
                    return;
                } else if (-a*a*a*a*a+b*b*b*b*b == x) {
                    System.out.println((-a) + " " + (-b));
                    return;
                } else if (-a*a*a*a*a-b*b*b*b*b == x) {
                    System.out.println((-a) + " " + b);
                    return;
                }
            }
        }

    }
}
