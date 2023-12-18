
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Set<Integer> possibles = new HashSet<>();
        possibles.add(1);
        int[] counts = new int[n];
        for (int i = 0; i < n; i++) {
            counts[i] = 1;
        }
        for (int i = 0; i < m; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            if (possibles.contains(from)) {
                possibles.add(to);
            }
            counts[from - 1]--;
            counts[to - 1]++;
            if (counts[from - 1] == 0) {
                possibles.remove(from);
            }
        }
        System.out.println(possibles.size());
    }
}