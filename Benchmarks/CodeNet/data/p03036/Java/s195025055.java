import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer r = sc.nextInt(); // 2 < 5
        Integer D = sc.nextInt(); // 1 <= 1000
        Integer x = sc.nextInt(); // D <= 200

        List<Integer> results = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            int tmp = r * x - D;
            results.add(tmp);
            x = tmp;
        }

        results.stream().peek(System.out::println).count();
    }

}
