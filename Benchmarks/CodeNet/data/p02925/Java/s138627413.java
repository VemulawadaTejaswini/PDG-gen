
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final MyList[] combination = new MyList[n];
        final List<Integer> indexList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            indexList.add(i);
            combination[i] = new MyList();
            for (int j = 0; j < n - 1; j++) {
                combination[i].list.add(scanner.nextInt() - 1);
            }
        }

        int counter = 0;
        while (true) {
            counter++;

            final Set<Integer> skip = new HashSet<>();
            boolean doneOnceFlag = false;
            for (int index = 0; index < indexList.size(); index++) {
                final int i = indexList.get(index);
                if (combination[i].list.isEmpty()) {
                    indexList.remove(index);
                    index--;
                    continue;
                }
                if (skip.contains(i)) {
                    continue;
                }

                final Integer opponent = combination[i].list.get(0);

                if (skip.contains(opponent)) {
                    continue;
                }

                if (combination[opponent].list.get(0) == i) {
                    combination[i].list.remove(0);
                    combination[opponent].list.remove(0);
                    skip.add(i);
                    skip.add(opponent);
                    doneOnceFlag = true;
                }
            }

            if (indexList.isEmpty()) {
                System.out.println(counter - 1);
                return;
            }

            if (!doneOnceFlag) {
                System.out.println(-1);
                return;
            }
        }
    }

    static class MyList {
        final List<Integer> list = new ArrayList<>();
    }
}
