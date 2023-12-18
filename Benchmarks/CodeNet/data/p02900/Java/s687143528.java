import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        if(b>a) {
            long c = a;
            a = b;
            b = c;
        }
        long gcd = gcd(a, b);
        Set<Long> pf = new HashSet<>(); // gcdの素因数を列挙
        pf.add((long)1);
        long lastPF = 0;
        long current = gcd;
        long i=2;
        while(i<=current) {
            if(lastPF>0 && current%lastPF==0) {
                current /= lastPF;
                continue;
            }
            if(current%i==0) {
                current /= i;
                lastPF = i;
                pf.add(i);
            }
            i++;
        }

        if(false) {
            System.out.println(gcd);
            Iterator<Long> it = pf.iterator();
            while(it.hasNext()) {
                System.out.println(it.next());
            }
        }

        System.out.println(pf.size());
    }
    private static long gcd(long a, long b) {
        if(b==0) {
            return a;
        }
        return gcd(b, a%b);
    }
}
