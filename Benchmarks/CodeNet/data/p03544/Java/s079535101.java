import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);

        for (int i = 2; i <= n; i++) {
            int twoBefore = list.get(i - 2);
            int oneBefore = list.get(i - 1);
            list.add(twoBefore + oneBefore);
        }

        System.out.println(list.get(n));
    }
}