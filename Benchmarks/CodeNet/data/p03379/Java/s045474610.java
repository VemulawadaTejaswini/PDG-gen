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
                int x = Integer.parseInt(sc.next());
                soutedList.add(x);
                originalList.add(x);
            }

            Collections.sort(soutedList);

            int left = soutedList.get(n / 2 - 1);
            int right = soutedList.get(n / 2);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                int removedElement = originalList.get(i);
                if (removedElement <= left) {
                    // System.out.print(right);
                    sb.append(right);
                } else {
                    // System.out.print(left);
                    sb.append(left);
                }
                // System.out.println(" ");
                sb.append("\n");
            }
            System.out.println(sb.toString());

        }
    }

}
