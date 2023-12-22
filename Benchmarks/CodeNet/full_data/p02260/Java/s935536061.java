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

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int mn = i;
            for (int j = i; j < n; j++) {
                if (a[j] < a[mn]) {
                    mn = j;
                }
            }
            if (mn != i) {
                int tmp = a[i];
                a[i] = a[mn];
                a[mn] = tmp;
                cnt++;
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
