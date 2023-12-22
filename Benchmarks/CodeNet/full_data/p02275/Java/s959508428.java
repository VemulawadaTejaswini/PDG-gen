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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(b[i]);
            if (i < n - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }

    private static void countingSort(int[] a, int[] b, int k) {
        int[] c = new int[k + 1];

        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
        }

        for (int i = 1; i < k + 1; i++) {
            c[i] += c[i - 1];
        }

        for (int i = a.length - 1; i >= 0; i--) {
            b[c[a[i]] - 1] = a[i];
            c[a[i]]--;
        }
    }
}