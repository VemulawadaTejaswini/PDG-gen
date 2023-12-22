import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println(search(a, new boolean[n], scanner.nextInt()) ? "yes": "no");
        }
    }

    private static boolean search(int[] a, boolean[] b, int m) {
        for (int i = 0; i < a.length; i++) {
            if (b[i]) continue;
            if (a[i] > m) continue;
            if (a[i] == m) return true;
            b[i] = true;
            if (search(a, b, m - a[i])) {
                return true;
            }
            b[i] = false;
        }
        return false;
    }
}