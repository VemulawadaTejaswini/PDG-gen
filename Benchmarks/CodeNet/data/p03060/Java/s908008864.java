import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().split("")[0]);

        int[] values = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] costs = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (values[i] >= costs[i]) {
                sum += (values[i] - costs[i]);
            }
        }
        System.out.println(sum);
    }
}
