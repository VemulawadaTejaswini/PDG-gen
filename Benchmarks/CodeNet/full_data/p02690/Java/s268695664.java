import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            long x = s.nextLong();
            for (long b = 0L; b < x; b++) {
                long bb = b*b*b*b*b;
                OptionalInt a1 = rootFive(x + bb);
                if (a1.isPresent()) {
                    System.out.println(a1.getAsInt() + " " + b);
                    break;
                }
                OptionalInt a2 = rootFive(x - bb);
                if (a2.isPresent()) {
                    System.out.println(a2.getAsInt() + " " + b);
                    break;
                }
            }
        }
    }
    
    private static OptionalInt rootFive(long x) {
        if (x == 0L) {
            return OptionalInt.of(0);
        }
        long xx = Math.abs(x);
        int a = 1;
        int i = 2;
        int count = 0;
        while (xx > 1) {
            if (xx % i == 0) {
                xx /= i;
                count++;
                if (count == 5) {
                    a *= i;
                    count = 0;
                }
            } else {
                if (count != 0) {
                    return OptionalInt.empty();
                }
                i++;
            }
        }
        return OptionalInt.of(a);
    }
}