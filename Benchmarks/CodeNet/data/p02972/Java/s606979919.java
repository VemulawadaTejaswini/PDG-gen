import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[N + 1];

        int allCount = 0;
        // 少なくとも後半半分は a[i] がそのまま b[i] になる。
        for (int i = N; i >= 1; i--) {
            if (i >= (N/2 + 1)) {
                b[i] = a[i];
                if (b[i] == 1) {
                    allCount++;
                }
            }
            else {
                int count = 0;
            
                if (i == 1) {
                    count = allCount;
                }
                else {
                    for (int j = i; j <= N; j += i) {
                        if (b[j] == 1) {
                            count++;
                        }
                    }
                }

                // count と a[i] に合わせて、b[i] を決める。
                if (count % 2 == 0) {
                    if (a[i] == 0) {
                        b[i] = 0;
                    }
                    else { // a[i] == 1
                        b[i] = 1;
                        allCount++;
                    }
                }
                else { // count % 2 == 1
                    if (a[i] == 0) {
                        b[i] = 1;
                        allCount++;
                    }
                    else { // a[i] == 1
                        b[i] = 0;
                    }
                }
            }
        }
        System.out.println(allCount);
        for (int i = 1; i <= N; i++) {
            if (b[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}

