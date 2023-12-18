
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] firstCoordinate = new int[size];
        int[] secondCoordinate = new int[size];
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            firstCoordinate[i] = scanner.nextInt();
            secondCoordinate[i] = scanner.nextInt();
            array[i] = i + 1;
        }

        double sum = 0;
        boolean isFinished = false;
        int counter = 0;
        while (!isFinished) {
            counter++;

            for (int h = 0; h < size - 1; h++) {
                double temp = (Math.pow((double) firstCoordinate[array[h] - 1] - (double) firstCoordinate[array[h + 1] - 1], 2))
                        + (Math.pow((double) secondCoordinate[array[h] - 1] - (double) secondCoordinate[array[h + 1] - 1], 2));
                double tempSqrt = Math.sqrt(temp);
                sum += tempSqrt;
            }

            int first = -1;
            for (int i = array.length - 1; i > 0; i--) {
                if (array[i] > array[i - 1]) {
                    first = i - 1;
                    break;
                }
            }
            if (first == -1) {
                isFinished = true;
            }
            int second = first + 1;
            if (first != -1) {
                for (int i = first + 1; i < array.length; i++) {
                    if (array[i] > array[first] && array[i] < array[second]) {
                        second = i;
                    }
                }
                if (second != first) {
                    swap(array, first, second);
                    Arrays.sort(array, first + 1, array.length);
                }
            }
        }

        System.out.println(sum / counter);
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
