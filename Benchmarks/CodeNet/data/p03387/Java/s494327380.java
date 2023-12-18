import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();

        boolean[] e = new boolean[3];

        int ne = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] % 2 == 0) {
                ne++;
                e[i] = true;
            }
        }

        int ans = 0;
        if (ne == 0 || ne == 3) {
            // no change
        } else {
            if (ne % 2 == 0) {
                for (int i = 0; i < 3; i++) {
                    if (e[i]) {
                        a[i]++;
                    }
                }
            } else {
                for (int i = 0; i < 3; i++) {
                    if (!e[i]) {
                        a[i]++;
                    }
                }
            }
            ans++;
        }

        // find max
        int max = -1;
        int idx = -1;
        for (int i = 0; i < 3; i++) {
            if (max < a[i]) {
                idx = i;
                max = a[i];
            }
        }
        for (int i = 0; i < 3; i++) {
            if (i != max) {
                ans += Math.abs(a[idx] - a[i]) / 2;
            }
        }

        System.out.println(ans);
        return;
    }

}