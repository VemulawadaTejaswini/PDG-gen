import java.util.*;

public class Main {

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        set.add(res);
        for (int i = 1; i < n; i++) {
            int num = sc.nextInt();
            if (!set.add(num)) continue;
            res = gcd(num, res);
            if (res == 1) break;
        }
        System.out.println(res);
    }
}