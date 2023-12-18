import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        final Integer[] heights = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        int max = -1;
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (max <= heights[i]) {
                count++;
            }

            max = Math.max(max, heights[i]);
        }

        System.out.println(count);
    }
}
