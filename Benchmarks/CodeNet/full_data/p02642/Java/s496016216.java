import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] p = new Integer[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        Arrays.sort(p);
        if (p[0] == p[n - 1]) {
            System.out.println(0);
            return;
        }
        int ans = n;

        for (int i = 1; i < n; i++) {
            if (divisibleNum(p, i)) {
                ans--;
            }
        }
        System.out.println(ans);
    }

    private static boolean divisibleNum(Integer[] p, int i) {
        for (int j = 0; j < i; j++) {
            if (p[i] % p[j] == 0) {
                return true;
            }
        }
        return false;
    }
}