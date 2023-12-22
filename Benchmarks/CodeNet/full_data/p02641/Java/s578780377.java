import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] p = new int[n];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            set.add(p[i]);
        }
        if (n == 0) {
            System.out.println(x);
            return;
        }
        for (int i = 0; i <= 100; i++) {
            if (!set.contains(x - i)) {
                System.out.println(x - i);
                return;
            }
            if (!set.contains(x + i)) {
                System.out.println(x + i);
                return;
            }
        }
    }

}
