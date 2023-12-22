import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] a = scanIntArray(scanner);

        int length = a.length;
        int swapCount = 0;
        for (int i = 0; i < length ; i++) {
            int minIndex = i;
            for (int j = i; j < length ; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            if (a[i] > a[minIndex]) {
                swap(a, i, minIndex);
                swapCount++;
            }
        }

        printIntArray(a, " ");
        System.out.println(swapCount);
    }

    private static void printIntArray(int[] array, String delimeter) {
        System.out.println(Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(delimeter)));
    }

    private static int[] scanIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ", 0))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}

