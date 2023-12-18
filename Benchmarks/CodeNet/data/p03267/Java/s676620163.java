import java.util.*;
 
public class Main {
 
    private static Scanner sc;
 
    public static void main(String[] args) {
        sc = new Scanner(System.in);
 
        long l = sc.nextInt();
 
        List<Long> u = new ArrayList<>();
        List<Long> v = new ArrayList<>();
        List<Long> w = new ArrayList<>();
 
        long p = 1;
        long i = 1;
        while (p <= l / 2) {
            u.add(i);
            v.add(i + 1);
            w.add(0L);
            u.add(i);
            v.add(i + 1);
            w.add(p);
            p *= 2;
            i++;
        }
 
        long r = l - p;
        long q = p;
        long b = 0;
        long rp2 = r;
        for (long j = i - 1; rp2 > 0; j--) {
            p /= 2;
            long rp21 = rp2 / p;
 
            if (rp21 == 0) {
                continue;
            }
            b += q;
            u.add(j);
            v.add(i);
            w.add(b);
            q = p;
            rp2 = rp2 - p;
        }
 
        System.out.println(i + " " + u.size());
        for (int j = 0; j < u.size(); j++) {
            System.out.println(u.get(j) + " " + v.get(j) + " " + w.get(j));
        }
    }
 
}