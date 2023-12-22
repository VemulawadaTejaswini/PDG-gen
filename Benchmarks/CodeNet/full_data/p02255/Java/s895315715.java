import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //MaximumProfit.solve();

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] a = Arrays.stream(scanner.nextLine().split(" ", 0))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] sortedA = insertionSort(a, n);
        printIntArray(sortedA, " ");
    }

    private static int[] insertionSort(int[] a, int length) {
        for (int i = 1; i < length; i++) {
            printIntArray(a, " ");
            int v = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > v) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = v;
        }
        return a;
    }

    private static int min(int x, int y) {
        return x < y ? x : y;
    }

    private static int max(int x, int y) {
        return x < y ? y : x;
    }

    private static void printIntArray(int[] array, String delimeter) {
        System.out.println(Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(delimeter)));
    }
}

