import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Long> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextLong() / 2);
        }
        long lcd = 1;
        Iterator<Long> iter = set.iterator();
        if (set.size() > 1) {
            long k = gcd(iter.next(), iter.next());
            while(iter.hasNext())
            {
                k = gcd(k, iter.next());
            }
            for(long i : set)
            {
                lcd *= i;
                lcd /= k;
            }
        } else {
            lcd = iter.next();
        }
        System.out.println((m / lcd + 1) / 2);
    }



    private static long gcd(long a, long b) {
        if(a == 0||b == 0)
            return 0;
        long k = a % b;
        while(k != 0)
        {
            k = a % b;
            a = b;
            b = k;
        }
        return a;
    }
}