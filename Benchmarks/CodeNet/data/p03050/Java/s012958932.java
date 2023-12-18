import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        Set<Long> set = new HashSet<>();
        long c = 1;
        while (c*c <= N) {
            if (N%c == 0) {
                long m1 = (N-c)/c;
                if (m1 > 1) {
                    set.add(m1);
                }
                long d = N/c;
                long m2 = (N-d)/d;
                if (m2 > 1) {
                    set.add(m2);
                }
            }
            c++;
        }
        long ans = 0;
        for (long m : set) {
            ans += m;
        }

        System.out.println(ans);
    }
}

