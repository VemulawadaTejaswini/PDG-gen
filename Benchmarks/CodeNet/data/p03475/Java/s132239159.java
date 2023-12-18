import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cs = new int[n - 1];
        int[] ss = new int[n - 1];
        int[] fs = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            cs[i] = sc.nextInt();
            ss[i] = sc.nextInt();
            fs[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(solve(n, cs, ss, fs, i, 0));
        }
    }

    private static int solve(int n, int[] cs, int[] ss, int[] fs, int x, int t) {
        if (x == n - 1) {
            return t;
        }
        int departure;
        if (t < ss[x]) {
            departure = ss[x];
        } else {
            departure = (t + fs[x] - 1) / fs[x] * fs[x];
        }
        return solve(n, cs, ss, fs, x + 1, departure + cs[x]);
    }
}
