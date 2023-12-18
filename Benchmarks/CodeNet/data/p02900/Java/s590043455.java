import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        List<Long> divisors = new ArrayList<>();

        for (long k = 1; k <= Math.sqrt(Math.min(A, B)); k++) {
            if (A % k == 0 && B % k == 0) {
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

        long mi = Math.min(A,B);
        long ma = Math.max(A,B);
        if(ma % mi == 0) {
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
