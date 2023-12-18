import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> inputs = new TreeSet<>(Collections.reverseOrder());
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        long all = 0;
        scanner.nextLine();
        int a;
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            inputs.add(a);
            all += a;
        }
        int c = 0;
        int pick = 0;
        for (Integer input : inputs) {
            if (c < n) {
                if (all / (4 * m) <= input) {
                    pick++;
                } else {
                }
                c++;
            } else {
                if (pick >= m) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                return;
            }
        }
    }

}