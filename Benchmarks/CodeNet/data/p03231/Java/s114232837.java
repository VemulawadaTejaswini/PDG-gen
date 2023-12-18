/**
 * AGC028AMain
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.nextLine();
        String S = scan.nextLine();
        String T = scan.nextLine();
        char[] s = new char[n];
        char[] t = new char[m];
        for (int i = 0; i < n; i++) {
            s[i] = S.charAt(i);
        }
        for (int i = 0; i < m; i++) {
            t[i] = T.charAt(i);
        }
        int G = gcd(n, m);
        int L = n * m / G;
        char[] sx = new char[100001];
        char[] tx = new char[100001];
        Arrays.fill(sx, '#');
        Arrays.fill(tx, '#');
        sx[0] = s[0];
        tx[0] = t[0];
        for (int i = 1; i < n; i++) {
            if (i * (L / n) + 1 >= 100001) {
                break;
            }
            sx[i * (L / n) + 1] = s[i];
        }
        for (int i = 1; i < m; i++) {
            if (i * (L / m) + 1 >= 100001) {
                break;
            }
            tx[i * (L / m) + 1] = t[i];
        }
        for (int i = 0; i < L; i++) {
            if (sx[i] != tx[i] && sx[i] != '#' && tx[i] != '#') {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(L);
    }

    public static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return gcd(m, n % m);
    }
}