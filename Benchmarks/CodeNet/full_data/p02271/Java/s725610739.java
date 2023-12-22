import java.util.Scanner;

public class Main {
    private static int n, m;
    private static int[] a, b;

    public static void main(String[] args) {
        inputData();
        solve();
    }

    private static void inputData() {
        try (Scanner scan = new Scanner(System.in)) {
            n = scan.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) a[i] = scan.nextInt();
            m = scan.nextInt();
            b = new int[m];
            for (int i = 0; i < m; i++) b[i] = scan.nextInt();
        }
    }

    private static void solve() {
        for(int i=0; i<m; i++) {
            if(serchNumber(b[i])) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    private static boolean serchNumber(int t) {
        for (int i = 0; i < (1 << n); i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if ((1 << j & i) > 0) sum += a[j];
            }
            if(t == sum) return true;
        }
        return false;
    }
}

