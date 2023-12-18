import java.util.Arrays;
import java.util.Scanner;

class Main {
    static int n;
    static int m;
    static int w[];
    static int v[];
    static int ans;
    static int use[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        w = new int[n];
        v = new int[n];
        use = new int[n];
        Arrays.fill(use, 0);
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        sc.close();
        DPS(0);
        System.out.println(ans);

    }

    public static void DPS(int pos) {
        if (pos >= n) {
            return;
        }
        use[pos] = 0;
        func();
        DPS(pos + 1);
        use[pos] = 1;
        func();
        DPS(pos + 1);

    }

    public static void func() {
        int value = 0;
        int weight = 0;
        for (int i = 0; i < n; i++) {
            if (use[i] == 1) {
                value += v[i];
                weight += w[i];
            }
        }
        if (m >= weight) {
            ans = Math.max(ans, value);
        }
    }
}