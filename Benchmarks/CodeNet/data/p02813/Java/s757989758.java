import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] first = new int[arraySize];
        int[] second = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            first[i] = scanner.nextInt();
        }
        for (int i = 0; i < arraySize; i++) {
            second[i] = scanner.nextInt();
        }

        int[] sortedArray = first.clone();
        Arrays.sort(sortedArray);
        int firstNumber = findPermutationNumber(sortedArray, first);
        Arrays.sort(sortedArray);
        int secondNumber = findPermutationNumber(sortedArray, second);
        int answer = firstNumber - secondNumber;

        if (answer < 0) {
            System.out.println(answer * -1);
        } else {
            System.out.println(answer);
        }
    }

    private static int findPermutationNumber(int[] sortedArray, int[] unsortedArray) {
        boolean isFinished = false;
        int counter = 1;
        while (!isFinished) {
            if (Arrays.equals(sortedArray, unsortedArray)) {
                return counter;
            }
            int first = -1;
            for (int i = sortedArray.length - 1; i > 0; i--) {
                if (sortedArray[i] > sortedArray[i - 1]) {
                    first = i - 1;
                    break;
                }
            }
            if (first == -1) {
                isFinished = true;
            }
            int second = first + 1;
            if (first != -1) {
                for (int i = first + 1; i < sortedArray.length; i++) {
                    if (sortedArray[i] > sortedArray[first] && sortedArray[i] < sortedArray[second]) {
                        second = i;
                    }
                }
                if (second != first) {
                    swap(sortedArray, first, second);
                    Arrays.sort(sortedArray, first + 1, sortedArray.length);
                }
            }
            counter++;
        }
        return -1;
    }

    private static void printAllPermutations(int[] array) {
        boolean isFinished = false;
        while (!isFinished) {
            System.out.println(Arrays.toString(array));
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
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
