
import java.util.Scanner;

public class Main {

    // クソコードを生み出してしまった。。。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        for (int k = 1; k <= N - 1; k++) {
            int ans = 0;
            for (int i = 1; i <= N - 1; i++) {
                if (i <= X) {
                    if (i + k <= X) {
                        ans++;
                        continue;
                    }

                    if ((X - i) + 1 + (N - Y) >= k) {
                        ans++;
                    }

                    if (Y - X % 2 == 0) {
                        if ((Y - X) / 2 >= k - (X - i)) {
                            ans += 2;
                        }
                    } else {
                        if ((Y - X + 1) / 2 > k - (X - i)) {
                            ans += 2;
                        } else if ((Y - X + 1) / 2 == k - (X - i)) {
                            ans++;
                        }
                    }

                } else if (i >= Y) {
                    if (i + k <= N) {
                        ans++;
                    }
                } else {
                    if (Y - X % 2 == 0) {
                        int center = (Y + X) / 2;
                        if (i < center) {
                            if (i - X + 1 + N - Y >= k) {
                                ans++;
                            }

                            if (i - X + 1 + Y - (k - (i - X + 1 + Y)) > i + k) {
                                ans += 2;
                            }
                        } else {
                            if (i + k <= N) {
                                ans++;
                            }
                        }
                    } else {
                        int center = (Y + X + 1) / 2;
                        if (i < center) {
                            if (i - X + 1 + N - Y >= k) {
                                ans++;
                            }

                            if (i - X + 1 + Y - (k - (i - X + 1 + Y)) > i + k) {
                                ans += 2;
                            }
                        } else if (i + k <= N) {
                            ans++;
                        }
                    }
                }
            }
            System.out.println(ans);
        }

    }
}
