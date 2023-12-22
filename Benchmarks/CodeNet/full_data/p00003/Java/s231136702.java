import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int limit = Integer.parseInt(scanner.next());
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < 3; j++) {
                list.add(Integer.parseInt(scanner.next()));
            }
            Collections.sort(list);
            Collections.reverse(list);
            int a = list.get(0);
            int b = list.get(1);
            int c = list.get(2);
            double cosA = getCosA(a, b, c);
            if (cosA == 0.0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            list.clear();
        }
    }

    private static double getCosA(int a, int b, int c) {
        return (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);
    }
}