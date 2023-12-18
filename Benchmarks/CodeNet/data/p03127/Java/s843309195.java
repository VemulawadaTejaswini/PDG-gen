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
        boolean b = true;
        while (b) {
            b = false;
            list.sort((val1, val2) -> val2 - val1);
            for (int i = list.size() - 1; i > 0; i--) {
                if (list.get(i).equals(list.get(i - 1))) {
                    list.remove(i);
                }
            }
            for (int i = 0; i < list.size() - 1; i++)
                for (int r = i + 1; r < list.size(); r++)
                    while (list.get(r) < list.get(i)) {
                        list.set(i, list.get(i) - list.get(r));
                        b = true;
                    }
        }
        int min = Integer.MAX_VALUE;
        for (Integer i : list)
            if (i < min) min = i;
        System.out.println(min);
    }
}