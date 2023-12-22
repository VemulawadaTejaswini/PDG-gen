import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by khrom on 2017/06/12.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\s");
        List<String> numList = new ArrayList<>();
        while (true) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x == 0 && y == 0) {
                break;
            } else {
                numList.add(y + " " + x);
            }
        }
        numList.forEach(s -> System.out.println(s));
    }
}