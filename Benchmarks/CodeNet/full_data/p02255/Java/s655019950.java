import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(scanner.next());
        }

        for (int i = 1; i < size; i++) {
            System.out.println(concat(array));
            int value = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > value) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = value;
        }
        System.out.println(concat(array));
    }

    private static String concat(int[] array) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 0; i < array.length; i++) {
            joiner.add(String.valueOf(array[i]));
        }
        return joiner.toString();
    }
}