import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 入力処理
        Scanner sc = new Scanner(System.in);

        int[] houses = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int min;
        int max;
        if (houses[0] < houses[1]) {
            min = houses[0];
            max = houses[1];
        } else {
            min = houses[1];
            max = houses[0];
        }

        for (int i = min; i <= max; i++) {
            if (i == houses[2]) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}
