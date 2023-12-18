import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count3200 = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a < 3200) {
                set.add(a/400);
            } else {
                count3200++;
            }
        }

        int min = 1;
        int max =count3200;
        if (set.size() != 0) {
            min = set.size();
            max = Math.min(8, set.size() + count3200);
        }
        System.out.println(min + " "+ max);

    }
}