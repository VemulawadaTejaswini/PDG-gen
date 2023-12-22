import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(sc.nextLong());

        if (list.contains(0L)) {
            System.out.println(0);
            return;
        }

        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= list.get(i);
            if (result > 1000000000000000000L) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(result);
    }
}
