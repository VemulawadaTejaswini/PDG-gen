import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();

        insertionSort(A, N);
    }
    private static void insertionSort(int[] a, int n) {
        p(a);
        for (int i = 1; i < n; i++) {
            int v = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > v) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = v;
            p(a);
        }
    }
    private static void p(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print((i == 0) ? a[i] : " " + a[i]);
        System.out.println();
    }
}

