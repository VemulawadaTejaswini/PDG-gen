import java.util.*;
import static java.lang.Math.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] p = new int[n];
        Set<Integer> check = new HashSet<>();
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            check.add(p[i]);
        }

        Arrays.sort(p);

        if (n == 0) {
            System.out.println(x);
        }

        for (int i = 0; i < n; i++) {
            // pにxが含まれていなかったらxが答え
            if (p[i] > x) {
                System.out.println(x);
                return;
            } else if (p[i] == x) {
                for (int j = 1;; j++) {
                    if (!check.contains(p[i]-j)) {
                        System.out.println(p[i]-j);
                        return;
                    } else if (!check.contains(p[i]+j)) {
                        System.out.println(p[i]+j);
                        return;
                    }
                }
            }
        }
    }
}
