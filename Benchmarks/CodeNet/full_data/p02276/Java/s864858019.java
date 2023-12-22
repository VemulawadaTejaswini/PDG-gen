import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int pivot = partition(a, 0, n - 1);

        for (int i = 0; i < n; i++) {
            if (i != 0)
                System.out.print(" ");
            if (i == pivot) {
                System.out.print("[" + a[i] + "]");
            } else {
                System.out.print(a[i]);
            }
        }
        
        System.out.println();
    }

    static int partition(int[] a, int p, int r) {
        int x = a[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (a[j] <= x) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, r);
        return i + 1;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
