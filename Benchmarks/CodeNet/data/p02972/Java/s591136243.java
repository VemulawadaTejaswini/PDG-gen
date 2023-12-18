import java.util.Arrays;
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
        for (int i = N; i >= 1; i--) {
            if (i >= (N/2 + 1)) {
                b[i] = a[i];
                if (b[i] == 1) {
                    allCount++;
                }
            }
            else {
                int count = 0;
                for (int j = i + 1; j <= N; j++) {
                    if (j % i == 0) {
                        if (b[j] == 1) {
                            count++;
                        }
                    }
                }

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

