import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < m; i++) {
            Arrays.sort(a);
            a[n - 1] = a[n - 1] / 2;
        }

        long ret = 0;
        for (int an : a) {
            ret += an;
        }
        System.out.println(ret);
    }
}
