import java.util.*;

public class Main {
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        int min = 0;
        int max = 100000;
        for (int i = 0; i < m; ++i) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            min = Math.max(min, l);
            max = Math.min(max, r);
        }
        System.out.println(Math.min(n, Math.max(0, max - min + 1)));
    }
}
