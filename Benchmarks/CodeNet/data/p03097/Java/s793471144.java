
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    int n, a, b;

    void run() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();

        if (Integer.bitCount(a^b) % 2 == 0) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        boolean[] used = new boolean[1 << n];
        int[] ans = new int[1<<n];

        for (int i = 0; i < (1 << n) - 2; i++) {
            used[a] = true;
            ans[i] = a;
            boolean br = false;
            int r = 2;
            while (!br) {
                for (int j = 0; j < n; j++) {
                    int next = a ^ (1 << j);
                    if (used[next] || next == b) continue;
                    a = next;
                    br = true;
                    break;
                }
                if (!br) {
                    reverse(ans, i - (1 << r), i);
                    a = ans[i];
                    r += 2;
                }
            }
        }
        ans[(1 << n) - 2] = a;
        ans[(1 << n) - 1] = b;
        boolean check = true;
        for (int i = 0; i < (1 << n) - 1; i++) {
            System.out.print(ans[i] + " ");
            check &= Integer.bitCount(ans[i]^ans[i + 1]) == 1;
        }
        debug(check);
        System.out.println(b);
    }

    void reverse(int[] ar, int l, int r) {
        int c = (l + r) / 2 - l;
        for (int i = 0; i < c; i++) {
            int tmp = ar[l + i];
            ar[l + i] = ar[r - i];
            ar[r - i] = tmp;
        }
    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
