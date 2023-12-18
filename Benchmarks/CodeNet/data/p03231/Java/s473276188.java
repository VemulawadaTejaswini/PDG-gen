import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        long l = lcm(n, m);

        Set<Long> sSet = new HashSet<>();
        Set<Long> tSet = new HashSet<>();
        for (int i = 0 ; i < n ; i++) {
            sSet.add(i * l / n);
        }
        for (int i = 0 ; i < m ; i++) {
            tSet.add(i * l / m);
        }

        Set<Long> all = new HashSet<>(sSet);
        all.retainAll(tSet);

        for (Long i : all) {
            int j = i.intValue();
            if(s.substring(j, j + 1).equals(t.substring(j, j + 1))) {
                l = -1l;
            }
        }

        System.out.println(l);

    }
    static int gcd(int m , int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
    static long lcm(int n , int m) {
        return  (long) n * m / gcd(n, m);
    }

}
