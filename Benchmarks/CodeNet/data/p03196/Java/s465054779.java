import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        if (n==1) {
            System.out.println(p);
            return;
        }
        if (p==1) {
            System.out.println(1);
            return;
        }
        int max = 1;
        for (int i = 1; Math.pow(i, n) <= p; i++) {
            if (p % Math.pow(i,n) == 0) {
                max = Math.max(max, i);
            }
        }
        System.out.println(max);
    }
}