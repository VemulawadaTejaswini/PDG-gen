import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int base = sc.nextInt() / 2;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i < n; i++) {
            set.add(sc.nextInt() / 2);
        }
        set.remove(base);
        int count = getDev2Count(base);
        int org = base;
        for (int x : set) {
            if (count != getDev2Count(x)) {
                System.out.println(0);
                return;
            }
            org = gcd(org, x);
        }
        long lcm = base / org;
        for (int x : set) {
            lcm *= x / org;
            if (lcm > m) {
                System.out.println(0);
                return;
            }
        }
        System.out.println((m / lcm + 1) / 2);
    }
    
    static int getDev2Count(int x) {
        int count = 0;
        while (x % 2 == 0) {
            count++;
            x /= 2;
        }
        return count;
    }
    
    static int gcd(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return gcd(y, x % y);
        }
    }
}