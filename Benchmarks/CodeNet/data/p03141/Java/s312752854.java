import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        int d[] = new int[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = a[i] + b[i];
            d[i] = c[i];
        }
        Arrays.sort(c);
        int tmp = 0;
        int cnt = 0;
        if (n % 2 == 0) {

            for (int i = 0; i < n; i++) {
                int wa = a[i] + b[i];
                int key = binarySearch(c, wa);
                if (tmp == wa) {
                    cnt++;
                } else {
                    tmp = wa;
                    cnt = 0;
                }
                if (key % 2 == 0) {
                    if (cnt % 2 == 1) {
                        ans += a[i];
                    } else {
                        ans -= b[i];
                    }

                } else {
                    if (cnt % 2 == 1) {
                        ans -= b[i];
                    } else {
                        ans += a[i];
                    }

                }

            }
        } else {
            for (int i = 0; i < n; i++) {
                int wa = a[i] + b[i];
                int key = binarySearch(c, wa);
                if (tmp == wa) {
                    cnt++;
                } else {
                    cnt = 0;
                    tmp = wa;
                }
                if (key % 2 == 1) {
                    if (cnt % 2 == 1) {
                        ans += a[i];
                    } else {
                        ans -= b[i];
                    }

                } else {
                    if (cnt % 2 == 1) {
                        ans -= b[i];
                    } else {
                        ans += a[i];
                    }
                }

            }
        }

        System.out.println(ans);
    }

    public static int binarySearch(int[] array, int key) {
        int pLeft = 0;
        int pRight = array.length - 1;

        do {
            int center = (pLeft + pRight) / 2;

            if (array[center] == key) {
                return center;
            } else if (array[center] < key) {
                pLeft = center + 1; // 真ん中の一つ右側を左端とする
            } else {
                pRight = center - 1;
            }
        } while (pLeft <= pRight);

        return -1;
    }
}
