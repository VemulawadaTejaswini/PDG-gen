import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sc.close();

        Collections.sort(list);

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int candidate = gcd(list.get(i - 1), list.get(i));
            if (candidate < ans) {
                ans = candidate;
            }
        }
        System.out.println(ans);
    }

    // a >= b
    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

}
