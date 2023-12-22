import java.util.*;

public class Main {

    private static final int up = 1000000;

    private static boolean judge1(int[] a, int[] f) {
        int n = a.length;
        Set<Integer> S = new HashSet();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList();
            for (int x = a[i]; x != 1; ) {
                int p = f[x] == 0 ? x : f[x];
                list.add(p);
                if (S.contains(p)) return false;
                x = x / p;
            }
            S.addAll(list);
        }
        return true;
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scan.nextInt();
        int[] flag = new int[up + 1];
        List<Integer> prime = new ArrayList();
        for (int i = 2; i <= up; i++) {
            if (flag[i] == 0) prime.add(i);
            for (int j = 0; i * prime.get(j) <= up; j++) {
                flag[i * prime.get(j)] = prime.get(j);
                if (i % prime.get(j) == 0) break;
            }
        }
        boolean pairwise = judge1(a, flag);
        if (pairwise) System.out.println("pairwise coprime");
        else {
            int ans = a[0];
            for (int i = 1; i < n; i++) ans = gcd(ans, a[i]);
            if (ans == 1) System.out.println("setwise coprime");
            else System.out.println("not coprime");
        }
    }
}
