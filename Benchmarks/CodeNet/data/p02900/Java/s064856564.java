import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long mi = Math.min(A,B);
        long ma = Math.max(A,B);

        List<Long> divisors = new ArrayList<>();

        for (long k = 1; k <= Math.sqrt(mi); k++) {
            if (mi % k == 0 && ma % k == 0) {
                //calculate the second and third factor
                long n1 = mi / k;
                long n2 = ma / k;

                boolean fits = true;
                boolean fits1 = true;
                boolean fits2 = true;

                for (long d : divisors) {
                    if (d != 1 && k % d == 0) {
                        fits = false;
                    }
                    if (d != 1 && n1 % d == 0) {
                        fits1 = false;
                    }
                    if (d != 1 && n2 % d == 0) {
                        fits2 = false;
                    }
                }
                if (fits) {
                    divisors.add(k);
                }
                boolean n1added = false;
                if(ma % n1 == 0 && fits1 && n1 % k != 0) {
                    divisors.add(n1);
                    n1added = true;
                }
                if(mi % n2 == 0 && fits2 && n2 % k != 0 && (n2 % n1 != 0 || !n1added)) {
                    divisors.add(n2);
                }
            }
        }


        if(ma % mi == 0 && mi != 1) {
            boolean fits = true;
            for (long d : divisors) {
                if (d != 1 && mi % d == 0) {
                    fits = false;
                }
            }
            if (fits) {
                divisors.add(mi);
            }
        }
        System.out.println(divisors.size());
    }
}