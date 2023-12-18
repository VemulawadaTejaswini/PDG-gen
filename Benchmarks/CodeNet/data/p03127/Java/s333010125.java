import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }
        list.sort((val1, val2) -> val1 - val2);
        int b = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int a = list.get(i);
            int r = a % b;
            while (r != 0) {
                a = b;
                b = r;
                r = a % b;
            }
        }
        System.out.println(b);
    }
}