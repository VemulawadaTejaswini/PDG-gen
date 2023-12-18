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
                    } else {
                        for (int j = i + k; j <= N; j++) {
                            int d = j - i;
                            if (j < Y) {
                                d = Math.min((X - i) + 1 + (Y - j), d);
                            } else {
                                d = Math.min((X - i) + 1 + (j - Y), d);
                            }

                            if (d == k) {
                                ans++;
                            }
                        }
                    }

                } else if (i >= Y) {
                    if (i + k <= N) {
                        ans++;
                    }
                } else { // X < i < Y
                    for (int j = i + k; j <= N; j++) {
                        int d = j - i;
                        if (j < Y) {
                            d = Math.min((i - X) + 1 + (Y - j), d);
                        } else {
                            d = Math.min((i - X) + 1 + (j - Y), d);
                        }

                        if (d == k) {
                            ans++;
                        }
                    }
                }

            }
            System.out.println(ans);
        }

    }

}
