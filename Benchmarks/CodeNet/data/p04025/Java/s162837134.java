import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Main main = new Main();

            main.solveA(sc);

        }
    }

    void solveA(Scanner sc) {
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int min = Integer.MAX_VALUE;
        for (int i = -100; i < 100; i++) {
            int sum = 0;
            for (int num : list) {
                sum += Math.pow(num - i, 2);
            }
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }

}
