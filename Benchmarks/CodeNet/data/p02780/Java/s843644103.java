import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int selected = scanner.nextInt();

        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = scanner.nextInt();
        }

        int[] maxArray = new int[selected];
        double maxSum = 0;
        for (int i = 0; i <= size - selected; i++) {
            double current = 0;
            for (int j = i; j < i + selected; j++) {
                current += input[j];
            }
            if (current > maxSum) {
                maxArray = Arrays.copyOfRange(input, i, i+selected);
                maxSum = current;
            }
        }

        double answer = 0;
        for (int j = 0; j < maxArray.length; j++) {
            double current = maxArray[j];
            double sum = (current * (current + 1)) / 2 / current;
            answer += sum;
        }
        System.out.println(answer);
    }
}