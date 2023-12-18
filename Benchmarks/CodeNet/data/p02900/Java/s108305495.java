import java.util.ArrayList;
import java.util.Collections;
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

        List<Long> toCheck = new ArrayList<>();

        for (long k = 1; k <= Math.sqrt(mi); k++) {
            if (mi % k == 0 && ma % k == 0) {
                //calculate the second and third factor
                if(k != 1) {
                    long n1 = mi / k;
                    long n2 = ma / k;
                    toCheck.add(n1);
                    toCheck.add(n2);
                }
                boolean fits = true;
                for (long d : divisors) {
                    if (d != 1 && k % d == 0) {
                        fits = false;
                    }
                }
                if (fits) {
                    divisors.add(k);
                }
            }
        }

        Collections.sort(toCheck);
        for(long c: toCheck) {
            boolean fits = true;
            for (long d : divisors) {
                if (d != 1 && c % d == 0) {
                    fits = false;
                }
            }
            if (fits) {
                divisors.add(c);
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