import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int a = stdin.nextInt();
        int b = stdin.nextInt();

        int x = Math.min(a, b);
        int y = Math.max(a, b);
        Set<Integer> cms = new HashSet<>();
        for (int i = 1; i * i <= y; i++) {
            if (y % i != 0) continue;

            int j = y / i;
            if (x % i == 0) cms.add(i);
            if (x % j == 0) cms.add(j);
        }

        int ans = 1;
        for (int cm : cms) {
            if (isPrime(cm)) ans++;
        }

        System.out.println(ans);
    }

    private static boolean isPrime(int x) {
        if (x < 2) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
