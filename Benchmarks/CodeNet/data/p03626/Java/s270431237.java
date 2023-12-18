import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();

        long mod = 1000000007L;

        long ans;
        boolean beforeTate;
        int start;
        if (s1.charAt(0) == s2.charAt(0)) {
            ans = 3;
            beforeTate = true;
            start = 1;
        } else {
            ans = 6;
            beforeTate = false;
            start = 2;
        }

        for (int i = start; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                ans *= (beforeTate ? 2 : 1);
                beforeTate = true;
            } else {
                ans *= (beforeTate ? 2 : 3);
                beforeTate = false;
                i++;
            }
            ans %= mod;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
