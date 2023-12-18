import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        try (Scanner scanner = new Scanner(System.in)){
            int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int n = input[0];
            int x = input[1];

            int sum = 0;
            int count = 1;
            for (int i : Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray()) {
                sum += i;
                if (sum > x) break;
                count++;
            }



            System.out.println(count);
        }

    }
}
