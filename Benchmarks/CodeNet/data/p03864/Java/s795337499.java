import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int totalBoxes = scanner.nextInt();
        final int maxSum = scanner.nextInt();

        final int[] boxes = new int[totalBoxes];
        for (int i = 0; i < totalBoxes; i++) {
            boxes[i] = scanner.nextInt();
        }

        int l_counter = 0;
        int l_prev = 0;

        for (int i = totalBoxes - 1; i >= 0; i--) {
            if ((boxes[i] + l_prev) > maxSum) {
                l_counter += boxes[i] + l_prev - maxSum;
                l_prev = maxSum - l_prev;
            } else {
                l_prev = boxes[i];
            }
        }

        int r_counter = 0;
        int r_prev = 0;

        for (int i = 0; i < totalBoxes; i++) {
            if ((boxes[i] + r_prev) > maxSum) {
                r_counter += boxes[i] + r_prev - maxSum;
                r_prev = maxSum - r_prev;
            } else {
                r_prev = boxes[i];
            }
        }

        System.out.println(Math.min(r_counter, l_counter));
    }
}
