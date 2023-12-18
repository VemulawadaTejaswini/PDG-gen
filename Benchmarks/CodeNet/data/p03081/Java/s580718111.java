import java.util.*;
public class Main {
    static int n;
    static String s;
    static int q;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        q = sc.nextInt();
        s = " " + sc.next() + " ";
        char[] t = new char[q];
        char[] d = new char[q];
        for (int i = 0; i < q; i++) {
            t[i] = sc.next().charAt(0);
            d[i] = sc.next().charAt(0);
        }
        int left = binSearch(t, d, 0, n);
        int right = binSearch(t, d, n + 1, 0);
        int ans = right - left - 1;
        ans = Math.max(ans, 0);
        System.out.println(ans);
    }
    public static int binSearch(char[] t, char[] d, int ok, int ng) {
        int out = ok;
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (solve(mid, out, t, d)) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }
    public static boolean solve(int mid, int out, char[] t, char[] d) {
        char ch;
        for (int i = 0; i < q; i++) {
            ch = s.charAt(mid);
            if (ch != t[i]) {
                continue;
            }
            if (d[i] == 'L') {
                mid--;
            } else if (d[i] == 'R') {
                mid++;
            }
            if (mid == out) {
                return true;
            }
        }
        return false;
    }
}
