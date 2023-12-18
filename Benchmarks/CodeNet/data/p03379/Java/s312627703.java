import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            List<Integer> soutedList = new ArrayList<>();
            List<Integer> originalList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                soutedList.add(x);
                originalList.add(x);
            }

            Collections.sort(soutedList);

            int left = soutedList.get(n / 2 - 1);
            int right = soutedList.get(n / 2);

            for (int i = 0; i < n; i++) {
                int removedElement = originalList.get(i);
                if (removedElement <= left) {
                    System.out.print(right);
                } else {
                    System.out.print(left);
                }
                System.out.println(" ");
            }

        }
    }

}
