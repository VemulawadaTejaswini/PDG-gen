import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by khrom on 2017/06/15.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> resList = new ArrayList<>();
        while (true) {
            int left = scanner.nextInt();
            String enzan = scanner.next();
            int right = scanner.nextInt();
            if (enzan.equals("?")) break;
            switch (enzan) {
                case "+":
                    resList.add(left + right);
                    break;
                case "-":
                    resList.add(left - right);
                    break;
                case "/":
                    resList.add(left / right);
                    break;
                case "*":
                    resList.add(left * right);
                    break;
            }
        }
        resList.forEach(System.out::println);
    }
}