import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        countingSort(a, b, 10000);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                cnt += a[i];
            }
        }
        System.out.println(cnt);
    }

    private static int countingSort(int[] a, int[] b, int k) {
        int cnt = 0;
        int[] c = new int[k + 1];
        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
        }
        for (int i = 1; i < c.length; i++) {
            c[i] += c[i - 1];
        }
        for (int i = a.length - 1; i >= 0; i--) {
            b[c[a[i]] - 1] = a[i];
            c[a[i]]--;
        }
        return cnt;
    }
}