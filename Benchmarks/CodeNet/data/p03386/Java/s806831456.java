
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < k; i++) {
                set.add(Math.min(b, a + i));
                set.add(Math.max(a, b - i));
            }
            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            for (int i : list) {
                System.out.println(i);
            }
        }
    }
}
