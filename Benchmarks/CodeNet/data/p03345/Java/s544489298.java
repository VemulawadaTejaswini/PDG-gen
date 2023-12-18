import java.util.*;

public class P024A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();

        long result = a-b;
        if (a==b && a==c)
            System.out.println(result);
        else {
            if (k>0) {
                for (long i=0; i<k; i++) {
                    long a2 = b+c;
                    long b2 = a+c;
                    long c2 = a+b;
                    a = a2;
                    b = b2;
                    c = c2;
                }
            }
            if (Math.abs(result) > 1000000000000000000L)
                System.out.println("Unfair");
            else
                System.out.println(a-b);
        }
    }
}