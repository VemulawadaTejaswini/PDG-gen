import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList();
        for (int i = 0; i < n; i++) {
            a.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                a.get(i).add(sc.nextInt());
            }
        }

        ArrayList<Integer> loc = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            loc.add(n - 2);
        }

        int ans = 0;
        int gameCount = 0;
        int totalGameCount = n * (n-1) / 2;
        while (gameCount != totalGameCount) {
            boolean found = false;
            ArrayList<Boolean> used = new ArrayList<Boolean>();
            for (int i = 0; i < n; i++) {
               used.add(false);
            }
            for (int i = 0; i < n; i++) {
                if (loc.get(i) == -1) {
                    continue;
                }
                if (used.get(i)) {
                    continue;
                }
                int target = a.get(i).get(loc.get(i)) - 1;
                if (used.get(target)) {
                    continue;
                }
                if (loc.get(target) == -1) {
                    continue;
                }
                if (a.get(target).get(loc.get(target)) - 1 == i) {
                    used.set(i, true);
                    used.set(target, true);
                    loc.set(i, loc.get(i)-1);
                    loc.set(target, loc.get(target)-1);
                    found = true;
                    gameCount += 1;
                }
            }
            ans += 1;
            if (!found) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(ans);
    }
}
