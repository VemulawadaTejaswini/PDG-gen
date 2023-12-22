import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[m];

        long time_A_all = 0;
        long time_B_all = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            time_A_all += a[i];
        }
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(sc.next());
            time_B_all += b[i];
        }
        long time = time_A_all + time_B_all;
        int ans = n + m;
        if (time <= k) {
            // ans = n + m
        } else if (time_A_all == time_B_all) {
            if (n > m) {
                ans -= getTsun(a, b, k, time);
            } else {
                ans -= getTsun(b, a, k, time);
            }
        } else if (time_A_all < time_B_all) {
            ans -= getTsun(a, b, k, time);
        } else {
            ans -= getTsun(b, a, k, time);
        }
        System.out.println(ans);
    }

    private static int getTsun(Integer[] f, Integer[] s, int k, long time) {
        int fi = f.length - 1;
        int si = s.length - 1;
        int ans = 0;

        while (true) {
            if (fi <= 0 && si <= 0) {
                break;
            } else if (fi <= 0) {
                if (time - s[si] <= k) {
                    break;
                }
                time -= s[si];
                si--;
            } else if (si <= 0) {
                if (time - f[fi] <= k) {
                    break;
                }
                time -= f[fi];
                fi--;
            } else {
                if ((time - f[fi] <= k) && (time - s[si] <= k)) {
                    break;
                }
                int fp = f[fi];
                if (fi > 1) {
                    fp += f[fi - 1];
                }
                int sp = s[si];
                if (si > 1) {
                    sp += s[si - 1];
                }
                if (fp < sp) {
                    if (time - s[si] > k) {
                        time -= s[si];
                        si--;
                    } else {
                        time -= f[fi];
                        fi--;
                    }
                } else {
                    if (time - f[fi] > k) {
                        time -= f[fi];
                        fi--;
                    } else {
                        time -= s[si];
                        si--;
                    }
                }
            }
            ans++;
        }
        return ans;
    }
}