import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        selectionSort(a);
    }

    private static void selectionSort(int[] a) {
        int n = a.length;
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int swap = a[i];
                a[i] = a[min];
                a[min] = swap;
                swaps++;
            }
        }
        System.out.println(printArray(a));
        System.out.println(swaps);
    }

    private static String printArray(int[] a) {
        int length = a.length;
        String arrayString = "";
        for (int i = 0; i < length - 1; i++) {
            arrayString = arrayString + a[i] + " ";
        }
        arrayString = arrayString + a[length - 1];
        return arrayString;
    }
}
