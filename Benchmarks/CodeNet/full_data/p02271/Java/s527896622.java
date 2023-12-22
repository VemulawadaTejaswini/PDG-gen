import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            int m = sc.nextInt();
            if(solve(a, n, m, 0)) System.out.println("yes");
            else System.out.println("no");
        }

        sc.close();
    }

    private static boolean solve(int[] a, int n, int m, int i) {
        if(m == 0) return true;
        if(i == n) return false;
        return solve(a, n, m, i + 1) || solve(a, n, m - a[i], i + 1);
    }
}
