import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<Integer> list = new ArrayList(N);

        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        Collections.sort(list, Collections.reverseOrder());

        int aTotal = 0;
        int bTotal = 0;

        for (int i = 0; i < N; i++) {
            if ((i & 1) == 0) {
                aTotal += list.get(i);
            } else {
                bTotal += list.get(i);
            }
        }

        System.out.println(aTotal - bTotal);
    }
}