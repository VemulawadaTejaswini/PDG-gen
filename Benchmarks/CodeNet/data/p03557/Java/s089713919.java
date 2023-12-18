import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int count = 0;
        int bmin = 0;
        for (int i = 0; i < n; i++) {
            for (int j = bmin; j < n; j++) {
                if (a[i] > b[j]) {
                    bmin = j;
                    continue;
                }
                for (int k = 0; k < n; k++) {
                    if (a[i] < b[j] && b[j] < c[k]) {
                        count += n - k;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}