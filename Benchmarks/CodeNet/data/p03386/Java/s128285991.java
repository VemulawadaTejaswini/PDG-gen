import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        HashSet set = new HashSet<>(k * 2);
        for (int i = 0; i < k; i++) {
            if (a + i > b) {
                break;
            }
            set.add(a + i);
        }
        for (int i = 0; i < k; i++) {
            if (b - i < a) {
                break;
            }
            set.add(b - i);
        }
        List<Integer> list = new ArrayList(set);
        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}