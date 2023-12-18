import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        try (Scanner scanner = new Scanner(System.in)){
            int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int w = input[0];
            int h = input[1];
            int x = input[2];
            int y = input[3];

            System.out.println(String.format("%f %d", (double)(w * h) / 2.0, w / 2 == x && h / 2 == y ? 1 : 0));
        }

    }
}
