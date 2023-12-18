import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] a = new long[N];
        long sum = 0;
        int count_negative = 0;
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextLong();
            sum += a[i];
            if (a[i] < 0) {
                count_negative += 1;
            }
        }
        int count_positive = N - count_negative;
        Arrays.sort(a);
        if (count_negative == 0) {
            count_negative = 1;
            count_positive -= 1;
        }
        if (count_positive == 0) {
            count_negative -= 1;
            count_positive = 1;
        }
        long x = a[0];
        for (int i = count_negative; i < N - 1; i++) {
            x = x - a[i];
        }
        long y = a[N-1];
        for (int i = 1; i < count_negative; i++) {
            y = y - a[i];
        }
        long answer = y - x;
        System.out.println(answer);
        x = a[0];
        for (int i = count_negative; i < N - 1; i++) {
            System.out.println(x + " " + a[i]);
            x = x - a[i];
        }
        y = a[N-1];
        for (int i = 1; i < count_negative; i++) {
            System.out.println(y + " " + a[i]);
            y = y - a[i];
        }
        System.out.println(y + " " + x);
    }
}