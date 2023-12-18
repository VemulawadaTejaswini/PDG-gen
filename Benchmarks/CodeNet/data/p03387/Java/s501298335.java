import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> as = new ArrayList(3);
        as.add(scanner.nextInt());
        as.add(scanner.nextInt());
        as.add(scanner.nextInt());
        Collections.sort(as, Collections.reverseOrder());
        int count = 0;
        while(as.get(0) != as.get(1)) {
            as.set(1, as.get(1) + 1);
            as.set(2, as.get(2) + 1);
            count++;
        }
        count += (as.get(0) - as.get(2)) / 2 + (as.get(0) - as.get(2)) % 2 * 2;
        System.out.println(count);
    }
}

