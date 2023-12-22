import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 0) {
                count = 0;
                continue;
            }
            count++;
            list.add(count);
        }

        if (list.isEmpty()) {
            System.out.println(1);
        } else {
            System.out.println(Collections.max(list) + 1);
        }
    }
}
