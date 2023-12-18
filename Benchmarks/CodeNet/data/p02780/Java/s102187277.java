import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int selected = scanner.nextInt();

        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = scanner.nextInt();
        }

        double maxSum = 0;
        int[] maxArray = new int[selected];
        for (int i = 0; i <= size - selected; i++) {
            int[] currentArray = new int[selected];
            System.arraycopy(input, i, currentArray, 0, selected);
            double current = IntStream.of(currentArray).sum();
            if (current > maxSum) {
                maxArray = currentArray;
                maxSum = current;
            }
        }

        double answer = 0;
        for (double current : maxArray) {
            answer += (current * (current + 1)) / 2 / current;
        }
        System.out.println(answer);
    }
}
