import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        print(a, n);
        sort(a, n);
        sc.close();
    }

    private static void print(int[] a, int n) {
        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < n; k++) {
            sb.append(a[k]);
            if (k < n - 1)
                sb.append(" ");
        }

        System.out.println(sb);
    }

    private static void sort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int v = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > v) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = v;
            print(a, n);
        }
    }
}
