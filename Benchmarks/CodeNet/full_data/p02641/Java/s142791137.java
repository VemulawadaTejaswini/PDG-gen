import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println(x);
            System.exit(0);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);

        for (int diff = 1; diff <= 200; diff++) {
            //before
            int b = list.indexOf(x - diff);
            if (b < 0) {
                System.out.println(x - diff);
                System.exit(0);
            }
            //after
            int a = list.indexOf(x + diff);
            if (a < 0) {
                System.out.println(x + diff);
                System.exit(0);
            }
        }
        System.out.println(0);
    }
}