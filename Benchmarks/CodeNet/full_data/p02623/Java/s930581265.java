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
        int ans = 0;
        if (time <= k) {
            ans = n + m;
        } else {
            time = 0;
            int ai = 0;
            int bi = 0;
            while (true) {
                if (ai >= n && bi >= m) {
                    break;
                } else if (ai >= n) {
                    if (time + b[bi] > k) {
                        break;
                    }
                    time += b[bi];
                    bi++;
                } else if (bi >= m) {
                    if (time + a[ai] > k) {
                        break;
                    }
                    time += a[ai];
                    ai++;
                } else {
                    if (a[ai] <= b[bi]) {
                        if (time + a[ai] > k) {
                            if (time + b[bi] < k) {
                                time += b[bi];
                                bi++;
                            } else {
                                break;
                            }
                        } else {
                            time += a[ai];
                            ai++;
                        }
                    } else {
                        if (time + b[bi] > k) {
                            if (time + a[ai] < k) {
                                time += a[ai];
                                ai++;
                            } else {
                                break;
                            }
                        } else {
                            time += b[bi];
                            bi++;
                        }
                    }
                }
                ans++;
            }
        }
        System.out.println(ans);
    }
}