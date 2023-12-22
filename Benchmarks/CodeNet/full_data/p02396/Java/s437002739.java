import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by khrom on 2017/06/12.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();
        while (true) {
            int i = scanner.nextInt();
            if (i == 0) break;
            numList.add(i);
        }
        for (int i = 0; i < numList.size(); i++) {
            System.out.println("Case " + i + ": " + numList.get(i));
        }
    }
}