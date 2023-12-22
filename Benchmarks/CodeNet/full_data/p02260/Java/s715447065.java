import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int swapCount = 0;
        for (int i = 0; i < n; i++) {
            int minj = i;
            for (int j = i; j < n; j++) {
                if (a[j] < a[minj]) {
                    minj = j;
                }
            }
            if (i != minj) {
                swap(a, i, minj);
                swapCount++;
            }
        }
        printlnArray(a);
        System.out.println(swapCount);
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void printlnArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(a[a.length - 1]);
    }
}
