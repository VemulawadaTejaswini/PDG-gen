import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void swap(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean flg = true;
        int cnt = 0;

        while (flg) {
            flg = false;
            for (int i = n - 1; i >= 1; i--) {
                if (a[i] < a[i - 1]) {
                    int tmp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = tmp;
                    flg = true;
                    cnt++;
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println(a[n - 1]);
        System.out.println(cnt);

        sc.close();
    }
}
